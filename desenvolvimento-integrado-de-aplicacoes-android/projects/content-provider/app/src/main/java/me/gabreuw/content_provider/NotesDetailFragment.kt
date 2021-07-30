package me.gabreuw.content_provider

import android.app.Activity
import android.app.Dialog
import android.content.ContentValues
import android.content.DialogInterface
import android.net.Uri
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import me.gabreuw.content_provider.database.NotesDatabaseHelper.Companion.COLUMN_DESCRIPTION
import me.gabreuw.content_provider.database.NotesDatabaseHelper.Companion.COLUMN_TITLE
import me.gabreuw.content_provider.database.NotesProvider.Companion.URI_NOTES

class NotesDetailFragment : DialogFragment(), DialogInterface.OnClickListener {

    private lateinit var noteEditTitle: EditText
    private lateinit var noteEditDescription: EditText

    private var id: Long = 0

    companion object {
        private const val EXTRA_ID = "id"

        fun newInstance(id: Long): NotesDetailFragment {
            val bundle = Bundle()
            bundle.putLong(EXTRA_ID, id)

            val notesFragment = NotesDetailFragment()
            notesFragment.arguments = bundle

            return notesFragment
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val view = activity?.layoutInflater?.inflate(R.layout.note_detail, null)

        noteEditTitle = view?.findViewById(R.id.note_edt_title) as EditText
        noteEditDescription = view.findViewById(R.id.note_edt_description) as EditText

        var newNote = true

        if (arguments != null && arguments?.getLong(EXTRA_ID) != 0L) {
            id = arguments?.getLong(EXTRA_ID) as Long

            val uri = Uri.withAppendedPath(URI_NOTES, id.toString())
            val cursor = activity?.contentResolver?.query(
                uri,
                null,
                null,
                null,
                null
            )

            if (cursor?.moveToNext() as Boolean) {
                newNote = false

                noteEditTitle.setText(cursor.getString(cursor.getColumnIndex(COLUMN_TITLE)))
                noteEditDescription.setText(
                    cursor.getString(
                        cursor.getColumnIndex(
                            COLUMN_DESCRIPTION
                        )
                    )
                )
            }

            cursor.close()
        }

        return AlertDialog.Builder(activity as Activity)
            .setTitle(if (newNote) "Nova mensagem" else "Editar mensagem")
            .setView(view)
            .setPositiveButton("Salvar", this)
            .setNegativeButton("Cancelar", this)
            .create()
    }

    override fun onClick(dialog: DialogInterface?, which: Int) {
        val values = ContentValues()

        values.put(COLUMN_TITLE, noteEditTitle.text.toString())
        values.put(COLUMN_DESCRIPTION, noteEditDescription.text.toString())

        if (id != 0L) {
            val uri = Uri.withAppendedPath(URI_NOTES, id.toString())

            context?.contentResolver?.update(uri, values, null, null)

            return
        }

        context?.contentResolver?.insert(URI_NOTES, values)
    }

}