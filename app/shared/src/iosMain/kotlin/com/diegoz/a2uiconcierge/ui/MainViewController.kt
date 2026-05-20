package com.diegoz.a2uiconcierge.ui

import androidx.compose.ui.window.ComposeUIViewController
import com.diegoz.a2uiconcierge.App

private const val BACKEND_BASE_URL = "http://192.168.1.6:8000"

fun MainViewController() = ComposeUIViewController {
    App(BACKEND_BASE_URL)
}
