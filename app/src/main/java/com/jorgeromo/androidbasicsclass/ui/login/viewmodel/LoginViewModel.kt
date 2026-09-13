package com.jorgeromo.androidbasicsclass.ui.login.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    var username by mutableStateOf("")
    var password by mutableStateOf("")
    var errorMessage by mutableStateOf<String?>(null)

    fun onUsernameChange(newUsername: String) {
        username = newUsername
        errorMessage = null
    }

    fun onPasswordChange(newPassword: String) {
        password = newPassword
        errorMessage = null
    }

    fun login(onSuccess: () -> Unit) {
        if (username == "admin" && password == "1234") {
            errorMessage = null
            onSuccess()
        } else {
            errorMessage = "Usuario o contraseña incorrectos"
        }
    }
}
