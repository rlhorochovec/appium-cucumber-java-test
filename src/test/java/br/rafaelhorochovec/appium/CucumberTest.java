package br.rafaelhorochovec.appium;

import br.rafaelhorochovec.appium.core.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
public class CucumberTest {

    @Before
    public static void tearUp() {
        DriverFactory.getDriver();
    }

    @After
    public static void tearDown() {
        DriverFactory.closeDriver();
    }
}
