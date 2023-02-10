package info.igorek.kursywalutnbp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import info.igorek.kursywalutnbp.di.AppComponent
import info.igorek.kursywalutnbp.home.HomeScreen
import info.igorek.kursywalutnbp.ui.theme.KursyWalutNBPTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModelFactory = AppComponent.get().getHomeScreenViewModelFactory()

        setContent {
            KursyWalutNBPTheme {
                HomeScreen(
                    viewModel = viewModel(factory = viewModelFactory),
                )
            }
        }
    }
}
