package info.igorek.kursywalutnbp.api.model.remote

import com.google.gson.annotations.SerializedName
import info.igorek.kursywalutnbp.api.model.remote.TableArrayRemote.TableRemote

class TableArrayRemote : ArrayList<TableRemote>() {
    data class TableRemote(
        @SerializedName("table")
        val table: String,
        @SerializedName("no")
        val no: String,
        @SerializedName("effectiveDate")
        val effectiveDate: String,
        @SerializedName("rates")
        val rates: List<RateRemote>,
    ) {

        data class RateRemote(
            @SerializedName("currency")
            val currency: String,
            @SerializedName("code")
            val code: String,
            @SerializedName("mid")
            val mid: Double,
        )
    }
}
