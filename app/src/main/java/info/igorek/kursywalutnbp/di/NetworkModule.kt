package info.igorek.kursywalutnbp.di

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import info.igorek.kursywalutnbp.BuildConfig
import info.igorek.kursywalutnbp.api.ServerApi
import java.util.concurrent.TimeUnit
import javax.inject.Singleton
import okhttp3.OkHttpClient
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class NetworkModule {

    private val timeoutSeconds = 60L

    @Provides
    @Singleton
    fun provideGson(): Gson {
        return GsonBuilder().create()
    }

    @Provides
    @Singleton
    fun provideGsonConverterFactory(): Converter.Factory {
        return GsonConverterFactory.create()
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .connectTimeout(timeoutSeconds, TimeUnit.SECONDS)
            .writeTimeout(timeoutSeconds, TimeUnit.SECONDS)
            .readTimeout(timeoutSeconds, TimeUnit.SECONDS)
            .build()
    }

    @Provides
    @Singleton
    fun provideBaseRestApiService(
        okHttpClient: OkHttpClient,
        gsonFactory: Converter.Factory,
    ): ServerApi {
        val retrofit = Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_API_URL)
            .addConverterFactory(gsonFactory)
            .client(okHttpClient)
            .build()
        return retrofit.create(ServerApi::class.java)
    }
}
