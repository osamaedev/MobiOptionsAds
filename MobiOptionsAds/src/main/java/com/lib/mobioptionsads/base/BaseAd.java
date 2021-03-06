package com.lib.mobioptionsads.base;

import android.os.Handler;
import android.os.Looper;

import com.lib.mobioptionsads.MobiOptionsAdsInit;
import com.lib.mobioptionsads.data.remote.model.MobiSetting;

public abstract class BaseAd {

    private final Handler handler = new Handler(Looper.getMainLooper());
    private MobiSetting mobiSetting = MobiOptionsAdsInit.mobiSetting;

    private final boolean isTesting = MobiOptionsAdsInit.testingMode;

    public boolean isTesting() {
        return isTesting;
    }

    public boolean isAppIsAfterDelay() {
        return MobiOptionsAdsInit.appIsStartedAfterDelay;
    }

    private String bannerId = "----";
    private String rewardedAdId = "----";
    private String interstitialAdId = "----";
    private String nativeAdId = "----";
    private String unityGameId = MobiOptionsAdsInit.mobiSetting.getUnityGameId();


    public void setMobiSetting(MobiSetting mobiSetting) {
        this.mobiSetting = mobiSetting;
    }

    public String getUnityGameId() {
        return unityGameId;
    }

    public void setUnityGameId(String unityGameId) {
        this.unityGameId = unityGameId;
    }

    public String getBannerId() {
        return bannerId;
    }

    public void setBannerId(String bannerId) {
        this.bannerId = bannerId;
    }

    public String getRewardedAdId() {
        return rewardedAdId;
    }

    public void setRewardedAdId(String rewardedAdId) {
        this.rewardedAdId = rewardedAdId;
    }

    public String getInterstitialAdId() {
        return interstitialAdId;
    }

    public void setInterstitialAdId(String interstitialAdId) {
        this.interstitialAdId = interstitialAdId;
    }

    public String getNativeAdId() {
        return nativeAdId;
    }

    public void setNativeAdId(String nativeAdId) {
        this.nativeAdId = nativeAdId;
    }

    public Handler getHandler() {
        return handler;
    }

    protected MobiSetting getMobiSetting() {
        return mobiSetting;
    }

    protected abstract void setupMobiSettings(String adName);

    protected void destroy() {
        this.handler.removeCallbacks(null);
    }
}
