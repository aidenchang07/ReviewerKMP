package com.va.reviewer

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "ReviewerKMP",
    ) {
        App()
    }
}