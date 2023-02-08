package info.igorek.kursywalutnbp.di

import dagger.Binds
import dagger.Module
import info.igorek.kursywalutnbp.api.repository.TablesRepository
import info.igorek.kursywalutnbp.api.repository.TablesRepositoryImpl
import javax.inject.Singleton

@Module
interface RepositoryModule {

    @Binds
    @Singleton
    fun bindTablesRepository(tablesRepository: TablesRepositoryImpl): TablesRepository
}