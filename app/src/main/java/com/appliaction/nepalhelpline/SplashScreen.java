package com.appliaction.nepalhelpline;

import android.app.Activity;
import android.content.Intent;
import android.media.tv.TvContract;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.ProgressBar;
import android.widget.Toast;

/**
 * Created by Manandhar on 4/28/16.
 */
public class SplashScreen extends Activity {
    public ProgressBar br;
    int i=10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        br=(ProgressBar)findViewById(R.id.progressBar);
        br.setEnabled(true);
        CountDownTimer times = new CountDownTimer(4000, 100) {
            @Override
            public void onTick(long millisUntilFinished) {
                br.setProgress(i);
                i+=10;
            }

            @Override
            public void onFinish() {
                Intent inte=new Intent(SplashScreen.this,Kathmandu.class);
                startActivity(inte);
                SplashScreen.this.finish();
            }
        };
        times.start();
    }
}