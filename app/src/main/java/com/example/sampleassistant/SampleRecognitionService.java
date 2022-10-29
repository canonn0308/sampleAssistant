package com.example.sampleassistant;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.speech.RecognitionService;
import android.util.Log;

import androidx.annotation.Nullable;

import static com.example.sampleassistant.Utility.LOG_TAG;
import static com.example.sampleassistant.Utility.getExecutor;

public class SampleRecognitionService extends RecognitionService {

    @Override
    protected void onStartListening(Intent recognizerIntent, Callback listener) {
        Log.e(LOG_TAG, getExecutor(this,new Object(){}));
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onCancel(Callback listener) {
        Log.e(LOG_TAG, getExecutor(this, new Object(){}));
    }

    @Override
    protected void onStopListening(Callback listener) {
        Log.e(LOG_TAG, getExecutor(this, new Object(){}));
    }
}
