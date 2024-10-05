package com.example.restart;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Objects;

public class aptnotes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_aptnotes);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        if(Objects.equals(str, "calenders")) {
            WebView chaandout = (WebView) findViewById(R.id.notes);
            chaandout.loadUrl("file:///android_asset/calendernotes.html");
        }
        else if(Objects.equals(str, "percentages")) {
            WebView chaandout = (WebView) findViewById(R.id.notes);
            chaandout.loadUrl("file:///android_asset/percentagenotes.html");
        }
        else if(Objects.equals(str, "profit and loss")) {
            WebView chaandout = (WebView) findViewById(R.id.notes);
            chaandout.loadUrl("file:///android_asset/profitnotes.html");
        }
        else if(Objects.equals(str, "interest")) {
            WebView chaandout = (WebView) findViewById(R.id.notes);
            chaandout.loadUrl("file:///android_asset/interestnotes.html");
        }
        else if(Objects.equals(str, "clocks")) {
            WebView chaandout = (WebView) findViewById(R.id.notes);
            chaandout.loadUrl("file:///android_asset/clocknotes.html");
        }
        else if(Objects.equals(str, "time and distance")) {
            WebView chaandout = (WebView) findViewById(R.id.notes);
            chaandout.loadUrl("file:///android_asset/distancenotes.html");
        }
        else if(Objects.equals(str, "time and work")) {
            WebView chaandout = (WebView) findViewById(R.id.notes);
            chaandout.loadUrl("file:///android_asset/work.html");
        }
        else if(Objects.equals(str, "averages")) {
            WebView chaandout = (WebView) findViewById(R.id.notes);
            chaandout.loadUrl("file:///android_asset/averagenotes.html");
        }
        else if(Objects.equals(str, "ratios")) {
            WebView chaandout = (WebView) findViewById(R.id.notes);
            chaandout.loadUrl("file:///android_asset/ratiohand.html");
        }
        else if(Objects.equals(str, "number")) {
            WebView chaandout = (WebView) findViewById(R.id.notes);
            chaandout.loadUrl("file:///android_asset/numbernotes.html");
        }
    }
}