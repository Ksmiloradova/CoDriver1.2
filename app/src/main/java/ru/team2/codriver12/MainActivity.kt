package ru.team2.codriver12

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Creating method for initiating contacts window.
        var button: ImageView = findViewById(R.id.imageView)
        button.setOnClickListener {
            val intent = Intent(this@MainActivity, ContactsActivity::class.java)
            startActivity(intent)
        }

        // Creating web link activity.
        var textRuleLink: TextView = findViewById(R.id.textRuleLink)
        textRuleLink.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.consultant.ru/document/cons_doc_LAW_280037/"))
            startActivity(i)
        }
    }
}