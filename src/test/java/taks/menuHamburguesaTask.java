package taks;

import org.openqa.selenium.support.ui.ExpectedConditions;
import userInterface.menuHamburguesaPrincipalUI;
import util.config;

public class menuHamburguesaTask extends config {

    public void clickMenuHamburguesaPrincipal() throws InterruptedException {
        menuHamburguesaPrincipalUI menu = new menuHamburguesaPrincipalUI();
        wait.until(ExpectedConditions.elementToBeClickable(menu.botonMenuPrincipal));
        menu.botonMenuPrincipal.click();

    }
}
