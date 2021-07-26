package me.gabreuw.lista_de_contatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val rvContactList: RecyclerView by lazy {
        findViewById(R.id.rv_contact_list)
    }

    private val adapter = ContactAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindViews()
        updateContactList()
    }

    private fun bindViews() {
        rvContactList.adapter = adapter
        rvContactList.layoutManager = LinearLayoutManager(this)
    }

    private fun updateContactList() {
        adapter.updateContactView(
            mutableListOf(
                Contact(
                    "Igor Ferrani",
                    "(00) 0000-0000",
                    "img.png"
                ),
                Contact(
                    "Igor Ferrani",
                    "(00) 0000-0000",
                    "img.png"
                )
            )
        )
    }
}