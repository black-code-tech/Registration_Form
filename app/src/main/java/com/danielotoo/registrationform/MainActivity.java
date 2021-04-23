package com.danielotoo.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText username;
    private EditText password;
    private EditText repeatPassword;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editName);
        username = findViewById(R.id.editUsername);
        password = findViewById(R.id.editPass);
        repeatPassword = findViewById(R.id.editRepeatPass);
        submit = findViewById(R.id.btnSubmit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, detailForm.class);
                intent.putExtra("name", name.getText().toString());
                intent.putExtra("username", username.getText().toString());
                intent.putExtra("password", password.getText().toString());
                intent.putExtra("repeatPassword", repeatPassword.getText().toString());
                startActivity(intent);
            }
        });
    }
}