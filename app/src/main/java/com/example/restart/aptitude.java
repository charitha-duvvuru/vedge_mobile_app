package com.example.restart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class aptitude extends AppCompatActivity {
    private CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_aptitude);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        c1 = (CardView) findViewById(R.id.cardView6);
        c2= (CardView) findViewById(R.id.cardView7);
        c3 = (CardView) findViewById(R.id.cardView8);
        c4 = (CardView) findViewById(R.id.cardView9);
        c5 = (CardView) findViewById(R.id.cardView10);
        c6 = (CardView) findViewById(R.id.cardView11);
        c7 = (CardView) findViewById(R.id.cardView12);
        c8 = (CardView) findViewById(R.id.cardView13);
        c9 = (CardView) findViewById(R.id.cardView14);
        c10 = (CardView) findViewById(R.id.cardView15);
        c11 = (CardView) findViewById(R.id.solutions);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView name=(TextView)findViewById(R.id.textView17);
                String str = name.getText().toString();
                Intent intent = new Intent(getApplicationContext(), calenders.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView name=(TextView)findViewById(R.id.textView18);
                String str = name.getText().toString();
                Intent intent = new Intent(getApplicationContext(), calenders.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView name=(TextView)findViewById(R.id.textView19);
                String str = name.getText().toString();
                Intent intent = new Intent(getApplicationContext(), calenders.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView name=(TextView)findViewById(R.id.textView20);
                String str = name.getText().toString();
                Intent intent = new Intent(getApplicationContext(), calenders.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView name=(TextView)findViewById(R.id.textView21);
                String str = name.getText().toString();
                Intent intent = new Intent(getApplicationContext(), calenders.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView name=(TextView)findViewById(R.id.textView22);
                String str = name.getText().toString();
                Intent intent = new Intent(getApplicationContext(), calenders.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView name=(TextView)findViewById(R.id.textView24);
                String str = name.getText().toString();
                Intent intent = new Intent(getApplicationContext(), calenders.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView name=(TextView)findViewById(R.id.textView25);
                String str = name.getText().toString();
                Intent intent = new Intent(getApplicationContext(), calenders.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView name=(TextView)findViewById(R.id.textView26);
                String str = name.getText().toString();
                Intent intent = new Intent(getApplicationContext(), calenders.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView name=(TextView)findViewById(R.id.textView27);
                String str = name.getText().toString();
                Intent intent = new Intent(getApplicationContext(), calenders.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent solution = new Intent(aptitude.this, solutions.class);
                startActivity(solution);
            }
        });
    }
}