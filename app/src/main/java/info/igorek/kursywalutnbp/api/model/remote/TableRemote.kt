package info.igorek.kursywalutnbp.api.model.remote

import com.google.gson.annotations.SerializedName

data class TableRemote(
    val list: List<TableItem>,
) {
    data class TableItem(
        @SerializedName("table")
        val table: String,
        @SerializedName("no")
        val no: String,
        @SerializedName("effectiveDate")
        val effectiveDate: String,
        @SerializedName("rates")
        val rates: List<Rate>,
    ) {
        data class Rate(
            @SerializedName("currency")
            val currency: String,
            @SerializedName("code")
            val code: String,
            @SerializedName("mid")
            val mid: Double,
        )
    }
}
