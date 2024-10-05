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

public class company extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_company);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        if(Objects.equals(str, "Accenture")) {
            WebView accenture = (WebView) findViewById(R.id.company);
            accenture.getSettings().setJavaScriptEnabled(true);
            accenture.loadUrl("file:///android_asset/accenture.html");
        }
        else if(Objects.equals(str, "IBM"))
        {
            WebView ibm= (WebView) findViewById(R.id.company);
            ibm.getSettings().setJavaScriptEnabled(true);
            ibm.loadUrl("file:///android_asset/ibm.html");
        }
        else if(Objects.equals(str, "Cognizant"))
        {
            WebView cts= (WebView) findViewById(R.id.company);
            cts.getSettings().setJavaScriptEnabled(true);
            cts.loadUrl("file:///android_asset/cognizant.html");
        }
        else if(Objects.equals(str, "DXC"))
        {
            WebView dxc= (WebView) findViewById(R.id.company);
            dxc.getSettings().setJavaScriptEnabled(true);
            dxc.loadUrl("file:///android_asset/dxc.html");
        }
        else if(Objects.equals(str, "Delloite"))
        {
            WebView del= (WebView) findViewById(R.id.company);
            del.getSettings().setJavaScriptEnabled(true);
            del.loadUrl("file:///android_asset/delloite.html");
        }
        else if(Objects.equals(str, "TCS"))
        {
            WebView tcs= (WebView) findViewById(R.id.company);
            tcs.getSettings().setJavaScriptEnabled(true);
            tcs.loadUrl("file:///android_asset/tcs.html");
        }
    }
}