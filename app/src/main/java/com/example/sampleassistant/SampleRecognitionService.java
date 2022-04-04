package com.example.sampleassistant;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.speech.RecognitionService;
import android.util.Log;

import androidx.annotation.Nullable;

public class SampleRecognitionService extends RecognitionService {

    @Override
    protected void onStartListening(Intent recognizerIntent, Callback listener) {
        Log.e("TAKAKI2", "Creating " + this + "#onStartListening");
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onCancel(Callback listener) {
        Log.e("TAKAKI2", "Creating " + this + "#onCancel");
    }

    @Override
    protected void onStopListening(Callback listener) {
        Log.e("TAKAKI2", "Creating " + this + "#onStopListening");
    }
}
