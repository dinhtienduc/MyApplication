package com.example.giga.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //action sigup new user
        Button signupButton = (Button) findViewById(R.id.btnsign);
        signupButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(login.this,signup.class);
                startActivity(intent);
            }
        });
        //action fogot password
        Button fogotpassButton =(Button) findViewById(R.id.btnforgot);
        fogotpassButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(login.this,fogotuser.class);
                startActivity(intent);
            }
        });
    }
}
