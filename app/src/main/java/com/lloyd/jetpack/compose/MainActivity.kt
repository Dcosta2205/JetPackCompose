package com.lloyd.jetpack.compose

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.lloyd.jetpack.compose.textviews.SimpleTextViewActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScrollableColumn {
                customButton(
                    intent = Intent(this@MainActivity, SimpleTextViewActivity::class.java),
                    "Simple Text"
                )
            }
        }
    }

    /**
     * This is a composable function which will create a Button and handle click and other parameters
     */
    @Composable
    private fun customButton(intent: Intent, buttonText: String) {
        Button(
            /*
            onClick will do the same behaviour like Button.setOnClickListener{}
             */
            onClick = {
                startActivity(intent)
            },
            /*
            modifier here is used to decorate the view like setting the button width as fillMaxSize() (same as match_parent)
            and also setting the padding
             */
            modifier = Modifier.padding(16.dp).fillMaxSize(),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text(
                /*
                text = buttonText will set the text inside the button
                 */
                text = buttonText,

                /*
                textAlign is used to align the text inside the button
                 */
                textAlign = TextAlign.Center
            )
        }
    }

}