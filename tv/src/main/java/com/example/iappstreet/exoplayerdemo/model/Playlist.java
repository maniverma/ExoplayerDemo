package com.example.iappstreet.exoplayerdemo.model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Playlist represents the contents of a full video playlist. This will also contain information on the current state of the playlist.
 *
 * @author Eric Lee<eric.lee@accedo.tv>
 * @since VIA Blocks 1.3
 */
public class Playlist implements Serializable {

    private final List<PlaylistItem> items;
    private Integer currentItemIdx;
    private PlaybackInfo currentPlaybackInfo;
    private Map<String, String> metadata;

    /**
     * Create a new {@link Playlist} instance.
     *
     * @param items The item list
     */
    public Playlist(final List<PlaylistItem> items) {
        this.items = new ArrayList<>(items);
        currentItemIdx = 0;
    }

    /**
     * Attempt to update the current item index to the next value. This will do nothing if the playlist is empty or if at the end of the playlist.
     */
    public void nextItem() {
        if (!items.isEmpty() && currentItemIdx < (items.size() - 1)) {
            currentItemIdx++;
        }
    }

    /**
     * Attempt to update the current item index to the previous value. This will do nothing if the playlist is empty or if at the beginning of the
     * playlist.
     */
    public void prevItem() {
        if (!items.isEmpty() && currentItemIdx > 0) {
            currentItemIdx--;
        }
    }

    /**
     * Set the {@link PlaybackInfo} object to represent the state of the current video playback state.
     *
     * @param currentPlaybackInfo The PlaybackInfo object
     */
    public void setCurrentPlaybackInfo(final PlaybackInfo currentPlaybackInfo) {
        this.currentPlaybackInfo = currentPlaybackInfo;
    }

    /**
     * Set the metadata values for the playlist.
     *
     * @param metadata The metadata values
     */
    public void setMetadata(final Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * Get the list of items in the playlist.
     *
     * @return The item list
     */
    public List<PlaylistItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    /**
     * Get the index of the playlist item that is currently playing.
     *
     * @return The current item index
     */
    public Integer getCurrentItemIndex() {
        return currentItemIdx;
    }

    /**
     * Get the {@link PlaybackInfo} object representing the current video playback's state.
     *
     * @return The PlaybackInfo object
     */
    public PlaybackInfo getCurrentPlaybackInfo() {
        return currentPlaybackInfo;
    }

    /**
     * Get the metadata values for the playlist.
     *
     * @return The metadata values
     */
    public Map<String, String> getMetadata() {
        if (metadata == null) {
            return new HashMap<>(0);
        }
        return Collections.unmodifiableMap(metadata);
    }

}