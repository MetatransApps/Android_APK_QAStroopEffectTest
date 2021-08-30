package org.metatrans.apps.stroop.app;


import org.metatrans.apps.stroop.app.Application_EC;
import org.metatrans.apps.stroop.cfg.ads.AdsConfigurations_EC;
import org.metatrans.commons.ads.api.IAdsConfigurations;
import org.metatrans.commons.cfg.appstore.IAppStore;


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
