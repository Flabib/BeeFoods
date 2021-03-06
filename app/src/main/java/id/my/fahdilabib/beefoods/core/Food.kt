package id.my.fahdilabib.beefoods.core

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Food(
    var name : String = "",
    var desc : String = "",
    var price : Int = 0,
    var rate : Float = 0F,
    var img : Int = 0
) : Parcelable