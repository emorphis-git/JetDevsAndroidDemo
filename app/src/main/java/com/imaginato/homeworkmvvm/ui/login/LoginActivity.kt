package com.imaginato.homeworkmvvm.ui.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.imaginato.homeworkmvvm.data.remote.login.request.LoginRequest
import com.imaginato.homeworkmvvm.databinding.ActivityLoginBinding
import com.imaginato.homeworkmvvm.ui.demo.MainActivity
import com.imaginato.homeworkmvvm.utils.AsteriskPasswordTransformationMethod
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.component.KoinApiExtension


@KoinApiExtension
class LoginActivity : AppCompatActivity() {
    private val viewModel by viewModel<LoginActivityViewModel>()
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.edtPassword.transformationMethod = AsteriskPasswordTransformationMethod()

        binding.btnLogin.setOnClickListener {
            val loginRequest =
                LoginRequest(binding.edtUserName.text.toString(), binding.edtPassword.text.toString())
            viewModel.getLoginData(loginRequest)
        }

        initObserve()
    }

    private fun initObserve() {
        viewModel.resultLiveData.observe(this) {
            //login validated successfully, moving to next ui
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        viewModel.progress.observe(this) {
            binding.loading.isVisible = it
        }
    }

}