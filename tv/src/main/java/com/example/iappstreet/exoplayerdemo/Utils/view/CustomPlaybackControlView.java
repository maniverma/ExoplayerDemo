package com.example.iappstreet.exoplayerdemo.Utils.view;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;

import com.google.android.exoplayer2.ui.PlaybackControlView;

/**
 * Created by iappstreet on 15/12/16.
 */

public class CustomPlaybackControlView extends PlaybackControlView {

   public  CustomPlaybackControlView(Context context){
        super(context);
    }


    public CustomPlaybackControlView(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
    }

    public void show() {
        if(!this.isVisible()) {
            this.setVisibility(VISIBLE);
//            if(this.visibilityListener != null) {
//                this.visibilityListener.onVisibilityChange(this.getVisibility());
//            }
//
//            this.updateAll();
        }

//        this.hideAfterTimeout();
    }

    public void onAttachedToWindow() {

//        super.onAttachedToWindow();
//        this.isAttachedToWindow = true;
//        if(this.hideAtMs != -9223372036854775807L) {
//            long delayMs = this.hideAtMs - SystemClock.uptimeMillis();
//            if(delayMs <= 0L) {
//                this.hide();
//            } else {
//                this.postDelayed(this.hideAction, delayMs);
//            }
//        }

//        this.updateAll();
    }
}
