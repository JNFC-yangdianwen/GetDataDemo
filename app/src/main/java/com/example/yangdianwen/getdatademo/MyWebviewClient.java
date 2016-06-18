package com.example.yangdianwen.getdatademo;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by yangdianwen on 16-6-18.
 */
public class MyWebviewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return  true;
    }
}