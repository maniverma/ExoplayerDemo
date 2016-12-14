package com.example.iappstreet.exoplayerdemo.model;

import java.io.Serializable;

/**
 * Created by iappstreet on 14/12/16.
 */

public class PlaybackInfo implements Serializable {

    private final Double duration;

    private Double currentTime;
    private PlaybackState playbackState;

    /**
     * Create a new {@link PlaybackInfo} instance.
     *
     * @param duration The video playback's duration value; this must be a positive value
     */
    public PlaybackInfo(final double duration) {
        if (duration < 0) {
            throw new IllegalArgumentException("The duration value is invalid");
        }
        this.duration = duration;
        currentTime = 0.0;
    }

    /**
     * Set the video playback's current time.
     *
     * @param currentTime The current time value
     */
    public void setCurrentTime(final Double currentTime) {
        this.currentTime = currentTime;
    }

    /**
     * Set the video playback's current state.
     *
     * @param playbackState The current playback state
     */
    public void setPlaybackState(final PlaybackState playbackState) {
        this.playbackState = playbackState;
    }

    /**
     * Get the video playback's current time.
     *
     * @return The current time value
     */
    public Double getCurrentTime() {
        return currentTime;
    }

    /**
     * Get the video playback's duration.
     *
     * @return The duration value
     */
    public Double getDuration() {
        return duration;
    }

    /**
     * Get the video playback's state.
     *
     * @return The playback state
     */
    public PlaybackState getPlaybackState() {
        return playbackState;
    }

    /**
     * Enum containing PlaybackState value.
     */
    public enum PlaybackState {
        /**
         * This value indicates the video playback is not yet ready (e.g., the video is being prepared, loaded, or buffered).
         */
        NOT_READY,
        /**
         * This value indicates the video playback is currently in the paused state.
         */
        PAUSED,
        /**
         * This value indicates the video playback is currently in the playing state.
         */
        PLAYING
    }
}