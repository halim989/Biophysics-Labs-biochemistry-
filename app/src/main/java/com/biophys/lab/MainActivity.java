package com.biophys.lab;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;
import android.view.WindowManager;

public class MainActivity extends Activity {
  private WebView view;
  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED, WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED);
    view = new WebView(this);
    view.setWebViewClient(new WebViewClient());
    view.setWebChromeClient(new WebChromeClient());
    WebSettings settings=view.getSettings();
    settings.setJavaScriptEnabled(true);
    settings.setDomStorageEnabled(true);
    settings.setAllowFileAccess(true);
    settings.setMediaPlaybackRequiresUserGesture(true);
    view.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
    setContentView(view);
    view.loadUrl("file:///android_asset/index.html");
  }
  @Override public void onBackPressed() {
    if(view!=null && view.canGoBack()) view.goBack(); else super.onBackPressed();
  }
  @Override protected void onDestroy(){ if(view!=null) view.destroy();super.onDestroy(); }
}
