package com.danielotoo.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class detailForm extends AppCompatActivity {
    private TextView textView;
    private Bundle extra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_form);
        textView = findViewById(R.id.txtInfo);

        extra = getIntent().getExtras();
        if (extra != null){
            String name = extra.getString("name");
            String username = extra.getString("username");
            String password = extra.getString("password");
            String repeatPassword = extra.getString("repeatPassword");
            textView.setText("The name is " + name + ".\n\n" +
                    " The username is  " + username +
                    "\n\n The password is "+ password+ ". \n\n " +
                    "The repeated password is " + repeatPassword);
        }
    }
}