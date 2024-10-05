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

public class softskills extends AppCompatActivity {
    private CardView c1,c2,c3,c4,c5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_softskills);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        c1 = (CardView) findViewById(R.id.cardView2);
        c2= (CardView) findViewById(R.id.cardView3);
        c3 = (CardView) findViewById(R.id.cardView);
        c4 = (CardView) findViewById(R.id.cardView26);
        c5=(CardView)findViewById(R.id.preposition);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = "articles";
                Intent intent = new Intent(getApplicationContext(), grammar.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = "speech";
                Intent intent = new Intent(getApplicationContext(), grammar.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = "verbs";
                Intent intent = new Intent(getApplicationContext(), grammar.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = "parts of speech";
                Intent intent = new Intent(getApplicationContext(),grammar.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = "prepositions";
                Intent intent = new Intent(getApplicationContext(), grammar.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
    }
}