package taks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import userInterface.subOpcionUI;
import util.config;

public class subOpcionTask extends config {

    public void clickEnSubOpcion(String sub_opcion) throws InterruptedException {
        //subOpcionUI subopcion = new subOpcionUI();
        WebElement subMenuItem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[contains(@class, 'int-sub-menu')]//li//p[text()='" + sub_opcion + "']")));
        subMenuItem.click();
        /*switch (sub_opcion) {
            case "Fee Summary" :
                subopcion.opcionFeeSummary.click();
                Thread.sleep(5_000);
                System.out.println("La subopcion seleccionada es: " + sub_opcion);
                return;

            case "Brand Files":
                subopcion.opcionBrandFiles.click();
                Thread.sleep(25_000);
                System.out.println("La subopcion seleccionada es: " + sub_opcion);
                return;


            case "Fee Validation":
                subopcion.opcionFeeValidation.click();
                Thread.sleep(50_000);
                System.out.println("La subopcion seleccionada es: " + sub_opcion);
                return;
        }*/
    }
}
