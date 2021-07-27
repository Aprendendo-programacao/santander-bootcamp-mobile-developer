package me.gabreuw.lista_de_contatos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(var listener: ClickItemContactListener) :
    RecyclerView.Adapter<ContactAdapter.ContactAdapterViewHolder>() {

    private val contactList: MutableList<Contact> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapterViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.contact_item, parent, false)

        return ContactAdapterViewHolder(view, contactList, listener)
    }

    override fun onBindViewHolder(holder: ContactAdapterViewHolder, position: Int) =
        holder.bind(contactList[position])

    override fun getItemCount() = contactList.size

    fun updateContactView(contactList: MutableList<Contact>) {
        this.contactList.clear()
        this.contactList.addAll(contactList)
        notifyDataSetChanged()
    }

    class ContactAdapterViewHolder(
        itemView: View,
        var contactList: MutableList<Contact>,
        var listener: ClickItemContactListener
    ) : RecyclerView.ViewHolder(itemView) {

        private val tvName: TextView = itemView.findViewById(R.id.tv_name)
        private val tvPhone: TextView = itemView.findViewById(R.id.tv_phone)
        private val ivPhotograph: ImageView = itemView.findViewById(R.id.iv_photograph)

        init {
            itemView.setOnClickListener {
                listener.clickItemContact(contactList[adapterPosition])
            }
        }

        fun bind(contact: Contact) {
            tvName.text = contact.name
            tvPhone.text = contact.phone
        }

    }

}