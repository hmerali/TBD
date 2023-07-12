package com.example.kotlinprojecteducationalcontentsharingplatform

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinprojecteducationalcontentsharingplatform.HomePageActivity
import com.example.kotlinprojecteducationalcontentsharingplatform.HomePageActivity2
import com.example.kotlinprojecteducationalcontentsharingplatform.R

class RoleSelectionActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var educatorButton: Button
    private lateinit var studentButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_role_selection)

        educatorButton = findViewById(R.id.educatorButton)
        studentButton = findViewById(R.id.studentButton)

        educatorButton.setOnClickListener(this)
        studentButton.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.educatorButton -> {
                // Handle educator button click
                navigateToHomePageActivity2(true)
            }

            R.id.studentButton -> {
                // Handle student button click
                navigateToHomePageActivity2(false)
            }
        }
    }

    private fun navigateToHomePageActivity2(isEducator: Boolean) {
        val intent = if (isEducator) {
            Intent(this, HomePageActivity2::class.java)
        } else {
            Intent(this, HomePageActivity::class.java)
        }

        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
        finish()
    }
}
