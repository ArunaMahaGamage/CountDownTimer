package com.aruna.countdowntimer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView countDown;
    TextView finish;
    Button btn_start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countDown = findViewById(R.id.tv_count_down);
        finish = findViewById(R.id.tv_finshed);
        btn_start = findViewById(R.id.btn_start);

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDown();
            }
        });
    }

    private void countDown() {
        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                countDown.setText("seconds remaining: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                finish.setText("done!");
            }
        }.start();


    }
}
