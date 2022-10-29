package com.example.sampleassistant;

import android.content.Context;
import android.os.Process;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class Utility {
    public static final String LOG_TAG = "VoiceAssistantHMI";

    static protected String getExecutor(Object object) {
        return object.getClass().getEnclosingClass() + "#" + object.getClass().getEnclosingMethod().getName();
    }

    static protected String getExecutor(Context context, Object object) {
        return context + "#" + Thread.currentThread().getStackTrace()[4].getMethodName()
                + " ID:" + Thread.currentThread().getName() + "/" + Thread.currentThread().getId()
                + " pID:" + Process.myPid();
    }
}
