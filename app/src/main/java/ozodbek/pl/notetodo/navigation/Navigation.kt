package ozodbek.pl.notetodo.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import ozodbek.pl.notetodo.navigation.destinations.listComposable
import ozodbek.pl.notetodo.navigation.destinations.taskComposable
import ozodbek.pl.notetodo.ui.viewmodels.SharedViewModel
import ozodbek.pl.notetodo.util.Constants.LIST_SCREEN

@ExperimentalAnimationApi
@Composable
fun SetupNavigation(
    navController: NavHostController,
    sharedViewModel: SharedViewModel
) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }

    NavHost(
        navController = navController,
        startDestination = LIST_SCREEN
    ) {
        listComposable(
            navigateToTaskScreen = screen.list,
            sharedViewModel = sharedViewModel
        )
        taskComposable(
            navigateToListScreen = screen.task,
            sharedViewModel = sharedViewModel
        )
    }
}