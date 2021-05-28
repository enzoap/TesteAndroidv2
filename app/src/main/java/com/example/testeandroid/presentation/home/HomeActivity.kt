package com.example.testeandroid.presentation.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testeandroid.R
import com.example.testeandroid.databinding.ActivityHomeBinding
import com.example.testeandroid.presentation.base.BaseActivity

class HomeActivity : BaseActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setupToolbar(binding.toolbarMain.toolbarMain, "Teste")
    }
}