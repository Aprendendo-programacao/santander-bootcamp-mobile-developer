package me.gabreuw.content_provider.database

import android.content.ContentProvider
import android.content.ContentValues
import android.content.Context
import android.content.UriMatcher
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.net.Uri
import android.provider.BaseColumns
import android.provider.BaseColumns._ID
import me.gabreuw.content_provider.database.NotesDatabaseHelper.Companion.TABLE_NAME
import java.lang.UnsupportedOperationException

class NotesProvider : ContentProvider() {

    private lateinit var mUriMatcher: UriMatcher
    private lateinit var dbHelper: NotesDatabaseHelper

    override fun onCreate(): Boolean {
        mUriMatcher = UriMatcher(UriMatcher.NO_MATCH)

        mUriMatcher.addURI(AUTHORITY, "notes", NOTES)
        mUriMatcher.addURI(AUTHORITY, "notes/#", NOTES_BY_ID)

        if (context != null) {
            dbHelper = NotesDatabaseHelper(context as Context)
        }

        return true
    }

    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<String>?): Int {
        if (mUriMatcher.match(uri) != NOTES_BY_ID) {
            throw UnsupportedOperationException("UIR inválida para exclusão!")
        }

        val db: SQLiteDatabase = dbHelper.writableDatabase
        val affectedLines = db.delete(TABLE_NAME, "$_ID = ?", arrayOf(uri.lastPathSegment))

        db.close()

        context?.contentResolver?.notifyChange(uri, null)

        return affectedLines
    }

    override fun getType(uri: Uri): String? =
        throw UnsupportedOperationException("Uri não implementado!")

    override fun insert(uri: Uri, values: ContentValues?): Uri? {
        if (mUriMatcher.match(uri) != NOTES) {
            throw UnsupportedOperationException("Uri inválida para inserção!")
        }

        val db: SQLiteDatabase = dbHelper.writableDatabase

        val id = db.insert(TABLE_NAME, null, values)
        val insertUri: Uri = Uri.withAppendedPath(BASE_URI, id.toString())

        db.close()

        context?.contentResolver?.notifyChange(uri, null)

        return insertUri
    }

    override fun query(
        uri: Uri,
        projection: Array<String>?,
        selection: String?,
        selectionArgs: Array<String>?,
        sortOrder: String?
    ): Cursor? {
        return when {
            mUriMatcher.match(uri) == NOTES -> {
                val db: SQLiteDatabase = dbHelper.writableDatabase

                val cursor: Cursor = db.query(
                    TABLE_NAME,
                    projection,
                    selection,
                    selectionArgs,
                    null,
                    null,
                    sortOrder
                )
                cursor.setNotificationUri(context?.contentResolver, uri)

                db.close()

                cursor
            }

            mUriMatcher.match(uri) == NOTES_BY_ID -> {
                val db: SQLiteDatabase = dbHelper.writableDatabase

                val cursor: Cursor = db.query(
                    TABLE_NAME,
                    projection,
                    "$_ID = ?",
                    arrayOf(uri.lastPathSegment),
                    null,
                    null,
                    sortOrder
                )
                cursor.setNotificationUri(context?.contentResolver, uri)

                db.close()

                cursor
            }

            else -> throw UnsupportedOperationException("URI não implementada!")
        }
    }

    override fun update(
        uri: Uri, values: ContentValues?, selection: String?,
        selectionArgs: Array<String>?
    ): Int {
        if (mUriMatcher.match(uri) != NOTES_BY_ID) {
            throw UnsupportedOperationException("URI não implementada!")
        }

        val db: SQLiteDatabase = dbHelper.writableDatabase
        val affectedLines = db.update(TABLE_NAME, values, "$_ID = ?", arrayOf(uri.lastPathSegment))

        db.close()

        context?.contentResolver?.notifyChange(uri, null)

        return affectedLines
    }

    companion object {
        const val AUTHORITY = "me.gabreuw.content_provider.provider"

        const val NOTES = 1
        const val NOTES_BY_ID = 2

        val BASE_URI = Uri.parse("content://$AUTHORITY")
        val URI_NOTES = Uri.withAppendedPath(BASE_URI, "notes")
    }
}