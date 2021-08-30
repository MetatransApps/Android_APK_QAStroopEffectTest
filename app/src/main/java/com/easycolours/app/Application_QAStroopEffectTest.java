package com.easycolours.app;


import org.metatransapps.commons.ads.api.IAdsConfigurations;
import org.metatransapps.commons.cfg.appstore.IAppStore;

import com.easycolours.cfg.ads.AdsConfigurations_EC;


public class Application_QAStroopEffectTest extends Application_EC {


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
