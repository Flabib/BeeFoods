package id.my.fahdilabib.beefoods.ui.pages

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import id.my.fahdilabib.beefoods.R
import id.my.fahdilabib.beefoods.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var topAnimation : Animation
    private lateinit var bottomAnimation : Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySplashBinding.inflate(layoutInflater)

        topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)

        binding.logo.animation = topAnimation
        binding.label.animation = bottomAnimation

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 3000)

        setContentView(binding.root)
    }
}