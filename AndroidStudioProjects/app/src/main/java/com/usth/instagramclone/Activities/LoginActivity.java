import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.usth.instagramclone.R;

public class LoginActivity extends AppCompatActivity {

    private EditText emailField;
    private EditText passwordField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialize views
        emailField = findViewById(R.id.email_field);
        passwordField = findViewById(R.id.password_field);
    }

    public void loginButtonClick(View view) {
        String email = emailField.getText().toString();
        String password = passwordField.getText().toString();

        if (isEmailValid(email) && isPasswordValid(password)) {
            // Send login request to server
            sendLoginRequest(email, password);
        } else {
            // Show error message
        }
    }

    private void sendLoginRequest(String email, String password) {
        // Add code to send login request to server here
    }

    private boolean isEmailValid(String email) {
        // Add email validation logic here
        return true;
    }

    private boolean isPasswordValid(String password) {
        // Add password validation logic here
        return true;
    }
}
