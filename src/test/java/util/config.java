package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class config {

    public static WebDriver driver;
    public static JavascriptExecutor js;

    public static WebDriverWait wait;

    public config() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
    }

    public static String QA = "http://incontrolqa.intelica.com/login/es";
    public static String UAT = "https://uat.intelica.com/login/es";
    public static String PROD = "https://incontrol.intelica.com/login";


}
