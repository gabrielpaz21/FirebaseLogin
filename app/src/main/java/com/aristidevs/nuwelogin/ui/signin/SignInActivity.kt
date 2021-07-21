package com.aristidevs.nuwelogin.ui.signin

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.aristidevs.nuwelogin.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {

    companion object {
        fun create(context: Context): Intent =
            Intent(context, SignInActivity::class.java)
    }

    private lateinit var binding: ActivitySignInBinding
    private val signinViewModel: SignInViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()
    }

    private fun initUI() {

    }
}