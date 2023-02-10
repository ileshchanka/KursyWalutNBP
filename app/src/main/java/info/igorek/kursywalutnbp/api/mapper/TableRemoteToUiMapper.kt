package info.igorek.kursywalutnbp.api.mapper

import info.igorek.kursywalutnbp.api.model.remote.TableArrayRemote.TableRemote
import info.igorek.kursywalutnbp.api.model.ui.TableArrayUi.TableUi
import info.igorek.kursywalutnbp.api.model.ui.TableArrayUi.TableUi.RateUi
import info.igorek.kursywalutnbp.tools.uppercaseFirstChars
import javax.inject.Inject

class TableRemoteToUiMapper @Inject constructor() {

    fun map(remote: TableRemote): TableUi {
        return TableUi(
            table = remote.table,
            no = remote.no,
            effectiveDate = remote.effectiveDate,
            rates = remote.rates.map { rate ->
                RateUi(
                    currency = rate.currency.uppercaseFirstChars(),
                    code = rate.code,
                    mid = rate.mid,
                )
            },
        )
    }
}
