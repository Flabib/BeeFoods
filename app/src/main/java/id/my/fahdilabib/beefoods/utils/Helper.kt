package id.my.fahdilabib.beefoods.utils

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.text.NumberFormat
import java.util.*

class Helper {
    companion object {
        fun applyImage(img: Int, context: Context, imageView: ImageView) {
            Glide.with(context)
                    .apply { RequestOptions().centerCrop() }
                    .load(img)
                    .into(imageView)
        }

        fun rupiah(number: Double): String{
            val localeID =  Locale("id", "ID")
            val numberFormat = NumberFormat.getCurrencyInstance(localeID)

            return numberFormat.format(number).toString().replace("Rp", "Rp ").replace(",00", "")
        }
    }
}