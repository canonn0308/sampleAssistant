package com.example.sampleassistant;

import android.os.Bundle;
import android.service.voice.VoiceInteractionService;
import android.service.voice.VoiceInteractionSession;
import android.service.voice.VoiceInteractionSessionService;
import android.util.Log;

import androidx.annotation.NonNull;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.example.sampleassistant.Utility.LOG_TAG;

public class SampleAssistantSessionService extends VoiceInteractionSessionService {

    @Override
    public VoiceInteractionSession onNewSession(Bundle args) {
        Log.e(LOG_TAG, Utility.getExecutor(this, new Object(){}));
//        try {
////            Thread.currentThread().wait(1000);
//            Log.e(LOG_TAG, "SleepStart");
//            Thread.sleep(5000);
//            Log.e(LOG_TAG, "SleepEnd");
//        } catch (InterruptedException e) {
//            Log.e(LOG_TAG, "###"+e.getMessage());
//        }
        return new SampleAssistantSession(this);
    }
}
