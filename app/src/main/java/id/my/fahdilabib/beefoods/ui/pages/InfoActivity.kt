package id.my.fahdilabib.beefoods.ui.pages

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.my.fahdilabib.beefoods.databinding.ActivityInfoBinding

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityInfoBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}