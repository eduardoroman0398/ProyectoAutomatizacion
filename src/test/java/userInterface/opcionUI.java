package userInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.config;

public class opcionUI extends config {

    public WebElement boton_mvbilling = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[4]/a"));
    public WebElement boton_mvinterchange = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[5]/a"));
    public WebElement boton_businessIntelligence = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[6]/a/div"));
    public WebElement boton_portfolioManagement = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[7]/a/div"));
    public WebElement boton_fileExchange = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[8]/a"));
    public WebElement boton_settings = driver.findElement(By.xpath("//*[@id=\"default-sidebar\"]/div/nav/ul/li[9]/a"));

    /* reemplazar los xpath correlativos por el usuario de Kate*/

}
