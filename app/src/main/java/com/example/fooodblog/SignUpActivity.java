package com.example.fooodblog;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        EditText usernameField = findViewById(R.id.username);
        EditText passwordField = findViewById(R.id.password);
        EditText confirmPasswordField = findViewById(R.id.confirmPassword);
        Button signUpButton = findViewById(R.id.signUpButton);

        signUpButton.setOnClickListener(v -> {
            String username = usernameField.getText().toString().trim();
            String password = passwordField.getText().toString().trim();
            String confirmPassword = confirmPasswordField.getText().toString().trim();

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Username and Password cannot be empty", Toast.LENGTH_SHORT).show();
                return;
            }

            if (!password.equals(confirmPassword)) {
                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                return;
            }

            // Save the credentials in SharedPreferences
            SharedPreferences sharedPreferences = getSharedPreferences("UserData", MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("username", username);
            editor.putString("password", password);
            editor.apply();

            Toast.makeText(this, "Account created successfully!", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, LoginActivity.class));
        });
    }
}
