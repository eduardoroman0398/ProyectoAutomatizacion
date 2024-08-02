package userInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.config;

public class logeoUI extends config {

    public WebElement generate_token_boton = driver.findElement(By.id("btnTokenAnalytics"));

}
