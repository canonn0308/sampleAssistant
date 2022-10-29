package com.example.sampleassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static com.example.sampleassistant.Utility.LOG_TAG;
import static com.example.sampleassistant.Utility.getExecutor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(LOG_TAG,getExecutor(this, new Object(){}));
        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(
                v -> {
                    boolean flg;
//                    try {
//                        Thread.sleep(10000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    Log.e(LOG_TAG,getExecutor(this, new Object(){}));
                    flg = showAssist(null);
                    Log.e(LOG_TAG,getExecutor(this, new Object(){}));
                }
        );
    }
}