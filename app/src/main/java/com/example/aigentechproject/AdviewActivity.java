package com.example.aigentechproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AdviewActivity extends AppCompatActivity {
    ImageView imageView;
    TextView name;
    TextView price;
    int position;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adview);
        ActionBar actionBar = getSupportActionBar();

       // if(actionBar != null){
       //     actionBar.setDisplayHomeAsUpEnabled(true);
       //     actionBar.setDisplayShowHomeEnabled(true);
       // }

        imageView = findViewById(R.id.another_imageView);
        name = findViewById(R.id.nameText);
        price = findViewById(R.id.priceText);


        if(position == 0){
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String cName = intent.getStringExtra("carname");
            String cPrice = intent.getStringExtra("carprice");


            imageView.setImageResource(pic);
            name.setText(cName);
            price.setText(cPrice);

            //actionBar.setTitle(cName);
        }

    }
}
