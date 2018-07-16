package pages;

import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import suporte.Generator;
import suporte.Screenshot;

public class ListProductPage {

    //variavel privada do tipo navegador
    private WebDriver navegador;

    //variavel do tipo teste para os screenshots
    public TestName test = new TestName();

    //construtor da classe
    public ListProductPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    //metodo para clicar num produto realizado pela busca 
    public ProductPage clicarProduto (){

        //clicar em um dos produtos apresentados
        navegador.findElement(By.className("product_img_link")).click();

        //retorna a propria pagina do produto para efetuar uma nova busca
        return new ProductPage(navegador);
    }
}
