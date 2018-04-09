package com.hydrotech.bagassaputro.hidroponikapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import ss.com.bannerslider.banners.Banner;
import ss.com.bannerslider.banners.RemoteBanner;
import ss.com.bannerslider.views.BannerSlider;

public class AboutActivity extends AppCompatActivity {
    private BannerSlider bannerSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

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

}
