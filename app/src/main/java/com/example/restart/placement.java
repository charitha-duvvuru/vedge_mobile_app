package com.example.restart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class placement extends AppCompatActivity {
    private CardView c1,c2,c3,c4,c5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_placement);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        c1 = (CardView) findViewById(R.id.cardView23);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(placement.this, coding.class);
                startActivity(intent);
            }
        });
        c2 = (CardView) findViewById(R.id.cardView24);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent club = new Intent(placement.this, hr.class);
                startActivity(club);
            }
        });
        c3 = (CardView) findViewById(R.id.tech);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acheiver= new Intent(placement.this, technical.class);
                startActivity(acheiver);
            }
        });
        c4 = (CardView) findViewById(R.id.cardView18);
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent event = new Intent(placement.this, aptitude.class);
                startActivity(event);
            }
        });
        c5 = (CardView) findViewById(R.id.cardView25);
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(placement.this, softskills.class);
                startActivity(intent);
            }
        });
    }
}