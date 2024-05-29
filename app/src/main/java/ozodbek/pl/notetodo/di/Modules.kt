package ozodbek.pl.notetodo.di

import androidx.room.Room
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import ozodbek.pl.notetodo.data.ToDoDatabase
import ozodbek.pl.notetodo.data.repositories.DataStoreRepository
import ozodbek.pl.notetodo.data.repositories.ToDoRepository
import ozodbek.pl.notetodo.ui.viewmodels.SharedViewModel
import ozodbek.pl.notetodo.util.Constants.DATABASE_NAME

val databaseModule = module {
    single {
        Room.databaseBuilder(
            get(),
            ToDoDatabase::class.java,
            DATABASE_NAME
        ).build()
    }
    single { get<ToDoDatabase>().toDoDao() }
}


val repositoryModule = module {
    singleOf(::DataStoreRepository)
    singleOf(::ToDoRepository)
}


val viewModelModule = module {
    viewModelOf(::SharedViewModel)
}