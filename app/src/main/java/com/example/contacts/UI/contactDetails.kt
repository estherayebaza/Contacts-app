package com.example.contacts.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.example.contacts.R
import com.example.contacts.databinding.ActivityContactDetailsBinding

class ContactDetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityContactDetailsBinding
    lateinit var cvCardView: CardView
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityContactDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            val intent1 = Intent(baseContext, MainActivity::class.java)
            startActivity(intent1)

            val contactId=intent1.getStringExtra("contactId")

            Toast.makeText(baseContext, "These are your contact details", Toast.LENGTH_LONG).show()
        }


    }
}

