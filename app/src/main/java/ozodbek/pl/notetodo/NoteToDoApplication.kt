package ozodbek.pl.notetodo

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import ozodbek.pl.notetodo.di.databaseModule
import ozodbek.pl.notetodo.di.repositoryModule
import ozodbek.pl.notetodo.di.viewModelModule

class NoteToDoApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@NoteToDoApplication)
            modules(
                listOf(
                databaseModule,
                repositoryModule,
                viewModelModule
                )
            )
        }
    }
}