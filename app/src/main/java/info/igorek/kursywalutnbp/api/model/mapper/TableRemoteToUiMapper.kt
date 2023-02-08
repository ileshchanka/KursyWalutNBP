package info.igorek.kursywalutnbp.api.model.mapper

import info.igorek.kursywalutnbp.api.model.remote.TableRemote
import info.igorek.kursywalutnbp.api.model.ui.TableUi
import javax.inject.Inject

class TableRemoteToUiMapper @Inject constructor() {

    fun map(remote: TableRemote): TableUi {
        return TableUi(
            list = remote.list.map(::mapItem),
        )
    }

    private fun mapItem(remote: TableRemote.TableItem): TableUi.TableItem {
        return TableUi.TableItem(
            table = remote.table,
            no = remote.no,
            effectiveDate = remote.effectiveDate,
            rates = remote.rates.map(::mapRate),
        )
    }

    private fun mapRate(remote: TableRemote.TableItem.Rate): TableUi.TableItem.Rate {
        return TableUi.TableItem.Rate(
            currency = remote.currency,
            code = remote.code,
            mid = remote.mid,
        )
    }

//    fun map(remote: TableRemote): TableUi {
//        return TableUi(
//            list = remote.list.map { item ->
//                TableUi.TableItem(
//                    table = item.table,
//                    no = item.no,
//                    effectiveDate = item.effectiveDate,
//                    rates = item.rates.map { rate ->
//                        TableUi.TableItem.Rate(
//                            currency = rate.currency,
//                            code = rate.code,
//                            mid = rate.mid,
//                        )
//                    }
//                )
//            }
//        )
//    }
}
