package com.example.sampleassistant;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.service.voice.AlwaysOnHotwordDetector;
import android.service.voice.VoiceInteractionService;
import android.util.Log;

import androidx.annotation.NonNull;

import com.example.sampleservice.ISamplServiceInterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import static android.content.ContentValues.TAG;
import static com.example.sampleassistant.Utility.LOG_TAG;
import static com.example.sampleassistant.Utility.getExecutor;

public class SampleAssistantService extends VoiceInteractionService {
    ISamplServiceInterface iSampleServiceInterface;
    private ServiceConnection conn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            Log.e(LOG_TAG,"onServiceConnected");
            iSampleServiceInterface = ISamplServiceInterface.Stub.asInterface(service);
            try {
                iSampleServiceInterface.setMessage("Connect Success");
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.e(LOG_TAG,"onServiceDisconnected");
            iSampleServiceInterface = null;
        }
    };

    private static final List<String> SUPPORTED_VOICE_ACTIONS =
            Arrays.asList(
            );

    @Override
    public void showSession(Bundle args, int flags) {
        super.showSession(args, flags);
        Log.e(LOG_TAG, getExecutor(this, new Object(){}));
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e(LOG_TAG, getExecutor(this, new Object(){}));
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onCreate() {
        Log.e(LOG_TAG, getExecutor(this, new Object(){}));
        super.onCreate();

        Log.e(LOG_TAG,"BootService");
        Intent bootIntent = new Intent("com.example.sampleservice/.SampleService");
        bootIntent.setClassName("com.example.sampleservice","com.example.sampleservice.SampleService");
        bindService(bootIntent,conn, Context.BIND_AUTO_CREATE);
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.e(LOG_TAG, getExecutor(this, new Object(){}));
        return super.onBind(intent);
    }

    @Override
    public void onShutdown() {
        super.onShutdown();
        Log.e(LOG_TAG, getExecutor(this, new Object(){}));
    }

    @Override
    public void onReady() {
        super.onReady();
        Log.e(LOG_TAG, getExecutor(this, new Object(){}));
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
