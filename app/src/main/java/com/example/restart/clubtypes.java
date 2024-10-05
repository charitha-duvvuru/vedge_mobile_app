package com.example.restart;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Objects;

public class clubtypes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_clubtypes);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        if(Objects.equals(str, "Innovators Club"))
        {
            @SuppressLint({"MissingInflatedId", "LocalSuppress"}) WebView webView=(WebView) findViewById(R.id.innovator);
            webView.loadUrl("file:///android_asset/innovatorsclub.html");
        }
        else if(Objects.equals(str, "Dance Club"))
        {
            @SuppressLint({"MissingInflatedId", "LocalSuppress"}) WebView webView=(WebView) findViewById(R.id.innovator);
            webView.loadUrl("file:///android_asset/dance.html");
        }
        else if(Objects.equals(str, "Film Making Club")){
            @SuppressLint({"MissingInflatedId", "LocalSuppress"}) WebView webView=(WebView) findViewById(R.id.innovator);
            webView.loadUrl("file:///android_asset/film.html");
        }
        else if(Objects.equals(str, "Sports Club")){
            @SuppressLint({"MissingInflatedId", "LocalSuppress"}) WebView webView=(WebView) findViewById(R.id.innovator);
            webView.loadUrl("file:///android_asset/sports.html");
        }
        else if(Objects.equals(str, "Book Explorer Club")){
            @SuppressLint({"MissingInflatedId", "LocalSuppress"}) WebView webView=(WebView) findViewById(R.id.innovator);
            webView.loadUrl("file:///android_asset/book.html");
        }
        else if(Objects.equals(str, "Quiz Club")){
            @SuppressLint({"MissingInflatedId", "LocalSuppress"}) WebView webView=(WebView) findViewById(R.id.innovator);
            webView.loadUrl("file:///android_asset/quiz.html");
        }
    }
}