package me.gabreuw.content_provider

import android.database.Cursor
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import me.gabreuw.content_provider.database.NotesDatabaseHelper.Companion.COLUMN_DESCRIPTION
import me.gabreuw.content_provider.database.NotesDatabaseHelper.Companion.COLUMN_TITLE

class NotesAdapter(
    private val listener: NoteClickedListener
) : RecyclerView.Adapter<NotesViewHolder>() {

    private var mCursor: Cursor? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesViewHolder =
        NotesViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.note_item, parent, false)
        )

    override fun onBindViewHolder(holder: NotesViewHolder, position: Int) {
        mCursor?.moveToPosition(position)

        holder.noteTitle.text = mCursor?.getString(
            mCursor?.getColumnIndex(COLUMN_TITLE) as Int
        )
        holder.noteDescription.text = mCursor?.getString(
            mCursor?.getColumnIndex(COLUMN_DESCRIPTION) as Int
        )

        holder.noteButtonRemove.setOnClickListener {
            mCursor?.moveToPosition(position)
            listener.noteRemoveItem(mCursor)
            notifyDataSetChanged()
        }

        holder.itemView.setOnClickListener { listener.noteRemoveItem(mCursor) }
    }

    override fun getItemCount(): Int = mCursor?.count ?: 0

    fun setCursor(newCursor: Cursor?) {
        mCursor = newCursor
        notifyDataSetChanged()
    }
}

class NotesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val noteTitle: TextView = itemView.findViewById(R.id.note_title)
    val noteDescription: TextView = itemView.findViewById(R.id.note_description)
    val noteButtonRemove: Button = itemView.findViewById(R.id.note_button_remove)

}