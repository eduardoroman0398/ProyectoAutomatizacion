package userInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.config;

public class credencialesUI extends config {

    public WebElement usuario = driver.findElement(By.id("userLogin"));

    public WebElement password = driver.findElement(By.id("pwd"));


}
