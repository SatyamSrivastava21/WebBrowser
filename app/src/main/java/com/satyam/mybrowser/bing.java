package com.satyam.mybrowser;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
public class bing extends AppCompatActivity {
    WebView webview;
    ProgressBar bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bing);
        webview = findViewById(R.id.webview);
        bar = findViewById(R.id.progressbar);
        webview.loadUrl("https://www.bing.com");
        webview.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                bar.setVisibility(View.VISIBLE);
                super.onPageStarted(view, url, favicon);}
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);}
            @Override
            public void onPageFinished(WebView view, String url) {
                bar.setVisibility(View.GONE);
                super.onPageFinished(view, url);}
        });}
    @Override
    public void onBackPressed() {
        if(webview.canGoBack()){
            webview.goBack();
        }else
        {super.onBackPressed();}
    }}