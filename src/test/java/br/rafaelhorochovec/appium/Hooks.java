package br.rafaelhorochovec.appium;

import br.rafaelhorochovec.appium.core.DriverFactory;
import br.rafaelhorochovec.appium.screen.BaseScreen;
import br.rafaelhorochovec.appium.util.Screen;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

import java.io.File;
import java.net.MalformedURLException;

public class Hooks {

    @After //import cucumber.api.java.After;
    public void after(Scenario scenario) throws MalformedURLException {
        //if (scenario.isFailed()) {
            File screenshot = Screen.gerarScreenShot(scenario);
            Screen.anexarScreenshot(screenshot, scenario.getName());
        //}
        DriverFactory.relaunchApp();
    }
}
