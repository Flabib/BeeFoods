package id.my.fahdilabib.beefoods.ui.pages

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import id.my.fahdilabib.beefoods.R
import id.my.fahdilabib.beefoods.core.Food
import id.my.fahdilabib.beefoods.databinding.ActivityDetailBinding
import id.my.fahdilabib.beefoods.utils.Helper

class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_ITEM = "extra-item"
    }

    private lateinit var extraItem: Food

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDetailBinding.inflate(layoutInflater)

        extraItem = intent.getParcelableExtra<Food>(EXTRA_ITEM) as Food

        binding.apply {
            tvItemName.text = extraItem.name
            tvDetailPrice.text = Helper.rupiah(extraItem.price.toDouble())
            tvDetailDesc.text = extraItem.desc

            ratingBar.rating = extraItem.rate

            Glide.with(baseContext)
                .load(extraItem.img)
                .into(ivDetailImg)
        }

        setContentView(binding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.detail_activity_menu, menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.btn_share_menu -> {
                val sendIntent: Intent = Intent().apply {
                    action = Intent.ACTION_SEND
                    type = "text/plain"
                    putExtra(Intent.EXTRA_TEXT, "Hello, now you can buy ${extraItem.name} in Bee Foods!")
                }

                val shareIntent = Intent.createChooser(sendIntent, null)
                startActivity(shareIntent)
            }
        }

        return super.onOptionsItemSelected(item)
    }
}