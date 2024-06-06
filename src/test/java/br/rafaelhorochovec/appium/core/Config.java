package br.rafaelhorochovec.appium.core;

public class Config {

    public static final String NAME_APK = "app-debug.apk";

    // Nomes device
    public static final String VERSAO_ANDROID = "14.0";
    public static final String NAME_DEVICE = "Pixel_3a_API_34_extension_level_7_x86_64";

    // Config Path
    public static final String PATH_APP = "D:/dev/idea-workspace/appium-cucumber-java-test/src/test/resources/app/" + NAME_APK;
    public static final String PATH_URL_APPIUM = "http://127.0.0.1:4723/wd/hub";

    // Config Plataforma
    public static final String PLATFORM_ANDROID = "Android";
    public static final String PLATFORM_IOS = "Ios";

    // Config Time
    public static final int TIME_SERVER = 30;
    public static final int TIME_DEFAULT = 15;
}
