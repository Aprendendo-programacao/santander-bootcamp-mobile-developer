package me.gabreuw.content_provider

import android.database.Cursor
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.BaseColumns
import android.provider.BaseColumns._ID
import androidx.loader.app.LoaderManager
import androidx.loader.content.CursorLoader
import androidx.loader.content.Loader
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import me.gabreuw.content_provider.database.NotesDatabaseHelper
import me.gabreuw.content_provider.database.NotesDatabaseHelper.Companion.COLUMN_TITLE
import me.gabreuw.content_provider.database.NotesProvider
import me.gabreuw.content_provider.database.NotesProvider.Companion.URI_NOTES
import java.net.URI

class MainActivity : AppCompatActivity(), LoaderManager.LoaderCallbacks<Cursor> {

    lateinit var noteRecyclerView: RecyclerView
    lateinit var noteAdd: FloatingActionButton

    lateinit var adapter: NotesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        noteAdd = findViewById(R.id.note_add)
        noteAdd.setOnClickListener { }

        adapter = NotesAdapter(object : NoteClickedListener {
            override fun noteClickedItem(cursor: Cursor) {
                val id = cursor.getLong(cursor.getColumnIndex(_ID))
            }

            override fun noteRemoveItem(cursor: Cursor?) {
                val id = cursor?.getLong(cursor.getColumnIndex(_ID))

                contentResolver.delete(
                    Uri.withAppendedPath(URI_NOTES, id.toString()),
                    null,
                    null
                )
            }
        })
        adapter.setHasStableIds(true)

        noteRecyclerView = findViewById(R.id.notes_recycler)
        noteRecyclerView.layoutManager = LinearLayoutManager(this)
        noteRecyclerView.adapter = adapter
    }

    override fun onCreateLoader(id: Int, args: Bundle?): Loader<Cursor> {
        return CursorLoader(this, URI_NOTES, null, null, null, COLUMN_TITLE)
    }

    override fun onLoadFinished(loader: Loader<Cursor>, data: Cursor?) {
        if (data != null) {

        }


    }

    override fun onLoaderReset(loader: Loader<Cursor>) {
        TODO("Not yet implemented")
    }

}