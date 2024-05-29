package ozodbek.pl.notetodo.util

enum class Action {
    ADD,
    UPDATE,
    DELETE,
    DELETE_ALL,
    UNDO,
    NO_ACTION
}

fun String?.toAction(): Action {
    return if (this.isNullOrEmpty()) {
        Action.NO_ACTION
    } else {
        try {
            Action.valueOf(this)
        } catch (e: IllegalArgumentException) {
            Action.NO_ACTION
        }
    }
}