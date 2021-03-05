package id.my.fahdilabib.beefoods.utils

import android.app.Activity
import android.content.Context
import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.core.graphics.drawable.DrawableCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.text.NumberFormat
import java.util.*

class Helper {
    companion object {
        fun changeDrawableColor(activity : Activity, id : Int, color : Int) {
            val baseIconProfile : Drawable? = ResourcesCompat.getDrawable(activity.resources, id, null)
            val iconProfile : Drawable? = baseIconProfile?.let { DrawableCompat.wrap(it) }
            iconProfile?.let { DrawableCompat.setTint(it, ContextCompat.getColor(activity.baseContext, color)) }
        }


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