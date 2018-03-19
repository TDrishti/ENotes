package project.com.elearning;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

/**
 * Created by Utsav on 3/20/2018.
 */

public class PDFView extends Activity {

    WebView webView;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdfview);

        webView =findViewById(R.id.view);
        Bundle message=getIntent().getExtras();
        String get_url = (String) message.get("URL");
        webView.loadUrl(get_url);
        Toast.makeText(this, get_url, Toast.LENGTH_SHORT).show();

//        startWebView(get_url);
    }

    private void startWebView(final String get_url) {

        webView.setWebViewClient(new WebViewClient() {
            ProgressDialog progressDialog;


            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    view.loadUrl(request.getUrl().toString());
                }
                else
                    view.loadUrl(String.valueOf(get_url));
                return true;
            }

            public void onLoadResource (WebView view, String url) {
                if (progressDialog == null) {
                    progressDialog = new ProgressDialog(PDFView.this);
                    progressDialog.setMessage("Loading...");
                    progressDialog.show();
                }
            }

            public void onPageFinished(WebView view, String url) {
                try{
                    if (progressDialog.isShowing()) {
                        progressDialog.dismiss();
                    }
                }catch(Exception exception){
                    exception.printStackTrace();
                }
            }

        });

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(String.valueOf(get_url));
    }
}
