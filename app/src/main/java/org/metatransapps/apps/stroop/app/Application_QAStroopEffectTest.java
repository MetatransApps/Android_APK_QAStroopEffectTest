package org.metatransapps.apps.stroop.app;


import org.metatransapps.apps.stroop.app.Application_EC;
import org.metatransapps.apps.stroop.cfg.ads.AdsConfigurations_EC;
import org.metatransapps.commons.ads.api.IAdsConfigurations;
import org.metatransapps.commons.cfg.appstore.IAppStore;


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
