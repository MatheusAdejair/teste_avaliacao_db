package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver createChrome(){
        //abrindo navegador
        System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //navegando até o site da loja
        navegador.get("http://automationpractice.com/");

        return navegador;
    }
}
