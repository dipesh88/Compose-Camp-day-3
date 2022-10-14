package com.project.composecamp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.project.composecamp.ui.theme.ComposeCampTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {

            }
        }
    }
}

@Preview
@Composable
fun TopHeader(totalPerPerson: Double = 61.09){
    Surface(
        modifier = Modifier.fillMaxWidth()
            .height(150.dp)
            .padding(18.dp),
        color = MaterialTheme.colors.primary,
        shape = RoundedCornerShape(CornerSize(12.dp))
    ) {
        Column(
            modifier = Modifier.padding(5.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Total Per Person",w
                color = MaterialTheme.colors.onBackground,
                style = MaterialTheme.typography.h5
            )
            Text(
                text = "$$totalPerPerson",
                color = MaterialTheme.colors.onBackground,
                style = MaterialTheme.typography.h4,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun MyApp(content : @Composable () -> Unit){
    ComposeCampTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            content()
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp {
        TopHeader()
    }
}