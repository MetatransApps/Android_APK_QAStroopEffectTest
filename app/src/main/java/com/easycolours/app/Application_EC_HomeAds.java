package com.easycolours.app;


import com.apps.mobile.android.commons.ads.api.IAdsConfigurations;
import com.apps.mobile.android.commons.cfg.appstore.IAppStore;
import com.easycolours.cfg.ads.AdsConfigurations_EC;


public class Application_EC_HomeAds extends Application_EC {


	@Override
	public IAppStore getAppStore() {
		return IAppStore.OBJ_FDROID_OFFICIAL;
	}


	protected IAdsConfigurations adsConfigurations = new AdsConfigurations_EC(this);


	@Override
	public IAdsConfigurations getAdsConfigurations() {
		return adsConfigurations;
	}
}
