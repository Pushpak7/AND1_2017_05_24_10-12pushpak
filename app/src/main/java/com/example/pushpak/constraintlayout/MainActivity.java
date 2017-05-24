package com.example.pushpak.constraintlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onIronman(View view){
        populateImage(R.drawable.batman);

}
    public void onSpidy(View view){

        populateImage(R.drawable.iphone);


    }
    public void onAntman(View view){

        populateImage(R.drawable.hulk);


    }
    private  void populateImage(int image){
        ImageView img= (ImageView) findViewById(R.id.imgMan);
        img.setImageResource(image);


    }

}
