package com.deenquest.game;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;
public class MainActivity extends Activity {
 WebView web;
 @Override public void onCreate(Bundle b){ super.onCreate(b); web=new WebView(this); web.setWebViewClient(new WebViewClient()); WebSettings s=web.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); s.setAllowFileAccess(true); web.loadUrl("file:///android_asset/index.html"); setContentView(web); }
 @Override public void onBackPressed(){ if(web.canGoBack())web.goBack();else super.onBackPressed(); }
}
