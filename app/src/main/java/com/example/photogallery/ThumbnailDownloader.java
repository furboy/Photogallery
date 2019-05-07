package com.example.photogallery;

import android.os.HandlerThread;
import android.util.Log;

import java.util.logging.Handler;

public class ThumbnailDownloader<T> extends HandlerThread {

    private static final String TAG = "ThumbnailDownloader";
    private boolean mHasQuit = false;

    public ThumbnailDownloader() {
        super(TAG);
    }

    @Override
    public boolean quit(){
        mHasQuit = true;
        return super.quit();
    }


    public ThumbnailDownloader(String name) {
        super(TAG);
    }

    public void queueThumbnail(T target,String url){
        Log.i(TAG, "Get a URL: "+ url);
    }
}
