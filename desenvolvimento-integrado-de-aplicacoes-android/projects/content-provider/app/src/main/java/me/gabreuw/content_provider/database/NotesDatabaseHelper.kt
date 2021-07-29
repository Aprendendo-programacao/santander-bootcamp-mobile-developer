package me.gabreuw.content_provider.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.provider.BaseColumns._ID

class NotesDatabaseHelper(
    context: Context
) : SQLiteOpenHelper(context, "databaseNotes", null, 1) {

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(
            "CREATE TABLE $TABLE_NAME (" +
                    "$_ID INTEGER NOT NULL PRIMARY KEY, " +
                    "$COLUMN_TITLE TEXT NOT NULL, " +
                    "$COLUMN_DESCRIPTION TEXT NOT NULL)"
        )
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {}

    companion object {
        const val TABLE_NAME = "Notes"
        const val COLUMN_TITLE = "title"
        const val COLUMN_DESCRIPTION = "description"
    }

}