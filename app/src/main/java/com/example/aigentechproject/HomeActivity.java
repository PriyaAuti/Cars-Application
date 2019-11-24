package com.example.aigentechproject;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.Toolbar;

public class HomeActivity extends AppCompatActivity {

   // Toolbar mToolbar;
    ListView mListview;

    String carNames[] ={"Black Ferrari","Toyota Innova","Audi","Bentley Continentel","Black BMW","Ford Mustang","Jaguar","Lamborghini","Mahindra","Rolls Royce"};
    int carImages [] = {
            R.drawable.image_ferrari,
            R.drawable.image_toyotainnova,
            R.drawable.image_audi,
            R.drawable.image_bentleycontinental,
            R.drawable.image_bmw,
            R.drawable.image_fordmustang,
            R.drawable.image_jaguar,
            R.drawable.image_lamborghini,
            R.drawable.image_mahindra,
            R.drawable.image_rollsroyce};
    String carPrices[] = {"4 crore"," 5crore","7 crore","10 crore","3 crore","5 crore","6 crore","9 crore","2 crore","11 crore"};


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

       // mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mListview = (ListView) findViewById(R.id.listview);
        MyAdapter myAdapter = new MyAdapter(HomeActivity.this,carNames,carImages,carPrices);
        mListview.setAdapter(myAdapter);

        mListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position ==0){

                    Intent intent = new Intent(getApplicationContext(),AdviewActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",carImages[0]);
                    intent.putExtras(bundle);
                    intent.putExtra("carname",carNames[0]);
                    intent.putExtra("carprice",carPrices[0]);
                    intent.putExtra("position",""+0);
                    startActivity(intent);

                    //Intent i =new Intent(getApplicationContext(),MainActivity.class);
                  //  startActivity(i);
                   // setContentView(R.layout.activity_main);
                    //Toast.makeText(HomeActivity.this,"item",Toast.LENGTH_SHORT).show();
                }

                if(position ==1) {

                    Intent intent = new Intent(getApplicationContext(), AdviewActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", carImages[1]);
                    intent.putExtras(bundle);
                    intent.putExtra("carname", carNames[1]);
                    intent.putExtra("carprice",carPrices[1]);
                    intent.putExtra("position", "" + 1);
                    startActivity(intent);
                }
                if(position ==2) {

                    Intent intent = new Intent(getApplicationContext(), AdviewActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", carImages[2]);
                    intent.putExtras(bundle);
                    intent.putExtra("carname", carNames[2]);
                    intent.putExtra("carprice",carPrices[2]);
                    intent.putExtra("position", "" + 2);
                    startActivity(intent);
                }
                if(position ==3) {

                    Intent intent = new Intent(getApplicationContext(), AdviewActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", carImages[3]);
                    intent.putExtras(bundle);
                    intent.putExtra("carname", carNames[3]);
                    intent.putExtra("carprice",carPrices[3]);
                    intent.putExtra("position", "" + 3);
                    startActivity(intent);
                }
                if(position ==4) {

                    Intent intent = new Intent(getApplicationContext(), AdviewActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", carImages[4]);
                    intent.putExtras(bundle);
                    intent.putExtra("carname", carNames[4]);
                    intent.putExtra("carprice",carPrices[4]);
                    intent.putExtra("position", "" + 4);
                    startActivity(intent);
                }
                if(position ==5) {

                    Intent intent = new Intent(getApplicationContext(), AdviewActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", carImages[5]);
                    intent.putExtras(bundle);
                    intent.putExtra("carname", carNames[5]);
                    intent.putExtra("carprice",carPrices[5]);
                    intent.putExtra("position", "" + 5);
                    startActivity(intent);
                }
                if(position ==6) {

                    Intent intent = new Intent(getApplicationContext(), AdviewActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", carImages[6]);
                    intent.putExtras(bundle);
                    intent.putExtra("carname", carNames[6]);
                    intent.putExtra("carprice",carPrices[6]);
                    intent.putExtra("position", "" + 6);
                    startActivity(intent);
                }
                if(position ==7) {

                    Intent intent = new Intent(getApplicationContext(), AdviewActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", carImages[7]);
                    intent.putExtras(bundle);
                    intent.putExtra("carname", carNames[7]);
                    intent.putExtra("carprice",carPrices[7]);
                    intent.putExtra("position", "" + 7);
                    startActivity(intent);
                }
                if(position ==8) {

                    Intent intent = new Intent(getApplicationContext(), AdviewActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", carImages[8]);
                    intent.putExtras(bundle);
                    intent.putExtra("carname", carNames[8]);
                    intent.putExtra("carprice",carPrices[8]);
                    intent.putExtra("position", "" + 8);
                    startActivity(intent);
                }
                if(position ==8) {

                    Intent intent = new Intent(getApplicationContext(), AdviewActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", carImages[8]);
                    intent.putExtras(bundle);
                    intent.putExtra("carname", carNames[8]);
                    intent.putExtra("carprice",carPrices[8]);
                    intent.putExtra("position", "" + 8);
                    startActivity(intent);
                }
                if(position ==9) {

                    Intent intent = new Intent(getApplicationContext(), AdviewActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", carImages[9]);
                    intent.putExtras(bundle);
                    intent.putExtra("carname", carNames[9]);
                    intent.putExtra("carprice",carPrices[9]);
                    intent.putExtra("position", "" + 9);
                    startActivity(intent);
                }



            }
        });
    }
}



