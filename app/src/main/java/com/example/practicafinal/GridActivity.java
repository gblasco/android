package com.example.practicafinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class GridActivity extends AppCompatActivity {

    ImageView imageView;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        // initialize imageView 
        // with method findViewById()
        imageView = findViewById(R.id.imageView);
        // Apply OnClickListener  to imageView to 
        // switch from one activity to another
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent intent = new Intent(GridActivity.this, CabraActivity.class);
                startActivity(intent);
            }
        });

        imageView2 = findViewById(R.id.imageView2);
        // Apply OnClickListener  to imageView to
        // switch from one activity to another
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent intent = new Intent(GridActivity.this, RanaActivity.class);
                startActivity(intent);
            }
        });

        imageView3 = findViewById(R.id.imageView3);
        // Apply OnClickListener  to imageView to
        // switch from one activity to another
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent intent = new Intent(GridActivity.this, CerdosActivity.class);
                startActivity(intent);
            }
        });

        imageView4 = findViewById(R.id.imageView4);
        // Apply OnClickListener  to imageView to
        // switch from one activity to another
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent intent = new Intent(GridActivity.this, AlpacasActivity.class);
                startActivity(intent);
            }
        });

        imageView5 = findViewById(R.id.imageView5);
        // Apply OnClickListener  to imageView to
        // switch from one activity to another
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent intent = new Intent(GridActivity.this, LoboActivity.class);
                startActivity(intent);
            }
        });

        imageView6 = findViewById(R.id.imageView6);
        // Apply OnClickListener  to imageView to
        // switch from one activity to another
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent intent = new Intent(GridActivity.this, OvejaActivity.class);
                startActivity(intent);
            }
        });
    }
}
