package com.hatenablog.techium.samplelib;

import android.util.Log;

import hugo.weaving.DebugLog;

public class Module {

    @DebugLog
    public void show(String text) {
        Log.d("techium", text);
    }

}
