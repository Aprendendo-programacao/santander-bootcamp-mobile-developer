package me.gabreuw.lista_de_contatos

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter : RecyclerView.Adapter<ContactAdapter.ContactAdapterViewHolder>() {

    private val contactList: MutableList<Contact> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapterViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ContactAdapterViewHolder, position: Int) {
        holder.bind(contactList[position])
    }

    override fun getItemCount() = contactList.size

    class ContactAdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(contact: Contact) {

        }

    }

}