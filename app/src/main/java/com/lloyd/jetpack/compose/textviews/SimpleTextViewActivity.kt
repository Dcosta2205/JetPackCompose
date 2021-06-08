package com.lloyd.jetpack.compose.textviews

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent

class SimpleTextViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*
        Set content block is used to define the layout of the activity, its used
        in the place of setContentView(R.layout.activity_simpleText).
         */
        setContent {

            /*
            Column is used to arrange the views vertically one after the other and it works
            similar to Linear Layout with vertical orientation.

            modifier is used to decorate or add behavior to UI elements. Here we are telling the
            column to fill the maximum size of the screen

            verticalArrangement we are telling the view to arrange vertically at the center

            horizontal alignment we are telling the view to arrange horizontally at the center
             */
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                simpleText()
            }
        }
    }

    /**
     * This is a composable function and to write any composable function you need to use @Composable annotation
     */

    @Composable
    private fun simpleText() {
        Text(text = "Hey there, This is a Simple Text")
    }
}