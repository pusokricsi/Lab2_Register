package com.example.lab2_register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText firstName;
    private EditText lastName;
    private Button sendButton;
    private Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);


        sendButton = (Button) findViewById(R.id.sendButton);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData();
            }
        });

        registerButton = (Button) findViewById(R.id.registerButton);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerData();
            }
        });

    }

    private void sendData()
    {
        String firstNameMessage;
        String lastNameMessage;
        Intent intent = new Intent(this, ProfileActivity.class);
        firstName = findViewById(R.id.firstNameEditText);
        lastName = findViewById(R.id.lastNameEditText);
        firstNameMessage = firstName.getText().toString();
        lastNameMessage = lastName.getText().toString();
        System.out.println(firstNameMessage);
        intent.putExtra("firstName",firstNameMessage);
        intent.putExtra("lastName", lastNameMessage);

        startActivity(intent);
    }

    private void registerData()
    {
        Intent intent = new Intent (this, RegisterActivity.class);

        startActivity(intent);
    }

}
