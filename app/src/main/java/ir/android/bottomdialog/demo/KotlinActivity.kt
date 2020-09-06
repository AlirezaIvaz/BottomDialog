package ir.android.bottomdialog.demo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import ir.android.bottomdialog.BottomDialog

class KotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
    }
    fun sample(view: View?) {
        BottomDialog.Builder(this)
            .setTitle("Awesome!")
            .setContent("Glad to see you like BottomDialogs! If you're up for it, we would really appreciate you reviewing us.")
            .setPositiveText("Google Play")
            .setNegativeText("Close")
            .show()
    }
    fun sampleCustomView(view: View?) {
        val inflater = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val customView = inflater.inflate(R.layout.bottomdialog_layout, null)
        BottomDialog.Builder(this)
            .setTitle("Awesome!")
            .setContent("Glad to see you like BottomDialogs! If you're up for it, we would really appreciate you reviewing us.")
            .setCustomView(customView)
            .setPositiveText("Google Play")
            .setNegativeText("Close")
            .show()
    }
}