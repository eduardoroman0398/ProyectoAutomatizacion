package taks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import userInterface.perfilUI;
import util.config;


public class perfilTask extends config {

    public void ingresarPerfil(String perfil) throws InterruptedException {
        perfilUI test = new perfilUI();
        wait.until(ExpectedConditions.elementToBeClickable(test.labelPerfil));
        test.labelPerfil.click();
        test.labelPerfil.sendKeys(perfil);

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
    }


}
