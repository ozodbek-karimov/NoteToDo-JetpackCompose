package ozodbek.pl.notetodo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import org.koin.androidx.viewmodel.ext.android.viewModel
import ozodbek.pl.notetodo.navigation.SetupNavigation
import ozodbek.pl.notetodo.ui.theme.ToDoComposeTheme
import ozodbek.pl.notetodo.ui.viewmodels.SharedViewModel

@ExperimentalAnimationApi
class MainActivity : ComponentActivity() {

    private val sharedViewModel: SharedViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            ToDoComposeTheme {
                val navController = rememberNavController()
                SetupNavigation(
                    navController = navController,
                    sharedViewModel = sharedViewModel
                )
            }
        }
    }
}
