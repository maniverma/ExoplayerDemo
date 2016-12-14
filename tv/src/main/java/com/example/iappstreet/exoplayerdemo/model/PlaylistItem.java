package com.example.iappstreet.exoplayerdemo.model;

import android.text.TextUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by iappstreet on 14/12/16.
 */



public class PlaylistItem implements Serializable {

    public static final String ASSET_SERIES_ID = "seriesId";
    public static final String ASSET_EPISODE_NUMBER = "episodeNumber";
    public static final String ASSET_TV_SEASON_ID = "seasonId";
    public static final String ASSET_SEASON_NUMBER = "seasonNumber";
    public static final String ASSET_PROGRAM_TYPE = "programType";
    public static final String ASSET_PAYMENT_TYPE = "assetPaymentType";
    public static final String ASSET_GENRE = "genre";
    public static final String ASSET_AUDIO_LANGUAGE = "audio_lang";
    private final String id;
    private String recentCallId;
    private String url;
    private String releaseUrl;
    private Map<String, String> metadata;
    private Map<String, Object> drmAttributes;
    private boolean hasAd;
    private boolean hasUrl;
    private boolean checkForEntitlement;
    private boolean isTrailer;
    private boolean isLocallyAvailable;
    private long resumePoint;

    public boolean hasAd() {
        return hasAd;
    }

    public void setHasAd(boolean hasAd) {
        this.hasAd = hasAd;
    }

    public ArrayList<String> getAdUrls() {
        return mAdUrls;
    }

    public boolean hasUrl() {
        return hasUrl;
    }

    public void setHasUrl(boolean hasUrl) {
        this.hasUrl = hasUrl;
    }

    public void setAdUrls(String mAdUrls) {
        if(this.mAdUrls == null)
            this.mAdUrls = new ArrayList<>();
        this.mAdUrls.add(mAdUrls);
    }

    private ArrayList<String> mAdUrls;

    public static final String ASSET_TITLE = "asset_title";
    public static final String ASSET_DESCRIPTION = "asset_description";
    public static final String ASSET_POSTER_IMG = "asset_poster_img";
    public static final String ASSET_LANDSCAPE_IMG = "asset_landscape_img";
    public static final String ASSET_CPID = "asset_cpid";
    public static final String ASSET_IMDB_RATING = "imdb_rating";
    public static final String ASSET_SUBTEXT = "asset_subtext";
    public static final String ASSET_VIDEO_DURATION = "asset_duration";


    /**
     * Create a new {@link PlaylistItem} instance.
     *
     * @param id The item ID
     */
    public PlaylistItem(final String id) {
        if (TextUtils.isEmpty(id)) {
            throw new IllegalArgumentException("The provided ID value is missing or invalid");
        }
        this.id = id;
        hasUrl = false;
        hasAd = false;
        checkForEntitlement = false;
    }

    /**
     * Set the playlist item's URL.
     *
     * @param url The item's URL
     */
    public void setUrl(final String url) {
        this.url = url;
    }

    /**
     * Set the metadata values for the playlist item.
     *
     * @param metadata The metadata values
     */
    public void setMetadata(final Map<String, String> metadata) {
        this.metadata = new HashMap<>(metadata);
    }

    /**
     * Set the DRM attributes for the playlist item.
     *
     * @param drmAttributes The DRM attributes
     */
    public void setDrmAttributes(final Map<String, Object> drmAttributes) {
        this.drmAttributes = new HashMap<>(drmAttributes);
    }

    /**
     * Get the playlist item's ID.
     *
     * @return The item ID
     */
    public String getId() {
        return id;
    }

    /**
     * Get the playlist item's URL.
     *
     * @return The item's URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * Get the playlist item's metadata values.
     *
     * @return The metadata values
     */
    public Map<String, String> getMetadata() {
        if (metadata == null) {
            return new HashMap<>(0);
        }
        return Collections.unmodifiableMap(metadata);
    }

    /**
     * Get the playlist item's DRM attributes.
     *
     * @return The DRM attributes
     */
    public Map<String, Object> getDrmAttributes() {
        if (drmAttributes == null) {
            return new HashMap<>(0);
        }
        return Collections.unmodifiableMap(drmAttributes);
    }
    public long getResumePoint() {
        return resumePoint;
    }

    public void setResumePoint(long resumePoint) {
        this.resumePoint = resumePoint;
    }

    public boolean isTrailer() {
        return isTrailer;
    }

    public void setTrailer(boolean isTrailer) {
        this.isTrailer = isTrailer;
    }


    public String getRecentCallId() {
        return recentCallId;
    }

    public void setRecentCallId(String recentCallId) {
        this.recentCallId = recentCallId;
    }

    public String getReleaseUrl() {
        return releaseUrl;
    }

    public void setReleaseUrl(String releaseUrl) {
        this.releaseUrl = releaseUrl;
    }

    public boolean isLocallyAvailable() {
        return isLocallyAvailable;
    }

    public void setLocallyAvailable(boolean isLocallyAvailable) {
        this.isLocallyAvailable = isLocallyAvailable;
    }
    public boolean isCheckForEntitlement() {
        return checkForEntitlement;
    }

    public void setCheckForEntitlement(boolean checkForEntitlement) {
        this.checkForEntitlement = checkForEntitlement;
    }

}