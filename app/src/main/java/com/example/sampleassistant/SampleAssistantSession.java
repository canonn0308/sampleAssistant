package com.example.sampleassistant;

import android.content.Context;
import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import android.service.voice.VoiceInteractionSessionService;
import android.util.Log;
import android.view.View;

import java.util.zip.Inflater;

import static com.example.sampleassistant.Utility.LOG_TAG;
import static com.example.sampleassistant.Utility.getExecutor;

public class SampleAssistantSession extends VoiceInteractionSession {
    private View mVoicePlate = null;

    @Override
    public void onShow(Bundle args, int showFlags) {
//        try {
//            Log.e(LOG_TAG, "SleepStart");
//            Thread.sleep(5000);
//            Log.e(LOG_TAG, "SleepEnd");
//        } catch (InterruptedException e) {
//            Log.e(LOG_TAG, "###"+e.getMessage());
//        }

        mVoicePlate.setVisibility(View.VISIBLE);
        Log.e(LOG_TAG, "Session#onShow");
        Log.e(LOG_TAG, getExecutor(getContext(), new Object(){}));
    }

    @Override
    public void onHide() {
        mVoicePlate.setVisibility(View.INVISIBLE);
        Log.e(LOG_TAG, "Session#onHide");
        Log.e(LOG_TAG, getExecutor(getContext(),new Object(){}));

    }

    @Override
    public View onCreateContentView() {
        mVoicePlate = getLayoutInflater().inflate(R.layout.voice_plate,null);
        return mVoicePlate;
    }

    public SampleAssistantSession(Context context) {
        super(context);
        Log.e(LOG_TAG, getExecutor(getContext(),new Object(){}));
    }
}
