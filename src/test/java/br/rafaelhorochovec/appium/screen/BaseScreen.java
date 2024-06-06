package br.rafaelhorochovec.appium.screen;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BaseScreen extends ElementScreen {

    public static WebDriver driver;

    public static void escrever(By by, String texto) {
        element(by).sendKeys(texto);
    }

    public static void clicar(By by) {
        element(by).click();
    }

    static void limpar(By by) {
        element(by).clear();
    }

    static boolean existeElemento(By by) {
        return element(by).isDisplayed();
    }

    protected static void selecionarTab(By by) {
        element(by).sendKeys(Keys.TAB);
    }

    protected static String obterTexto(By by) {
        return element(by).getText();
    }

    protected static String isCheckMarcado(By by, String True) {
        return element(by).getAttribute(True);
    }

    protected static String isCheckDesmarcado(By by, String False) {
        return element(by).getAttribute(False);
    }

    public static void scrollDown(int qtdScroll) {
        org.openqa.selenium.Dimension size = appiumDriver.manage().window().getSize();
        // calculate coordinates for vertical swipe
        int startVerticalY = (int) (size.height * 0.05);
        int endVerticalY = (int) (size.height * 0.45);
        int startVerticalX = (int) (size.width * 0.5);

        for (int i = 0; i < qtdScroll; i++) {
            TouchAction action = new TouchAction(appiumDriver);
            action.press(PointOption.point(startVerticalY, startVerticalX))
                    .waitAction(new WaitOptions().withDuration(Duration.ofMillis(500))) //you can change wait durations as per your requirement
                    .moveTo(PointOption.point(endVerticalY, startVerticalY))
                    //.moveTo(PointOption.point(startVerticalY, endVerticalY))
                    .release()
                    .perform();
        }
    }

    public static void scrollUp(int qtdScroll) {
        org.openqa.selenium.Dimension size = appiumDriver.manage().window().getSize();
        // calculate coordinates for vertical swipe
        int startVerticalY = (int) (size.height * 0.45);
        int endVerticalY = (int) (size.height * 0.45);
        int startVerticalX = (int) (size.width * 0.5);

        for (int i = 0; i < qtdScroll; i++) {
            TouchAction action = new TouchAction(appiumDriver);
            action.press(PointOption.point(startVerticalY,startVerticalX))
                    .waitAction(new WaitOptions().withDuration(Duration.ofMillis(500))) //you can change wait durations as per your requirement
                    .moveTo(PointOption.point(endVerticalY,startVerticalY))
                    //.moveTo(PointOption.point(startVerticalY, endVerticalY))
                    .release()
                    .perform();
        }
    }

    public static void swipeLeft(int qtdSwipes) {
        org.openqa.selenium.Dimension size = appiumDriver.manage().window().getSize();
        // calculate coordinates for vertical swipe
        int startHorizontallX = (int) (size.width * 0.1);
        int endHorizontalX = (int) (size.width * 0.95);
        int startVerticaly = (int) (size.height * 0.5);

        for (int i = 0; i < qtdSwipes; i++) {
            TouchAction action = new TouchAction(appiumDriver);
            action.press(PointOption.point(startHorizontallX, startVerticaly))
                    .waitAction(new WaitOptions().withDuration(Duration.ofMillis(1000))) //you can change wait durations as per your requirement
                    .moveTo(PointOption.point(endHorizontalX, startVerticaly))
                    .release()
                    .perform();
        }
    }

    public static void swipeRight(int qtdSwipes) {
        org.openqa.selenium.Dimension size = appiumDriver.manage().window().getSize();
        // calculate coordinates for vertical swipe
        int startHorizontallX = (int) (size.width * 0.95);
        int endHorizontalX = (int) (size.width * 0.1);
        int startVerticaly = (int) (size.height * 0.5);

        for (int i = 0; i < qtdSwipes; i++) {
            TouchAction action = new TouchAction(appiumDriver);
            action.press(PointOption.point(startHorizontallX, startVerticaly))
                    .waitAction(new WaitOptions().withDuration(Duration.ofMillis(1000))) //you can change wait durations as per your requirement
                    .moveTo(PointOption.point(endHorizontalX, startVerticaly))
                    .release()
                    .perform();
        }
    }
}