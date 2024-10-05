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

import java.util.Objects;

public class calenders extends AppCompatActivity {
    private CardView c1,c2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calenders);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView cal = findViewById(R.id.textView23);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        cal.setText(str);
        c1 = (CardView) findViewById(R.id.cardView5);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Objects.equals(str, "Calenders")) {
                    String str = "calenders";
                    Intent intent = new Intent(getApplicationContext(), handout.class);
                    intent.putExtra("message_key", str);
                    startActivity(intent);
                }
                else if(Objects.equals(str, "Percentages")){
                    String str = "percentages";
                    Intent intent = new Intent(getApplicationContext(), handout.class);
                    intent.putExtra("message_key", str);
                    startActivity(intent);
                }
                else if(Objects.equals(str, "Profit and Loss")){
                    String str = "profit and loss";
                    Intent intent = new Intent(getApplicationContext(), handout.class);
                    intent.putExtra("message_key", str);
                    startActivity(intent);
                }
                else if(Objects.equals(str, "Interest")){
                    String str = "interest";
                    Intent intent = new Intent(getApplicationContext(), handout.class);
                    intent.putExtra("message_key", str);
                    startActivity(intent);
                }
                else if(Objects.equals(str, "Ratios and Proportions")){
                    String str = "ratios";
                    Intent intent = new Intent(getApplicationContext(), handout.class);
                    intent.putExtra("message_key", str);
                    startActivity(intent);
                }
                else if(Objects.equals(str, "Real Number System")){
                    String str = "number";
                    Intent intent = new Intent(getApplicationContext(), handout.class);
                    intent.putExtra("message_key", str);
                    startActivity(intent);
                }
                else if(Objects.equals(str, "Averages")){
                    String str = "averages";
                    Intent intent = new Intent(getApplicationContext(), handout.class);
                    intent.putExtra("message_key", str);
                    startActivity(intent);
                }
                else if(Objects.equals(str, "Time and Work")){
                    String str = "time and work";
                    Intent intent = new Intent(getApplicationContext(), handout.class);
                    intent.putExtra("message_key", str);
                    startActivity(intent);
                }
                else if(Objects.equals(str, "Time and Distance")){
                    String str ="time and distance";
                    Intent intent = new Intent(getApplicationContext(), handout.class);
                    intent.putExtra("message_key", str);
                    startActivity(intent);
                }
                else if(Objects.equals(str, "Clocks")){
                    String str = "clocks";
                    Intent intent = new Intent(getApplicationContext(), handout.class);
                    intent.putExtra("message_key", str);
                    startActivity(intent);
                }
            }
        });
        c2 = (CardView) findViewById(R.id.cardView4);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Objects.equals(str, "Calenders")) {
                    String str = "calenders";
                    Intent intent = new Intent(getApplicationContext(), aptnotes.class);
                    intent.putExtra("message_key", str);
                    startActivity(intent);
                }
                else if(Objects.equals(str, "Percentages")){
                    String str = "percentages";
                    Intent intent = new Intent(getApplicationContext(), aptnotes.class);
                    intent.putExtra("message_key", str);
                    startActivity(intent);
                }
                else if(Objects.equals(str, "Profit and Loss")){
                    String str = "profit and loss";
                    Intent intent = new Intent(getApplicationContext(), aptnotes.class);
                    intent.putExtra("message_key", str);
                    startActivity(intent);
                }
                else if(Objects.equals(str, "Interest")){
                    String str = "interest";
                    Intent intent = new Intent(getApplicationContext(), aptnotes.class);
                    intent.putExtra("message_key", str);
                    startActivity(intent);
                }
                else if(Objects.equals(str, "Ratios and Proportions")){
                    String str = "ratios";
                    Intent intent = new Intent(getApplicationContext(), aptnotes.class);
                    intent.putExtra("message_key", str);
                    startActivity(intent);
                }
                else if(Objects.equals(str, "Real Number System")){
                    String str = "number";
                    Intent intent = new Intent(getApplicationContext(), aptnotes.class);
                    intent.putExtra("message_key", str);
                    startActivity(intent);
                }
                else if(Objects.equals(str, "Averages")){
                    String str = "averages";
                    Intent intent = new Intent(getApplicationContext(), aptnotes.class);
                    intent.putExtra("message_key", str);
                    startActivity(intent);
                }
                else if(Objects.equals(str, "Time and Work")){
                    String str = "time and work";
                    Intent intent = new Intent(getApplicationContext(), aptnotes.class);
                    intent.putExtra("message_key", str);
                    startActivity(intent);
                }
                else if(Objects.equals(str, "Time and Distance")){
                    String str ="time and distance";
                    Intent intent = new Intent(getApplicationContext(), aptnotes.class);
                    intent.putExtra("message_key", str);
                    startActivity(intent);
                }
                else if(Objects.equals(str, "Clocks")){
                    String str = "clocks";
                    Intent intent = new Intent(getApplicationContext(), aptnotes.class);
                    intent.putExtra("message_key", str);
                    startActivity(intent);
                }
            }
        });

    }
}