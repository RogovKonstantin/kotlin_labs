package org.example

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Locale

fun main() {
    println(calculateDiscountPrice(1000.00, 15.0))
}

fun calculateDiscountPrice(originalPrice: Double, discountPercent: Double): Double {
    val discountAmount = originalPrice * (discountPercent / 100)
    val finalPrice = originalPrice - discountAmount
    val df = DecimalFormat("#.##", DecimalFormatSymbols(Locale.US))
    return df.format(finalPrice).toDouble()
}