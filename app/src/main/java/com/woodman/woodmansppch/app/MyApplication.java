package com.woodman.woodmansppch.app;

import android.app.Application;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;
import com.woodman.woodmansppch.utils.RecognitionManager;
import com.woodman.woodmansppch.utils.SynthesisManager;

/**
 * Created by $woodman on 2018/2/24.
 * 功能:
 * 修改时间：
 * 修改备注：
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SpeechUtility.createUtility(this, SpeechConstant.APPID + "=5a54cba7");
        RecognitionManager.getSingleton().init(this,"5a54cba7");
        SynthesisManager.getSingleton().init(this,"5a54cba7");

    }

}
