package info.igorek.kursywalutnbp.home

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue

@Composable
fun HomeScreen(
    homeViewModel: HomeScreenViewModel,
) {
    val state by homeViewModel.state.collectAsState()
}
