adb uninstall com.android.launcher3.malin
gradle clean
gradle assembleDebug -x lint
adb install ./build/outputs/apk/Launcher3-aosp-debug.apk

