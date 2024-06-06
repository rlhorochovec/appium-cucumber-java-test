package br.rafaelhorochovec.appium.screen;

import br.rafaelhorochovec.appium.core.DriverFactory;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static br.rafaelhorochovec.appium.core.Config.TIME_DEFAULT;

public class ElementScreen extends DriverFactory {

    protected static MobileElement element(By by) {
        waitElement(by);
        return appiumDriver.findElement(by);
    }

    protected static void waitElement(By by) {
        appiumDriver.manage().timeouts().implicitlyWait(TIME_DEFAULT, TimeUnit.SECONDS);
    }
}
