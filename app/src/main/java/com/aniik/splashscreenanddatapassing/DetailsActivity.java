package com.aniik.splashscreenanddatapassing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imgPlace;
    TextView txtPlaceName,txtDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        txtPlaceName=findViewById(R.id.txt_place_name);
        txtDesc=findViewById(R.id.txt_desc);
        imgPlace=findViewById(R.id.img_place);

        String getName=getIntent().getExtras().getString("name");

        if (getName.equals("Saint Martin"))
        {
            imgPlace.setImageResource(R.drawable.saint_martin);
            txtPlaceName.setText("Saint Martin");
            txtDesc.setText("Saint Martin is a beautiful place");
        }

     else   if (getName.equals("Nil Achol"))
        {
            imgPlace.setImageResource(R.drawable.nil_achol);
            txtPlaceName.setText("Nil Achol");
            txtDesc.setText("Nil Achol is a beautiful place");
        }


    }
}
