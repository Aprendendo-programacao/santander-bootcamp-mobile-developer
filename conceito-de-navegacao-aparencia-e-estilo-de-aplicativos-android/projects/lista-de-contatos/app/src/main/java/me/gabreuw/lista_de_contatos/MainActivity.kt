package me.gabreuw.lista_de_contatos

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.edit
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import me.gabreuw.lista_de_contatos.ContactDetail.Companion.EXTRA_CONTACT

class MainActivity : AppCompatActivity(), ClickItemContactListener {

    private val rvContactList: RecyclerView by lazy {
        findViewById(R.id.rv_contact_list)
    }

    private val adapter = ContactAdapter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.drawer_menu)

        initDrawer()
        fetchContactList()
        bindViews()
    }

    private fun fetchContactList() {
        val contactList = mutableListOf(
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

        getInstanceSharedPreferences().edit {
            putString("contacts", Gson().toJson(contactList))
        }
    }

    private fun getInstanceSharedPreferences() =
        getSharedPreferences("lista_de_contatos.PREFERENCES", MODE_PRIVATE)

    private fun initDrawer() {
        val drawerLayout = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        val toolBar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolBar)

        val toggle = ActionBarDrawerToggle(
            this,
            drawerLayout,
            toolBar,
            R.string.open_drawer,
            R.string.close_drawer
        )

        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
    }

    private fun bindViews() {
        rvContactList.adapter = adapter
        rvContactList.layoutManager = LinearLayoutManager(this)
        updateContactList()
    }

    private fun getContactList(): MutableList<Contact> {
        val contactList = getInstanceSharedPreferences().getString("contacts", "[]")
        val turnsTypes = object : TypeToken<List<Contact>>() {}.type

        return Gson().fromJson(contactList, turnsTypes)
    }

    private fun updateContactList() = adapter.updateContactView(getContactList())

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

    override fun clickItemContact(contact: Contact) {
        val intent = Intent(this, ContactDetail::class.java)
        intent.putExtra(EXTRA_CONTACT, contact)
        startActivity(intent)
    }
}