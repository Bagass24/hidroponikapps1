package com.hydrotech.bagassaputro.hidroponikapps;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import ss.com.bannerslider.banners.Banner;
import ss.com.bannerslider.banners.RemoteBanner;
import ss.com.bannerslider.views.BannerSlider;

public class OnProcessActivity extends AppCompatActivity {
    private WebView view;
    private BannerSlider bannerSlider;
    private final String url = "https://www.polines.ac.id/id/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_process);

        view = (WebView)this.findViewById(R.id.wv_pH_tds);
        view.getSettings().setJavaScriptEnabled(true);
        view.setWebChromeClient(new MieAyam());
        view.loadUrl("http://kartikafarm.smart-gh.com");

                            //BUAT ARRAY LIST BUAT NAMPUNG DATA SLIDERNYA
                            BannerSlider bannerSlider = (BannerSlider) findViewById(R.id.banner_slider1);
                            List<Banner> banners=new ArrayList<>();

                            //NAMBAH GAMBAR TAPI PAKAI SOURCE URL
                            banners.add(new RemoteBanner(
                                    "https://4.bp.blogspot.com/-U2R2Sf-Y0uU/VdiME80sOyI/AAAAAAAAAdU/KWjA7PQjH9E/s1600/Sirkulasi%2BNFT.png.jpg"
                            ));
                            banners.add(new RemoteBanner(
                                    "http://www.flairform.com/hints/NFT_system_popup.gif"
                            ));
                            banners.add(new RemoteBanner(
                                    "http://www.pertanian99.com/wp-content/uploads/2017/11/Kebun-Hidroponik.jpg"
                            ));
                            banners.add(new RemoteBanner(
                                    "http://sentrabudidaya.com/wp-content/uploads/2017/09/Cara-menanam-hidroponik-dengan-botol-bekas-1.jpg"
                            ));
                            bannerSlider.setBanners(banners);}

    private class MieAyam extends WebChromeClient {
        public boolean shouldOverrideUrlLoading (WebView View, String url) {
            view.loadUrl(url);
            return true;
    }
}
}
