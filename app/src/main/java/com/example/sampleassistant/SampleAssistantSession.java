package com.example.sampleassistant;

import android.content.Context;
import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import android.service.voice.VoiceInteractionSessionService;
import android.util.Log;
import android.view.View;

import java.util.zip.Inflater;

public class SampleAssistantSession extends VoiceInteractionSession {
    private View mVoicePlate = null;

    @Override
    public void onShow(Bundle args, int showFlags) {
        mVoicePlate.setVisibility(View.VISIBLE);
        Log.e("TAKAKI2", "Creating " + this + "#onShow");
    }

    @Override
    public void onHide() {
        mVoicePlate.setVisibility(View.INVISIBLE);
        Log.e("TAKAKI2", "Creating " + this + "#onHide");

    }

    @Override
    public View onCreateContentView() {
        mVoicePlate = getLayoutInflater().inflate(R.layout.voice_plate,null);
        return mVoicePlate;
    }

    public SampleAssistantSession(Context context) {
        super(context);
        Log.e("TAKAKI2", "Creating " + this + "#SampleAssistantSession");
    }
}
