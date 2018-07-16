package pages;

import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import suporte.Generator;
import suporte.Screenshot;

public class InicialPage {

    //cria variavel de acesso ao navegador
    private WebDriver navegador;

    //variavel de teste usada para os screenshots
    public TestName test = new TestName();

    //classe construtora do tipo navegador
    public InicialPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public ListProductPage clickLupa(){
    	
        //inserindo no campo de pesquisa > valueid "search_query_top" o valor "Printed Dress"
        navegador.findElement(By.id("search_query_top")).sendKeys("Faded Short Sleeve T-shirts");

        //cria variável para salvar o screenshot > salva com data, hora e nome do arquivo
        String screenshotArquivo = "C:\\Users\\South System\\Documents\\teste_db" + Generator.dataHoraParaArquivo() + test.getMethodName() +  ".png";
        
        //executa ação de clicar no botão de lupa para buscar o produto
        navegador.findElement(By.name("submit_search")).click();
        String screenshotArquivo2 = "C:\\Users\\South System\\Documents\\teste_db" + Generator.dataHoraParaArquivo() + test.getMethodName() +  ".png";

        //retorna uma nova pÃ¡gina que Ã© a lista de produtos buscados pela palavra "Printed Dress"
        return new ListProductPage(navegador);
    }

}
