package com.example.a30days.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Day(
    @StringRes val indicator: Int,
    @StringRes val tip: Int,
    @StringRes val description: Int,
    @DrawableRes val imgResourceId: Int,
)