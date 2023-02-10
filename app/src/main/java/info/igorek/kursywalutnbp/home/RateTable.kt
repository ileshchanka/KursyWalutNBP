package info.igorek.kursywalutnbp.home

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import info.igorek.kursywalutnbp.R
import info.igorek.kursywalutnbp.api.model.ui.TableArrayUi.TableUi.RateUi

@Composable
fun RateTable(
    rate: List<RateUi>,
) {
    val weightHalf = .5f
    val weightQuarter = .25f

    LazyColumn(
        Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
    ) {
        item {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                TableCell(
                    text = stringResource(R.string.currency),
                    weight = weightHalf,
                    fontWeight = FontWeight.Bold,
                )
                TableCell(
                    text = stringResource(R.string.code),
                    weight = weightQuarter,
                    fontWeight = FontWeight.Bold,
                )
                TableCell(
                    text = stringResource(R.string.rate),
                    weight = weightQuarter,
                    fontWeight = FontWeight.Bold,
                )
            }
        }
        items(rate) {
            Divider(
                color = Color.Gray,
                thickness = 1.dp,
            )
            Row(
                Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                TableCell(
                    text = it.currency,
                    weight = weightHalf,
                )
                TableCell(
                    text = it.code,
                    weight = weightQuarter,
                )
                TableCell(
                    text = it.mid.toString(),
                    weight = weightQuarter,
                )
            }
        }
    }
}
