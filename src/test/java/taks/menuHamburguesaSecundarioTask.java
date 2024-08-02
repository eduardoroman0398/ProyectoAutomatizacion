package taks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import userInterface.menuHamburguesaSecundarioUI;
import util.config;

public class menuHamburguesaSecundarioTask extends config {

    public void click_cerrar_menu() throws InterruptedException {
        WebElement x = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"default-sidebar\"]/div/div/button/i")));
        x.click();
        Thread.sleep(5_000);
    }
    public void click_menu_hamburguesa() throws InterruptedException {
        menuHamburguesaSecundarioUI mHamburguesaSecundario = new menuHamburguesaSecundarioUI();

        mHamburguesaSecundario.boton_menu_hamburguesa.click();

    }

    public void seleccionar_una_opcion_del_menu(String opcionfiltro){
        WebElement actionButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'actionsAnalytics')]//button[.//span[text()='" + opcionfiltro + "']]")));
        actionButton.click();
    }

    public void seleccionar_marca(String MTU){
        // Esperar hasta que el dropdown sea clickeable y hacer clic para desplegar las opciones
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.text-orange .e-input-group.e-control-wrapper.e-ddl")));
        dropdown.click();

        // Construir el selector dinámico para la opción deseada y hacer clic
        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='e-input-group e-control-wrapper e-ddl']//ul/li[contains(text(), '" + MTU + "')]")));
        option.click();




    }


}
