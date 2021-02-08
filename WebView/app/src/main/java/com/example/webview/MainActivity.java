package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webviewId);

        WebSettings webSettings = webView.getSettings();// WebSettings cls er under a akta variable niyechi..er modde getSettings method call korechi
        webSettings.setJavaScriptEnabled(true);//sei variable er modde j settings ta store hoice setar javascript tak enable koreci..by default disable thake..

        webView.setWebViewClient(new WebViewClient());//ata kaj korbe website tike amader app a e show korar..kono link a click korle jno onno kono browser a na jay sa jonno ata likha hoice
        webView.loadUrl("https://eub.edu.bd/");
        //in this situation we should access internet..it will be in manifests file..permission of internet take in this file
    }


    //new method as onCreate method for backpress action
    @Override
    public void onBackPressed() {

        if(webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();//super method
        }

    }
}