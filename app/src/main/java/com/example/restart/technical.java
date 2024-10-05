package com.example.restart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class technical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_technical);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageButton b1=(ImageButton)this.findViewById(R.id.imageButton3);
        ImageButton b2=(ImageButton)this.findViewById(R.id.imageButton7);
        ImageButton b3=(ImageButton)this.findViewById(R.id.imageButton8);
        ImageButton b4=(ImageButton)this.findViewById(R.id.imageButton13);
        b1.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String str = "c";
                Intent intent = new Intent(getApplicationContext(), lang.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String str = "java";
                Intent intent = new Intent(getApplicationContext(), lang.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String str ="python";
                Intent intent = new Intent(getApplicationContext(), lang.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String str ="database";
                Intent intent = new Intent(getApplicationContext(), lang.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });

    }
}