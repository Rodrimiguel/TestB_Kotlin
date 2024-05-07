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
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cronometro.ui.theme.CronometroTheme

@Composable
fun CronometroView(modifier: Modifier = Modifier) {
var prendido by remember {
    mutableStateOf(false)
}


    Column(modifier = modifier) {
        Column(modifier = Modifier.weight(1f), verticalArrangement = Arrangement.SpaceAround) {
            Text(
                text = "00:00:12",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                style = MaterialTheme.typography.titleLarge
            )
            if (prendido) {
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .height(100.dp)
                            .aspectRatio(ratio = 1f),
                        colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.tertiary)
                    ) {
                        Text(text = "Lap")
                    }

                    //Spacer(modifier = Modifier.width(190.dp))

                    Button(
                        onClick = { /*Esto debería pasar a FALSE*/
                                  prendido = false
                                  }, modifier = Modifier
                            .height(100.dp)
                            .aspectRatio(ratio = 1f),
                        colors = ButtonDefaults.buttonColors((MaterialTheme.colorScheme.primary))
                    ) {
                        Text(text = "Stop")
                    }
                }

            } else {
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .height(100.dp)
                            .aspectRatio(ratio = 1f),
                        colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.tertiary)
                    ) {
                        Text(text = "Restart")
                    }

                    //Spacer(modifier = Modifier.width(190.dp))

                    Button(
                        onClick = { /*Esto debería pasar a TRUE*/
                                    prendido = true

                                  }, modifier = Modifier
                            .height(100.dp)
                            .aspectRatio(ratio = 1f),
                        colors = ButtonDefaults.buttonColors((MaterialTheme.colorScheme.secondary))
                    ) {
                        Text(text = "Start")
                    }
                }

            }
        }
        Column(
            modifier = Modifier
                .weight(1f)
                .align(Alignment.CenterHorizontally)
        ) {
            Text(text = "")

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