package ru.team2.codriver12

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ContactsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)

        // Creating web link activity.
        var webText: TextView = findViewById(R.id.textView8);
        webText.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.consultant.ru/"))
            startActivity(i)
        }
    }
}