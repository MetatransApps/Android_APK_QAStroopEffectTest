# License

The license is GPL-2.0-only

# Overview

This is the repository, which builds this Android game "Stroop Effect Test: Challenge and Test your Brain", https://metatransapps.com/stroop-effect-test-challenge-and-test-your-brain/ developed by Metatrans Apps.

# Build APK

In order to build it, you need to pull this repository as well as its dependencies in one and the same directory, because the Gradle build uses relative paths on the file system.
The dependencies are these 4 repositories:
  -  https://github.com/bagaturchess/MetatransApps_Android_LIB_Commons
  -  https://github.com/bagaturchess/MetatransApps_Android_LIB_CommonsAds
  -  https://github.com/bagaturchess/MetatransApps_Android_LIB_CommonsQuestionnaire
  -  https://github.com/bagaturchess/MetatransApps_Android_LIB_QAStroopEffectTest

Just pull all these 5 repositories (the current one + the 4 dependencies) in one and the same directory.
Then the structure could be imported in Android Studio or the Gradle build could be started manually.
