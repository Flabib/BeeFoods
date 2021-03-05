package id.my.fahdilabib.beefoods.ui.pages

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import id.my.fahdilabib.beefoods.core.FoodData
import id.my.fahdilabib.beefoods.databinding.ActivityMainBinding
import id.my.fahdilabib.beefoods.ui.adapter.FoodViewHolder

class MainActivity : AppCompatActivity() {

    private val foodViewHolder = FoodViewHolder()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)

        foodViewHolder.listData = FoodData.all()
        foodViewHolder.onItemClick = {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_ITEM, it)

            startActivity(intent)
        }

        binding.rvContent.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = foodViewHolder
            itemAnimator = DefaultItemAnimator()
            hasFixedSize()
        }

        setContentView(binding.root)
    }
}