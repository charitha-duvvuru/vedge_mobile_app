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

public class lang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lang);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        if(Objects.equals(str, "c"))
        {
            @SuppressLint({"MissingInflatedId", "LocalSuppress"}) WebView webView=(WebView) findViewById(R.id.lang);
            webView.loadUrl("file:///android_asset/c.html");
        }
        else if(Objects.equals(str, "java"))
        {
            @SuppressLint({"MissingInflatedId", "LocalSuppress"}) WebView webView=(WebView) findViewById(R.id.lang);
            webView.loadUrl("file:///android_asset/java.html");
        }
        else if(Objects.equals(str, "python")){
            @SuppressLint({"MissingInflatedId", "LocalSuppress"}) WebView webView=(WebView) findViewById(R.id.lang);
            webView.loadUrl("file:///android_asset/python.html");
        }
        else if(Objects.equals(str, "database")){
            @SuppressLint({"MissingInflatedId", "LocalSuppress"}) WebView webView=(WebView) findViewById(R.id.lang);
            webView.loadUrl("file:///android_asset/database.html");
        }
    }
}