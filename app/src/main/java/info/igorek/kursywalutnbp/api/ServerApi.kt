package info.igorek.kursywalutnbp.api

import info.igorek.kursywalutnbp.api.model.remote.TableRemote
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ServerApi {

    companion object {
        private const val FORMAT_JSON = "json"
    }

    // Queries for complete tables
    @GET("exchangerates/tables/{table}") // Current table of exchange rates of type {table}
    suspend fun exchangeRatesTables(
        @Path("table") table: String,
        @Query("format") format: String = FORMAT_JSON,
    ): TableRemote
}
