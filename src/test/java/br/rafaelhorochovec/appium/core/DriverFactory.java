package br.rafaelhorochovec.appium.core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static br.rafaelhorochovec.appium.core.Config.TIME_SERVER;
import static io.appium.java_client.remote.MobileCapabilityType.*;
import static org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME;

public class DriverFactory {

    public static AppiumDriver<MobileElement> appiumDriver;
    public static WebDriverWait wait;


    public static AppiumDriver<MobileElement> criarDriver() {

        try{
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability(PLATFORM_NAME, Config.PLATFORM_ANDROID);
            cap.setCapability(PLATFORM_VERSION, Config.VERSAO_ANDROID);
            cap.setCapability(DEVICE_NAME,Config.NAME_DEVICE);
            cap.setCapability(APP,  Config.PATH_APP);
            appiumDriver = new AppiumDriver<>(new URL(Config.PATH_URL_APPIUM), cap);
            appiumDriver.manage().timeouts().implicitlyWait(TIME_SERVER, TimeUnit.SECONDS);

        }catch (MalformedURLException e) {
            System.out.println( e.getMessage() );
        }
        return appiumDriver;
    }

    public static AppiumDriver<MobileElement> getDriver() {
        if(appiumDriver == null){
            criarDriver();
        }
        return appiumDriver;
    }

    public static void closeDriver() {
        if(appiumDriver != null) {
            appiumDriver.quit();
            appiumDriver = null;
        }
    }

    public static void relaunchApp() {
        appiumDriver.launchApp();
    }
}