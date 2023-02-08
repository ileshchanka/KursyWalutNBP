package info.igorek.kursywalutnbp.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import info.igorek.kursywalutnbp.api.repository.TablesRepository
import javax.inject.Inject

class HomeScreenViewModelFactory @Inject constructor(
    private val tablesRepository: TablesRepository,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return HomeScreenViewModel(
            tablesRepository = tablesRepository,
        ) as T
    }
}
