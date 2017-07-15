package com.brandonhinds.livestalk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button signup;
    private Button login;
    private Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signup = (Button) findViewById(R.id.button3);
        login = (Button) findViewById(R.id.button4);
        exit = (Button) findViewById(R.id.button5);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // start sign up activity
                gotToSignUp();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // start login activity
                gotToLogin();
            }
        });
    }

    private void gotToSignUp(){
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }

    private void gotToLogin(){
        Intent intent = new Intent(this, LogInActivity.class);
        startActivity(intent);
    }
}
