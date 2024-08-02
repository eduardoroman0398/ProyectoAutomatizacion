package userInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.config;

public class menuHamburguesaPrincipalUI extends config {

    public WebElement botonMenuPrincipal = driver.findElement(By.xpath("//*[@id=\"btn-menu\"]"));
}
