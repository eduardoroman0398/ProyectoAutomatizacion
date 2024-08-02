package userInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.config;

public class perfilUI extends config {

    public WebElement labelPerfil = driver.findElement(By.xpath("//*[@id=\"ej2_dropdownlist_1\"]/span/input"));
}
