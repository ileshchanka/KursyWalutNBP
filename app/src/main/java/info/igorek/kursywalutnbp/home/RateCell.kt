package info.igorek.kursywalutnbp.home

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun RowScope.TableCell(
    text: String,
    weight: Float,
    fontWeight: FontWeight = FontWeight.Normal,
) {
    Text(
        text = text,
        Modifier
            .weight(weight)
            .padding(8.dp),
        fontWeight = fontWeight,
    )
}
