package me.gabreuw.lista_de_contatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
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

    private fun showToast(message: String) =
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater

        inflater.inflate(R.menu.menu, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean =
        when (item.itemId) {
            R.id.item_menu_1 -> {
                showToast("Exibindo item de menu 1")
                true
            }
            R.id.item_menu_2 -> {
                showToast("Exibindo item de menu 2")
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
}