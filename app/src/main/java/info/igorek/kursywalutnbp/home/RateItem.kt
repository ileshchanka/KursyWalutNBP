package info.igorek.kursywalutnbp.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import info.igorek.kursywalutnbp.api.model.ui.TableArrayUi.TableUi.RateUi

@Composable
fun RateItem(
    rate: RateUi,
) {
    Row(modifier = Modifier) {
        Text(
            text = rate.currency,
            modifier = Modifier.background(color = Color.Red),
        )
        Spacer(
            modifier = Modifier.weight(1f),
        )
        Text(
            text = rate.code,
            modifier = Modifier.background(color = Color.Yellow),
        )
        Spacer(
            modifier = Modifier.weight(1f),
        )
        Text(
            text = rate.mid.toString(),
            modifier = Modifier.background(color = Color.Green),
        )
    }
}
