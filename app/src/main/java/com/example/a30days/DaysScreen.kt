package com.example.a30days

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.a30days.model.Day
import com.example.a30days.ui.theme.Typography

@Composable
fun DaysItem(day: Day, modifier: Modifier = Modifier) {

    Card(elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = stringResource(day.indicator), style = Typography.bodyMedium)
            Text(text = stringResource(day.tip), style = Typography.bodyLarge)
            Image(painter = painterResource(day.imgResourceId), contentDescription = null)
            Text(text = stringResource(id = day.description), style = Typography.bodyMedium)
        }
    }
}