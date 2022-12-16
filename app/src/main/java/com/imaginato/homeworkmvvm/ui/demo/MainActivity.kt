package com.imaginato.homeworkmvvm.ui.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.imaginato.homeworkmvvm.databinding.ActivityMainBinding
import com.imaginato.homeworkmvvm.ui.login.LoginActivity
import com.imaginato.homeworkmvvm.utils.AppPreference
import org.koin.core.component.KoinApiExtension

@KoinApiExtension
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}