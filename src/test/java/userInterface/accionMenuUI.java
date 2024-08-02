package userInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.config;

public class accionMenuUI extends config {

    public WebElement opcion_Filters = driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[1]/div[2]/button[2]"));
}
