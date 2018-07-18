package com.aniik.splashscreenanddatapassing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button btnSaintMartin,btnNilAchol;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnSaintMartin=findViewById(R.id.btn_saint_martin);
        btnNilAchol=findViewById(R.id.btn_nilachol);

        btnSaintMartin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("name","Saint Martin");
                startActivity(intent);
            }
        });



        btnNilAchol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("name","Nil Achol");
                startActivity(intent);
            }
        });




    }
}
