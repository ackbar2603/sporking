package com.example.spork.presentation.allscreen.signin

import com.google.firebase.auth.AuthResult

data class LoginGoogleState(
    val success: AuthResult? = null,
    val error: String? = "",
    val loading: Boolean = true
)