package com.digitalhouse.hellokotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.content_contact_item.view.*

class ContactAdapter(val contactList : ArrayList<Contact>,
                     val context : Context
) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.content_contact_item, parent, false))
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact = contactList[position]
        holder.textViewName?.text = contact.name
        holder.textViewPhone?.text = contact.phone
    }

    fun addContact(contact: Contact){
        contactList.add(contact)
        notifyDataSetChanged()
    }

}

class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
    val textViewName = view.textviewNameId
    val textViewPhone = view.textviewPhoneId
}
