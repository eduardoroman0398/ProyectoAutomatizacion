package taks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import userInterface.opcionUI;
import util.config;

public class opcionTask extends config {

    public void clickEnOpcion(String modulo) throws InterruptedException {
        WebElement menuItem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nav//ul//li//a//p[text()='" + modulo + "']")));
        menuItem.click();


        /*switch (modulo) {
            case "M&V Billing":
                wait.until(ExpectedConditions.elementToBeClickable(opcion.boton_mvbilling));
                opcion.boton_mvbilling.click();
                System.out.println("El módulo seleccionado es: " + modulo);
                return;
            case "M&V Interchange":
                wait.until(ExpectedConditions.elementToBeClickable(opcion.boton_mvinterchange));
                opcion.boton_mvinterchange.click();
                System.out.println("El módulo seleccionado es: " + modulo);
                return;
            case "Business Intelligence":
                wait.until(ExpectedConditions.elementToBeClickable(opcion.boton_businessIntelligence));
                opcion.boton_businessIntelligence.click();
                System.out.println("El módulo seleccionado es: " + modulo);
                return;
            case "Portfolio Management":
                opcion.boton_portfolioManagement.click();
                Thread.sleep(5_000);
                System.out.println("El módulo seleccionado es: " + modulo);
                return;
            case "File Exchange":
                opcion.boton_fileExchange.click();
                Thread.sleep(5_000);
                System.out.println("El módulo seleccionado es: " + modulo);
                return;
            case "Settings":
                opcion.boton_settings.click();
                Thread.sleep(5_000);
                System.out.println("El módulo seleccionado es: " + modulo);
                return;
            default:
                System.out.println("Módulo no encontrado: " + modulo);
                return;
        }

         */
    }
}

