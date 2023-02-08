package info.igorek.kursywalutnbp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import info.igorek.kursywalutnbp.di.AppComponent
import info.igorek.kursywalutnbp.home.HomeScreen
import info.igorek.kursywalutnbp.ui.theme.KursyWalutNBPTheme

class MainActivity : ComponentActivity() {

//    init {
//        AppComponent.get().inject(this)
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModelFactory = AppComponent.get().getHomeScreenViewModelFactory()

        setContent {
            KursyWalutNBPTheme {
                HomeScreen(
                    homeViewModel = viewModel(factory = viewModelFactory),
                )
            }
        }
    }
}
