package com.example.fooodblog;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        EditText usernameField = findViewById(R.id.username);
        EditText passwordField = findViewById(R.id.password);
        Button loginButton = findViewById(R.id.loginButton);
        TextView signUpText = findViewById(R.id.signUpText);

        loginButton.setOnClickListener(v -> {
            String username = usernameField.getText().toString().trim();
            String password = passwordField.getText().toString().trim();

            // Retrieve stored credentials
            SharedPreferences sharedPreferences = getSharedPreferences("UserData", MODE_PRIVATE);
            String storedUsername = sharedPreferences.getString("username", "");
            String storedPassword = sharedPreferences.getString("password", "");

            if (storedUsername.equals(username) && storedPassword.equals(password)) {
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, MainActivity.class));
            } else {
                Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show();
            }
        });

        signUpText.setOnClickListener(v -> startActivity(new Intent(this, SignUpActivity.class)));
    }
}
