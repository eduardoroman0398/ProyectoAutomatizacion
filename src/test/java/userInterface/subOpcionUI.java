package userInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.config;

public class subOpcionUI extends config {

    public WebElement opcionFeeSummary = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[4]/ul/li[1]/a"));
    public WebElement opcionBrandFiles = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[4]/ul/li[3]/a/div"));

    public WebElement opcionFeeValidation = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[4]/ul/li[10]/a/div"));
}
