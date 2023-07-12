package com.example.kotlinprojecteducationalcontentsharingplatform


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

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
                navigateToHomePageActivity()
            }
            R.id.studentButton -> {
                // Handle student button click
                navigateToHomePageActivity()
            }
        }
    }




    private fun navigateToHomePageActivity() {
        val intent = Intent(this, HomePageActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
        finish()
    }


}
