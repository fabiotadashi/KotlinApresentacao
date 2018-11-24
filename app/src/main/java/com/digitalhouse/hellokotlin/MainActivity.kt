package com.digitalhouse.hellokotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val adapter = ContactAdapter(ArrayList(), this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonRegisterId.setOnClickListener { register() }

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        recyclerViewId.adapter = adapter
        recyclerViewId.layoutManager = LinearLayoutManager(this)
    }

    fun register() {
        val contact = Contact(edittextNameId.text.toString(), edittextPhoneId.text.toString())
        adapter.addContact(contact)
    }
}
