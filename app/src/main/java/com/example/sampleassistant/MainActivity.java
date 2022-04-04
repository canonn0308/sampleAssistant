package com.example.sampleassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(
                v -> {
                    boolean flg;
                    Log.e("TAKAKI2","================START====================");
                    flg = showAssist(null);
                    Log.e("TAKAKI2","BootingResult : " + flg);
                }
        );
    }
}