package ozodbek.pl.notetodo.data.models

import androidx.compose.ui.graphics.Color
import ozodbek.pl.notetodo.ui.theme.HighPriorityColor
import ozodbek.pl.notetodo.ui.theme.LowPriorityColor
import ozodbek.pl.notetodo.ui.theme.MediumPriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(Color.Transparent)
}