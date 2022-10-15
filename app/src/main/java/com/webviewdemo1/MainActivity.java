package com.webviewdemo1;

import static android.webkit.WebSettings.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        web = findViewById(R.id.webView);
        WebSettings websettings = web.getSettings();
      websettings.setJavaScriptEnabled(true);
        web.setWebViewClient(new callback());
        web.loadUrl("http://www.youtube.com/");
        //web.loadUrl("http://krupatechservices.great-site.net/");
    }

    private class callback extends WebViewClient {
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
            return false;
        }
        }
    }
