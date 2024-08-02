package userInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.config;

public class menuHamburguesaSecundarioUI extends config {
    public WebElement boton_menu_hamburguesa = driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/button"));
}
