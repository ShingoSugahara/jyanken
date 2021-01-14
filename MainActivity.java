package com.example.jyanken;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void onClickButton1(View view) {
        ImageView image = findViewById(R.id.imageView);
        int[] jankens = {R.drawable.gu, R.drawable.tyoki, R.drawable.pa};
        int janken = Random();
        image.setImageResource(jankens[janken]);
        TextView textView = findViewById(R.id.tv);
        switch (janken) {
            case 0:
                textView.setText(getString(R.string.hikiwake));
            case 1:
                textView.setText(getString(R.string.kachi));
            case 2:
                textView.setText(getString(R.string.make));

        }
    }

    public void onClickButton2(View view) {
        ImageView image = findViewById(R.id.imageView);
        int[] jankens = {R.drawable.gu, R.drawable.tyoki, R.drawable.pa};
        int janken = Random();
        image.setImageResource(jankens[janken]);
        TextView textView = findViewById(R.id.tv);

        image.setImageResource(jankens[janken]);
        switch (janken) {
            case 0:
                textView.setText(getString(R.string.make));
            case 1:
                textView.setText(getString(R.string.hikiwake));
            case 2:
                textView.setText(getString(R.string.kachi));

        }
    }

    public void onClickButton3(View view) {
            ImageView image = findViewById(R.id.imageView);
            int[] jankens = {R.drawable.gu, R.drawable.tyoki, R.drawable.pa};
            int janken = Random();
            image.setImageResource(jankens[janken]);
            TextView textView = findViewById(R.id.tv);

        image.setImageResource(jankens[janken]);
       switch (janken) {
           case 0:
               textView.setText(getString(R.string.kachi));
           case 1:
               textView.setText(getString(R.string.make));
           case 2:
               textView.setText(getString(R.string.hikiwake));

       }
    }


    public int Random(){
        Random rand = new Random();
        int janken = rand.nextInt(3);
        return janken;
    }
}
