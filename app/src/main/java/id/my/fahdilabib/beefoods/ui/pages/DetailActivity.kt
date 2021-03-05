package id.my.fahdilabib.beefoods.ui.pages

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import id.my.fahdilabib.beefoods.core.Food
import id.my.fahdilabib.beefoods.databinding.ActivityDetailBinding
import id.my.fahdilabib.beefoods.utils.Helper

class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_ITEM = "extra-item"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDetailBinding.inflate(layoutInflater)

        val extraItem = intent.getParcelableExtra<Food>(EXTRA_ITEM)

        binding.apply {
            if (extraItem != null) {
                tvItemName.text = extraItem.name
                tvDetailPrice.text = Helper.rupiah(extraItem.price.toDouble())
                tvDetailDesc.text = extraItem.desc

                ratingBar.rating = extraItem.rate

                Glide.with(baseContext)
                    .load(extraItem.img)
                    .into(ivDetailImg)
            }
        }

        setContentView(binding.root)
    }
}