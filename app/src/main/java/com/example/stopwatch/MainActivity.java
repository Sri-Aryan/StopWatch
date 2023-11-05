package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView sp;
    Button bt;
    ImageView img;
    Animation atg,btone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp=findViewById(R.id.textView);
        bt=findViewById(R.id.btnget);
        img=findViewById(R.id.ivsplash);

        atg= AnimationUtils.loadAnimation(this,R.anim.atg);
        btone=AnimationUtils.loadAnimation(this,R.anim.btone);

        bt.startAnimation(btone);
        img.startAnimation(atg);
        sp.startAnimation(btone);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a =new Intent(MainActivity.this,Watch.class);
                startActivity(a);
            }
        });
    }
}