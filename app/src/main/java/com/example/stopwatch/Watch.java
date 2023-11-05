package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;

public class Watch extends AppCompatActivity {
    Button bt,btstop;
    Animation rounding;
    ImageView anc;
    Chronometer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch);

        bt=findViewById(R.id.btnget1);
        anc=findViewById(R.id.anchor);
        btstop=findViewById(R.id.btnget2);
        timer=findViewById(R.id.timer);

        btstop.setAlpha(0);
        rounding= AnimationUtils.loadAnimation(this,R.anim.rounding);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anc.startAnimation(rounding);
                btstop.animate().alpha(1).setDuration(300).start();

                timer.setBase(SystemClock.elapsedRealtime());
                timer.start();
            }
        });

            btstop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    anc.clearAnimation();
                    timer.stop();
                }
            });

    }
}