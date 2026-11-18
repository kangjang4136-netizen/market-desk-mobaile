package kr.marketdesk.mobile;

import android.app.Activity;
import android.os.Bundle;
import android.os.Build;
import android.webkit.*;
import androidx.webkit.WebViewAssetLoader;

public final class MainActivity extends Activity {
    @Override public void onCreate(Bundle state) {
        super.onCreate(state);
        WebView view = new WebView(this);
        setContentView(view);
        if (Build.VERSION.SDK_INT >= 35) {
            view.setOnApplyWindowInsetsListener((v, insets) -> {
                android.graphics.Insets i = insets.getInsets(android.view.WindowInsets.Type.systemBars() | android.view.WindowInsets.Type.displayCutout());
                v.setPadding(i.left, i.top, i.right, i.bottom);
                return insets;
            });
            view.requestApplyInsets();
        }
        view.getSettings().setJavaScriptEnabled(true);
        view.getSettings().setDomStorageEnabled(true);
        view.getSettings().setAllowFileAccess(false);
        view.getSettings().setAllowContentAccess(false);
        WebViewAssetLoader loader = new WebViewAssetLoader.Builder()
            .addPathHandler("/assets/", new WebViewAssetLoader.AssetsPathHandler(this)).build();
        view.setWebViewClient(new WebViewClient() {
            @Override public WebResourceResponse shouldInterceptRequest(WebView v, WebResourceRequest r) {
                return loader.shouldInterceptRequest(r.getUrl());
            }
            @Override public boolean shouldOverrideUrlLoading(WebView v, WebResourceRequest r) {
                return !"https".equals(r.getUrl().getScheme()) || !"appassets.androidplatform.net".equals(r.getUrl().getHost());
            }
        });
        view.setWebChromeClient(new WebChromeClient());
        view.loadUrl("https://appassets.androidplatform.net/assets/index.html");
    }
}
