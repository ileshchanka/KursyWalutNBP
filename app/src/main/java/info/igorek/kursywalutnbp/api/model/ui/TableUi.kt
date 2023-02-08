package info.igorek.kursywalutnbp.api.model.ui

data class TableUi(
    val list: List<TableItem>,
) {
    data class TableItem(
        val table: String,
        val no: String,
        val effectiveDate: String,
        val rates: List<Rate>,
    ) {
        data class Rate(
            val currency: String,
            val code: String,
            val mid: Double,
        )
    }
}
