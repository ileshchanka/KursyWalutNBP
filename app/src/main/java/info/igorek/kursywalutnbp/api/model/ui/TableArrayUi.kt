package info.igorek.kursywalutnbp.api.model.ui

import info.igorek.kursywalutnbp.api.model.remote.TableArrayRemote.TableRemote

class TableArrayUi : ArrayList<TableRemote>() {
    data class TableUi(
        val table: String,
        val no: String,
        val effectiveDate: String,
        val rates: List<RateUi>,
    ) {

        data class RateUi(
            val currency: String,
            val code: String,
            val mid: Double,
        )
    }
}
