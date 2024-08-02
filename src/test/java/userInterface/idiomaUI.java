package userInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.config;

public class idiomaUI extends config {

    public WebElement idioma = driver.findElement(By.xpath("//*[@id=\"ej2_dropdownlist_0\"]/span/span"));
}
