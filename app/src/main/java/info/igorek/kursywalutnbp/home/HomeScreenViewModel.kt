package info.igorek.kursywalutnbp.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import info.igorek.kursywalutnbp.api.model.ui.TableArrayUi.TableUi.RateUi
import info.igorek.kursywalutnbp.api.repository.TablesRepository
import info.igorek.kursywalutnbp.tools.EMPTY_STRING
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class HomeScreenViewModel(
    private val tablesRepository: TablesRepository,
) : ViewModel() {

    companion object {
        const val TABLE_TYPE = "A"
    }

    data class State(
        val table: String = EMPTY_STRING,
        val no: String = EMPTY_STRING,
        val effectiveDate: String = EMPTY_STRING,
        val rateList: List<RateUi> = emptyList(),
    )

    private val _state = MutableStateFlow(State())
    val state: StateFlow<State> = _state

    init {
        viewModelScope.launch(Dispatchers.IO) {
            val item = tablesRepository.getTable(TABLE_TYPE)
            _state.update {
                it.copy(
                    table = item.table,
                    no = item.no,
                    effectiveDate = item.effectiveDate,
                    rateList = item.rates,
                )
            }
        }
    }
}
