package com.yudha.myticket;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    Animation app_splash,btt;
    ImageView app_logo;
    TextView app_subtitle;

    String USERNAME_KEY="usernamekey";
    String username_key="";
    String username_key_new="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getUsernameLocal();

        //Load Animasi
        app_splash= AnimationUtils.loadAnimation(this,R.anim.app_splash);
        btt=AnimationUtils.loadAnimation(this,R.anim.btt);

        //Load Element
        app_logo=findViewById(R.id.app_logo);
        app_subtitle=findViewById(R.id.app_subtitle);

        //Run Animasi
        app_logo.startAnimation(app_splash);
        app_subtitle.startAnimation(btt);
    }

    public void getUsernameLocal(){
        SharedPreferences sharedPreferences = getSharedPreferences(USERNAME_KEY,MODE_PRIVATE);
        username_key_new=sharedPreferences.getString(username_key,"");
        if (username_key_new.isEmpty()){
            //Setting timer 3 detik
            Handler handler= new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //Pindah ke activity lain
                    Intent gotogetstarted=new Intent(SplashActivity.this,GetStartedAct.class);
                    startActivity(gotogetstarted);
                    finish();
                }
            },2000); //2 Detik
        }
        else {
            //Setting timer 3 detik
            Handler handler= new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //Pindah ke activity lain
                    Intent gotohome=new Intent(SplashActivity.this,HomeAct.class);
                    startActivity(gotohome);
                    finish();
                }
            },2000); //2 Detik
        }
    }
}
