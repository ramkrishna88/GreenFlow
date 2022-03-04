package com.example.myapplication;

import static android.widget.Toast.LENGTH_SHORT;
import static java.util.regex.Pattern.compile;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.net.PasswordAuthentication;
import java.util.regex.Pattern;

public class MainActivity2 extends AppCompatActivity {

    private EditText enter_email;
    private EditText enter_password;
    private EditText enter_password2;
    private Button button2;


    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        enter_email = findViewById(R.id.enter_email);
        enter_password = findViewById(R.id.edit_Password);
        enter_password2 = findViewById(R.id.edit_Password2);
        button2 = findViewById(R.id.button2);


    }

    public <PASSWORD_PATTERN> void password_pattern_onClick ( View MainActivity2 ) {
        final Pattern PASSWORD_PATTERN;
        PASSWORD_PATTERN Pattern = (PASSWORD_PATTERN) compile("^" + "(?=.*[a-zA-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$)" + ".{8,}" + "$");


        //"(?=.*[0-9])" +         //at least 1 digit
        //"(?=.*[a-z])" +         //at least 1 lower case letter
        //"(?=.*[A-Z])" +         //at least 1 upper case letter
        //any letter
        //at least 1 special character
        //no white spaces
        //at least 8 characters


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View MainActivity3) {
                Intent mIntent = new Intent(getBaseContext(), MainActivity3.class);
                startActivity(mIntent);

            }
        });

        String edit_email = enter_email.getText().toString();
        String edit_password = enter_password.getText().toString();
        String edit_password2 = enter_password2.getText().toString();


        if (enter_email.length() <= 20) {
            Toast.makeText(getApplicationContext(), "less than 20", LENGTH_SHORT).show();
        } else {
            if (enter_password.length() <= 10) {
                Toast.makeText(getApplicationContext(), "less than 10", LENGTH_SHORT).show();
            } else if (enter_password2.length() <= 10) {
                Toast.makeText(getApplicationContext(), "less than 10", LENGTH_SHORT).show();
            } else {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }

        }
    }}