package com.example.masror_mehedi.mycity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imgPlace;
    TextView txtName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imgPlace = findViewById(R.id.img_place);
        txtName = findViewById(R.id.txt_name);

        String getPlace = getIntent().getExtras().getString("place");

        Log.d("place",getPlace);//for Log
        if (getPlace.equals("Dhaka"))
        {
         imgPlace.setImageResource(R.drawable.th);
         txtName.setText(R.string.dhaka_desc);
        }
        else {
            imgPlace.setImageResource(R.drawable.ctg);
            txtName.setText(R.string.ctg_desc);

        }
    }
}
