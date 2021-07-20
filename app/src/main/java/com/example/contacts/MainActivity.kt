package com.example.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvContacts:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayContacts()
    }
    fun displayContacts(){
        var contactsList= listOf<Contact>(
            Contact("esther","esther@gmail.com","0678876655545","https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8Z2lybHN8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
            Contact("phiphi","phiphi@gmail.com","07887665574","https://images.unsplash.com/photo-1513207565459-d7f36bfa1222?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTJ8fGdpcmxzfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
            Contact("titus","titus@gmail.com","079887665524","https://images.unsplash.com/photo-1604436122917-66306388da12?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mjh8fGdpcmxzfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
            Contact("Sincere","sincereahereza@gmail.com","07588766565845","https://images.unsplash.com/photo-1599900554895-5e0fc7bbc9c6?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mjd8fGdpcmxzfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
            Contact("janet","anyijukire@gmail.com","07985643289","https://images.unsplash.com/photo-1610565095901-21513d756115?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MzB8fGdpcmxzfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
            Contact("Belyse","belyse@gmail.com","07789468934","https://images.unsplash.com/photo-1557864691-fa78b6d486c2?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mzl8fGdpcmxzfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"),
            Contact("Timothy","timo@gmail.com","25467898990989","https://images.unsplash.com/photo-1601288496920-b6154fe3626a?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NDB8fGdpcmxzfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60")

        )
        rvContacts=findViewById(R.id.rvContacts)
        var contactAdapter=ContactsAdapter(contactsList,baseContext)
        rvContacts.layoutManager= LinearLayoutManager(baseContext)
        rvContacts.adapter=contactAdapter

    }
}

