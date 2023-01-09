package com.usth.instagramclone.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.usth.instagramclone.R;

public class LoginActivity extends AppCompatActivity {

    private TextView mTextViewLogo;
    private EditText mEditTextUsername;
    private EditText mEditTextPassword;
    private Button mButtonLogin;
    private Button mButtonSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mTextViewLogo = findViewById(R.id.text_view_logo);
        mEditTextUsername = findViewById(R.id.edit_text_username);
        mEditTextPassword = findViewById(R.id.edit_text_password);
        mButtonLogin = findViewById(R.id.button_login);
        mButtonSignUp = findViewById(R.id.button_sign_up);
        mButtonSignUp.setOnClickListener(new View.OnClickListener
                mButtonSignUp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // Implement sign up logic here
                    }
                });
    }
}