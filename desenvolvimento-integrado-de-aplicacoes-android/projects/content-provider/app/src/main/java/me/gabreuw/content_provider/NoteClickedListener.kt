package me.gabreuw.content_provider

import android.database.Cursor

interface NoteClickedListener {

    fun noteClickedItem(cursor: Cursor)

    fun noteRemoveItem(cursor: Cursor?)

}