import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cronometro.ui.theme.CronometroTheme

@Composable
fun CronometroView(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = "00:00:12",
            modifier = Modifier.align(Alignment.CenterHorizontally),
            style = MaterialTheme.typography.titleLarge
        )
        Row (modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
            ) {
            Button(onClick = { /*TODO*/ }, modifier = Modifier
                .height(100.dp)
                .aspectRatio(ratio = 1f),
            ) {
                Text(text = "Restart")
            }

            //Spacer(modifier = Modifier.width(190.dp))

            Button(onClick = { /*TODO*/ }, modifier = Modifier
                .height(100.dp)
                .aspectRatio(ratio = 1f)) {
                Text(text = "Start")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CronometroPreview() {
    CronometroTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            CronometroView()
        }
    }
}