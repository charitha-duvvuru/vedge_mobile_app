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

public class clubs extends AppCompatActivity {
    private CardView c1,c2,c3,c4,c5,c6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_clubs);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        c1 = (CardView) findViewById(R.id.cardView16);
        c2= (CardView) findViewById(R.id.cardView17);
        c3 = (CardView) findViewById(R.id.cardView19);
        c4 = (CardView) findViewById(R.id.cardView20);
        c5 = (CardView) findViewById(R.id.cardView21);
        c6 = (CardView) findViewById(R.id.cardView22);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView name=(TextView)findViewById(R.id.textView32);
                String str = name.getText().toString();
                Intent intent = new Intent(getApplicationContext(), clubtypes.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView name=(TextView)findViewById(R.id.textView38);
                String str = name.getText().toString();
                Intent intent = new Intent(getApplicationContext(), clubtypes.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView name=(TextView)findViewById(R.id.textView39);
                String str = name.getText().toString();
                Intent intent = new Intent(getApplicationContext(), clubtypes.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView name=(TextView)findViewById(R.id.textView40);
                String str = name.getText().toString();
                Intent intent = new Intent(getApplicationContext(), clubtypes.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView name=(TextView)findViewById(R.id.textView41);
                String str = name.getText().toString();
                Intent intent = new Intent(getApplicationContext(), clubtypes.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView name=(TextView)findViewById(R.id.textView42);
                String str = name.getText().toString();
                Intent intent = new Intent(getApplicationContext(), clubtypes.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
    }
}