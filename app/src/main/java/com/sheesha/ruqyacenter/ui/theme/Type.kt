package com.sheesha.ruqyacenter.ui.theme


import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.sheesha.ruqyacenter.R

// For surah name aya numbers
val Typography = Typography(
    titleSmall = TextStyle(
        fontFamily = FontFamily(Font(R.font.playfair)),
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp ,
        lineHeight = 20.sp,
        letterSpacing = 0.5.sp
    ),

    bodyMedium = TextStyle(
        fontFamily = FontFamily(Font(R.font.amiri)),
        fontWeight = FontWeight.Normal,
        fontSize = 26.sp ,
        lineHeight = 40.sp,
        letterSpacing = 5.sp
    ),
    bodySmall = TextStyle(
        fontFamily = FontFamily(Font(R.font.meriiweather)),
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp ,
        lineHeight = 24.sp,
        letterSpacing = 0.25.sp
    )

)