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

public class handout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_handout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        if(Objects.equals(str, "calenders")) {
            WebView chaandout = (WebView) findViewById(R.id.chand);
            chaandout.loadUrl("file:///android_asset/chand.html");
        }
        else if(Objects.equals(str, "percentages"))
        {
            WebView chaandout = (WebView) findViewById(R.id.chand);
            chaandout.loadUrl("file:///android_asset/perhanout.html");
        }
        else if(Objects.equals(str, "profit and loss"))
        {
            WebView chaandout = (WebView) findViewById(R.id.chand);
            chaandout.loadUrl("file:///android_asset/profithandout.html");
        }
        else if(Objects.equals(str, "interest"))
        {
            WebView chaandout = (WebView) findViewById(R.id.chand);
            chaandout.loadUrl("file:///android_asset/interesthandout.html");
        }
        else if(Objects.equals(str, "ratios"))
        {
            WebView chaandout = (WebView) findViewById(R.id.chand);
            chaandout.loadUrl("file:///android_asset/ratioout.html");
        }
        else if(Objects.equals(str, "number"))
        {
            WebView chaandout = (WebView) findViewById(R.id.chand);
            chaandout.loadUrl("file:///android_asset/numberhand.html");
        }
        else if(Objects.equals(str, "averages"))
        {
            WebView chaandout = (WebView) findViewById(R.id.chand);
            chaandout.loadUrl("file:///android_asset/averagehand.html");
        }
        else if(Objects.equals(str, "time and work"))
        {
            WebView chaandout = (WebView) findViewById(R.id.chand);
            chaandout.loadUrl("file:///android_asset/workhand.html");
        }
        else if(Objects.equals(str, "time and distance"))
        {
            WebView chaandout = (WebView) findViewById(R.id.chand);
            chaandout.loadUrl("file:///android_asset/distancehand.html");
        }
        else if(Objects.equals(str, "clocks"))
        {
            WebView chaandout = (WebView) findViewById(R.id.chand);
            chaandout.loadUrl("file:///android_asset/clockhand.html");
        }
    }
}