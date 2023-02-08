package info.igorek.kursywalutnbp.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import info.igorek.kursywalutnbp.api.repository.TablesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class HomeScreenViewModel(
    private val tablesRepository: TablesRepository,
) : ViewModel() {

    data class State(
        val table: String = "",
        val no: String = "",
        val effectiveDate: String = "",
    )

    private val _state = MutableStateFlow(State())

    init {
        viewModelScope.launch(Dispatchers.IO) {
//            val item = tablesRepository.getTable("A")
//            _state.update {
//                it.copy(
//                    table = item.table,
//                    no = item.no,
//                    effectiveDate = item.effectiveDate,
//                )
//            }
        }
    }
}
