package com.example.first;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView myWebView = (WebView) findViewById(R.id.webView);
        myWebView.setWebViewClient(new WebViewClient());

        WebSettings myWebSettings = myWebView.getSettings();
        myWebSettings.setJavaScriptEnabled(true);

        myWebView.loadUrl("https://github.com/rkdus5485/rkdus5485.github.io");
    }
}
