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

    override fun getType(uri: Uri): String? = throw UnsupportedOperationException("Uri não implementado!")

    override fun insert(uri: Uri, values: ContentValues?): Uri? {
        TODO("Implement this to handle requests to insert a new row.")
    }

    override fun query(
        uri: Uri, projection: Array<String>?, selection: String?,
        selectionArgs: Array<String>?, sortOrder: String?
    ): Cursor? {
        TODO("Implement this to handle query requests from clients.")
    }

    override fun update(
        uri: Uri, values: ContentValues?, selection: String?,
        selectionArgs: Array<String>?
    ): Int {
        TODO("Implement this to handle requests to update one or more rows.")
    }

    companion object {
        const val AUTHORITY = "me.gabreuw.content_provider.provider"

        const val NOTES = 1
        const val NOTES_BY_ID = 2

        val BASE_URI = Uri.parse("content://$AUTHORITY")
        val URI_NOTES = Uri.withAppendedPath(BASE_URI, "notes")
    }
}