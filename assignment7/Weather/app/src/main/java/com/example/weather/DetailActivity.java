package com.example.weather;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if(savedInstanceState == null){
            DetailFragment fragment = new DetailFragment();

            if(getIntent().hasExtra("data")){
                Bundle arguments = new Bundle();
                arguments.putString("data", getIntent().getStringExtra("data"));
                fragment.setArguments(arguments);
            }

            getSupportFragmentManager().beginTransaction().add(R.id.detail_container, fragment).commit();

        }


    }
}
