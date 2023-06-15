package com.example.jetpackcomposeui.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen() {
    Box(
        modifier = Modifier
            .background(MainThemeColor)
            .fillMaxSize()

    ) {
        Column {
            WelcomeSection()
            FilterSection(filters = listOf("Trending", "Hot", "new", "top"))
        }

    }
}

@Composable
fun WelcomeSection(
    userName: String = "Brock"
) {
      Row(
          horizontalArrangement = Arrangement.SpaceBetween,
          verticalAlignment = Alignment.CenterVertically,
          modifier = Modifier
              .fillMaxWidth()
              .padding(16.dp)
      ) {
          Column( 
              verticalArrangement = Arrangement.Center
          ) {
               Text(
                   text = "Welcome, $userName",
                   style = MaterialTheme.typography.headlineMedium
               )
              Text(
                  text = "Best place to be here!",
                  style = MaterialTheme.typography.bodyMedium
              )
          }

//          Icon(
//              painter = painterResource(id = androidx.core.R.drawable.notification_template_icon_bg),
//              contentDescription = "Search icon",
//              tint = Color.White,
//              modifier = Modifier.size(26.dp)
//          )
      }
}

@Composable
fun FilterSection (
    filters: List<String>
) {
   var selectedIndex by remember {
       mutableStateOf(0)
   }

    LazyRow {
        items(filters.size) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(start = 20.dp, top = 20.dp, bottom = 20.dp)
                    .clickable {
                        selectedIndex = it
                    }
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color.Blue)
            ) {
                Text(
                    text = filters[it], color = Color.White,
                    modifier = Modifier
                        .padding(start = 20.dp, top = 10.dp, bottom = 10.dp, end = 20.dp)
                )
            }
        }
    }
}













