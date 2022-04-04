package com.example.sampleassistant;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.service.voice.AlwaysOnHotwordDetector;
import android.service.voice.VoiceInteractionService;
import android.util.Log;

import androidx.annotation.NonNull;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import static android.content.ContentValues.TAG;

public class SampleAssistantService extends VoiceInteractionService {
    private static final List<String> SUPPORTED_VOICE_ACTIONS =
            Arrays.asList(
            );

    @Override
    public void showSession(Bundle args, int flags) {
        super.showSession(args, flags);
        Log.e("TAKAKI2", "Creating " + this + "#showSession");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e("TAKAKI2", "Creating " + this + "#onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onCreate() {
        Log.e("TAKAKI2", "Creating " + this + "#onCreate");
        super.onCreate();
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.e("TAKAKI2", "Creating " + this + "#onBind");
        return super.onBind(intent);
    }

    @Override
    public void onShutdown() {
        super.onShutdown();
        Log.e("TAKAKI2", "Creating " + this + "#onShutdown");
    }

    @Override
    public void onReady() {
        super.onReady();
        Log.e("TAKAKI2", "Creating " + this + "#onReady");
        // TODO: Setup hotword detector
    }

    @NonNull
    @Override
    public Set<String> onGetSupportedVoiceActions(
            @NonNull Set<String> voiceActions) {
        Set<String> result = new HashSet<>(voiceActions);
        result.retainAll(SUPPORTED_VOICE_ACTIONS);
        return result;
    }
}
