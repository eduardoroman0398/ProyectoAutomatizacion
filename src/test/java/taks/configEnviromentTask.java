package taks;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import util.config;

import java.util.Objects;

public class configEnviromentTask extends config {


    public void browser()   {
        System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/src/main/java/drivers/msedgedriver.exe");
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new EdgeDriver(edgeOptions);//edgeOptions
        driver.manage().window().maximize();
    }

    public void tear(){
        driver.quit();
    }

    public void Estabilidad(String ambiente, String estabilidad){
        //if(ambiente == "QA"){}

        if (Objects.equals(ambiente, "QA") && Objects.equals(estabilidad, "si")){
            driver.get(QA);
            System.out.println("Ambiente de Prueba: "+ ambiente + "y la estabilidad es: " + estabilidad);
        } else if (Objects.equals(ambiente, "QA") && Objects.equals(estabilidad, "no")) {
            driver.get(UAT);
            System.out.println("Ambiente de Prueba: " + ambiente + " y la estabilidad es: " + estabilidad);
        }
    }


}
