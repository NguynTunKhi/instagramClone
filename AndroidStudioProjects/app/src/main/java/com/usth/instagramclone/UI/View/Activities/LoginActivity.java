package com.usth.instagramclone.UI.View.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import com.usth.instagramclone.R;

public class LoginActivity extends AppCompatActivity {

    // Declare EditText and Button variables
    EditText usernameEditText;
    EditText passwordEditText;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Find the EditText and Button widgets by their ID
        usernameEditText = findViewById(R.id.username_edit_text);
        passwordEditText = findViewById(R.id.password_edit_text);
        loginButton = findViewById(R.id.login_button);

        // Set an OnClickListener on the login button
        loginButton.setOnClickListener(view -> {
            // Get the text from the EditText widgets
            String username = usernameEditText.getText().toString();
            String password = passwordEditText.getText().toString();

            // Send a request to the server to verify the login credentials
            // You will need to use an HTTP library such as OkHttp or Volley to make the request
            // You will also need to handle the response from the server, which will either be a success or an error message

            // If the login is successful, create an Intent to start the home activity
            Intent homeIntent = new Intent(LoginActivity.this, MainActivity.class);

            // Start the home activity
            startActivity(homeIntent);
        });
    }
}
