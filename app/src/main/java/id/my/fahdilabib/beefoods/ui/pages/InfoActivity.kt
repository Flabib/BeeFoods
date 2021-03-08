package id.my.fahdilabib.beefoods.ui.pages

import android.graphics.text.LineBreaker.JUSTIFICATION_MODE_INTER_WORD
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.my.fahdilabib.beefoods.databinding.ActivityInfoBinding

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityInfoBinding.inflate(layoutInflater)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            binding.myDesc.justificationMode = JUSTIFICATION_MODE_INTER_WORD
            binding.myName.justificationMode = JUSTIFICATION_MODE_INTER_WORD
            binding.myJob.justificationMode = JUSTIFICATION_MODE_INTER_WORD
        }

        setContentView(binding.root)
    }
}