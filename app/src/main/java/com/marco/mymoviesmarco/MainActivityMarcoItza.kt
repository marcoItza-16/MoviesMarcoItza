package com.marco.mymoviesmarco

import android.media.browse.MediaBrowser
import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.outlined.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.graphics.translationMatrix
import coil.compose.rememberImagePainter
import coil.transform.CircleCropTransformation
import com.marco.mymoviesmarco.ui.theme.MoviesMarcoItzaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MoviesMarcoItzaTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    MediaItem()

                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MediaItem() {
    Column {
        Box(
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth()
            ) {
            Image(
                painter = rememberImagePainter(
                    data = "https://cdn.computerhoy.com/sites/navi.axelspringer.es/public/styles/480/public/media/image/2019/03/lenguajes_programacion_odiados_amados_2019.jpg?itok=N85E5HTT" ,
            ),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
            )

            Icon(
                imageVector = Icons.Outlined.PlayArrow,
                contentDescription =null,
                modifier = Modifier.size(92.dp),
                tint = Color.White
            )

        }
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colors.secondary)
                    .padding(16.dp)
            ) {
            Text(
                text ="Title 1",
                style = MaterialTheme.typography.h6
            )

        }
}

@Composable
fun Greeting( name: String, modifier: Modifier = Modifier) {
       Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

//@Preview(showBackground = true, widthDp = 200, heightDp = 100)
@Composable
fun ButtonText() {
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
        text = "Hello World",
        style = MaterialTheme.typography.h4.copy(
            shadow = Shadow(
                offset = Offset(5f, 5f),
                blurRadius = 5f,
                color = Color.Black.copy(alpha = 0.5f)
            )
        )

        )
    }
}

//@Preview(showBackground = true, name = "Android Greeting")
@Composable
fun DefaultPreview() {
    }
}