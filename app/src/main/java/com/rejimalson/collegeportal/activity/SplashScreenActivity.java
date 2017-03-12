package com.rejimalson.collegeportal.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.rejimalson.collegeportal.R;
import com.rejimalson.collegeportal.config.AppConfig;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread thread = new Thread(){

            @Override
            public void run() {
                super.run();
                try {
                    Thread.sleep(AppConfig.SPLASH_SCREEN_TIME);
                    Intent intent = new Intent(getBaseContext(),HomeScreenActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }
}
