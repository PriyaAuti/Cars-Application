package com.example.aigentechproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.FileObserver;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText) findViewById(R.id.edittext1);
        e2=(EditText) findViewById(R.id.edittext2);
        b1=(Button) findViewById(R.id.loginButton);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().toString().equals("test@aigen.tech") && e2.getText().toString().equals("AigenTech")){
                    Intent i =new Intent(getApplicationContext(),HomeActivity.class);
                    startActivity(i);
                    setContentView(R.layout.activity_home);

                    //Toast.makeText(getApplicationContext(),"Redirecting...",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Wrong Credientials",Toast.LENGTH_SHORT).show();
                }
            }
        });





    }
}
