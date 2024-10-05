package com.example.restart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class coding extends AppCompatActivity {
    private CardView c1,c2,c3,c4,c5,c6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_coding);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        c1 = (CardView) findViewById(R.id.cardView32);
        c2 = (CardView) findViewById(R.id.cardView33);
        c3 = (CardView) findViewById(R.id.cardView34);
        c4 = (CardView) findViewById(R.id.cardView35);
        c5 = (CardView) findViewById(R.id.cardView36);
        c6 = (CardView) findViewById(R.id.cardView37);
        c1.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String str = "Accenture";
                Intent intent = new Intent(getApplicationContext(), company.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
        c2.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String str = "IBM";
                Intent intent = new Intent(getApplicationContext(), company.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
        c3.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String str = "Cognizant";
                Intent intent = new Intent(getApplicationContext(), company.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
        c4.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String str = "DXC";
                Intent intent = new Intent(getApplicationContext(), company.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
        c5.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String str = "Delloite";
                Intent intent = new Intent(getApplicationContext(), company.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
        c6.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String str = "TCS";
                Intent intent = new Intent(getApplicationContext(), company.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
    }
}