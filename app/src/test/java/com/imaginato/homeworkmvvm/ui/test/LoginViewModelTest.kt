package com.imaginato.homeworkmvvm.ui.test

import com.google.common.truth.Truth
import com.imaginato.homeworkmvvm.ui.login.LoginActivityViewModel
import com.imaginato.homeworkmvvm.utils.inputValidator
import org.junit.Test

class LoginViewModelTest {
    private val viewModel = LoginActivityViewModel()


    @Test
    fun whenInputIsValid() {
        var currentLoginUiState = viewModel.uiState.value
        currentLoginUiState.userName = "adasff"
        currentLoginUiState.password = "123124"

        val userName = currentLoginUiState.userName
        val password = currentLoginUiState.password
        val result = inputValidator.validateLogin(userName, password)
        Truth.assertThat(result).isTrue()
    }

    @Test
    fun whenUserNameEmpty() {

        var currentLoginUiState = viewModel.uiState.value
        currentLoginUiState.userName = ""
        currentLoginUiState.password = "123124"
        val userName = currentLoginUiState.userName
        val password = currentLoginUiState.password
        val result = inputValidator.validateLogin(userName, password)
        Truth.assertThat(result).isFalse()
    }

    @Test
    fun whenPasswordEmpty() {
        var currentLoginUiState = viewModel.uiState.value
        currentLoginUiState.userName = "erewwt"
        currentLoginUiState.password = ""
        val userName = currentLoginUiState.userName
        val password = currentLoginUiState.password
        val result = inputValidator.validateLogin(userName, password)
        Truth.assertThat(result).isFalse()
    }

    @Test
    fun whenBothEmpty() {
        var currentLoginUiState = viewModel.uiState.value
        currentLoginUiState.userName = ""
        currentLoginUiState.password = ""
        val userName = currentLoginUiState.userName
        val password = currentLoginUiState.password
        val result = inputValidator.validateLogin(userName, password)
        Truth.assertThat(result).isFalse()
    }
}