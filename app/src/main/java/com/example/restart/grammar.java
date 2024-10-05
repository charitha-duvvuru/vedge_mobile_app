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

public class grammar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_grammar);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        if(Objects.equals(str, "articles"))
        {
            @SuppressLint({"MissingInflatedId", "LocalSuppress"}) WebView webView=(WebView) findViewById(R.id.grammar);
            webView.loadUrl("file:///android_asset/articles.html");
        }
        else if(Objects.equals(str, "speech"))
        {
            @SuppressLint({"MissingInflatedId", "LocalSuppress"}) WebView webView=(WebView) findViewById(R.id.grammar);
            webView.loadUrl("file:///android_asset/speech.html");
        }
        else if(Objects.equals(str, "verbs")){
            @SuppressLint({"MissingInflatedId", "LocalSuppress"}) WebView webView=(WebView) findViewById(R.id.grammar);
            webView.loadUrl("file:///android_asset/verbs.html");
        }
        else if(Objects.equals(str, "parts of speech")){
            @SuppressLint({"MissingInflatedId", "LocalSuppress"}) WebView webView=(WebView) findViewById(R.id.grammar);
            webView.loadUrl("file:///android_asset/partsofspeech.html");
        }
        else if(Objects.equals(str, "prepositions")){
            @SuppressLint({"MissingInflatedId", "LocalSuppress"}) WebView webView=(WebView) findViewById(R.id.grammar);
            webView.loadUrl("file:///android_asset/prepositions.html");
        }
    }
}