package info.igorek.kursywalutnbp.api.repository

import info.igorek.kursywalutnbp.api.ServerApi
import info.igorek.kursywalutnbp.api.model.mapper.TableRemoteToUiMapper
import info.igorek.kursywalutnbp.api.model.ui.TableArrayUi.TableUi
import javax.inject.Inject

interface TablesRepository {
    suspend fun getTable(table: String): TableUi
}

class TablesRepositoryImpl @Inject constructor(
    private val serverApi: ServerApi,
    private val tableRemoteToUiMapper: TableRemoteToUiMapper,
) : TablesRepository {

    override suspend fun getTable(table: String): TableUi {
        return tableRemoteToUiMapper.map(
            serverApi.exchangeRatesTables(table).first(),
        )
    }
}
