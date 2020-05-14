package com.sano.k.forzamotorcar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;


public class MainActivity extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;
    private AdView mAdView;







    private ImageView imageseries,imageintro,imagecars,imagetricks,imagetopten,imageone;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageseries =(ImageView) findViewById(R.id.imageseries);
        imageintro=(ImageView) findViewById(R.id.imageintro);
        imagetopten=(ImageView) findViewById(R.id.imagetopten);
        imageone=(ImageView) findViewById(R.id.imageone);
        imagecars=(ImageView) findViewById(R.id.imagecars);
        imagetricks=(ImageView) findViewById(R.id.imagetricks);

        initAdmobad();








        // first btn introduction

        imageintro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivityintro();
            }

            private void moveToActivityintro() {

                Intent intent = new Intent(MainActivity.this, Activityintro.class);
                startActivity(intent);





            }
        });


        //Tricks

        imagetricks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivitytricks();
            }

            private void moveToActivitytricks() {

                Intent intent = new Intent(MainActivity.this, Activitytricks.class);
                startActivity(intent);





            }
        });

        //Tricks button

        // last btn cars

        imagecars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivitycars();
            }

            private void moveToActivitycars() {

                Intent intent = new Intent(MainActivity.this, Activitycars.class);
                startActivity(intent);

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                    mInterstitialAd.loadAd(new AdRequest.Builder().build());
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                    mInterstitialAd.loadAd(new AdRequest.Builder().build());
                }


            }
        });


// cars btn end


        imageseries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivityseries();
            }
        });

        //3 topten

        imagetopten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivitytopten();
            }

            private void moveToActivitytopten() {

                Intent intent = new Intent(MainActivity.this, Activitytopten.class);
                startActivity(intent);

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                    mInterstitialAd.loadAd(new AdRequest.Builder().build());
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                    mInterstitialAd.loadAd(new AdRequest.Builder().build());
                }




            }
        });


        //activity one or Forza Motorcar Tips
        imageone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivityone();
            }

            private void moveToActivityone() {

                Intent intent = new Intent(MainActivity.this, Activityone.class);
                startActivity(intent);

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                    mInterstitialAd.loadAd(new AdRequest.Builder().build());
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                    mInterstitialAd.loadAd(new AdRequest.Builder().build());
                }

            }
        });






    }


    //admob intestial adunit

    private void initAdmobad() {
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-6165143774808397/4378172362");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());



        //banner
        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-6165143774808397/3256662382");
// TODO: Add adView to your view hierarchy.
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    // Series motorcar
    private void moveToActivityseries(){
        Intent intent = new Intent(MainActivity.this, Activityseries.class);
        startActivity(intent);
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.loadAd(new AdRequest.Builder().build());
        } else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
            mInterstitialAd.loadAd(new AdRequest.Builder().build());
        }






        //T R I C K S FORZA motorcar

        imagetricks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivittricks();

            }

            private void moveToActivittricks() {
                Intent intent = new Intent(MainActivity.this, Activitytricks.class);
                startActivity(intent);

            }
        });

    }














}
