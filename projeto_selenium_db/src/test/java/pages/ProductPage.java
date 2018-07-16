package pages;

import org.junit.rules.TestName;
import org.junit.rules.Verifier;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import suporte.Generator;
import suporte.Screenshot;

import static org.junit.Assert.assertEquals;

public class ProductPage {

    //variavel do tipo webdriver
    private WebDriver navegador;

    //criacao de variavel tipo teste para os screenshots
    public TestName test = new TestName();

    //construtor da clase
    public ProductPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    //método para adicionar produto ao carrinho
    public ProductPage adicionaraoCarrinho(){
        //comando que executa ação que adiciona o produto a carrinho de compras
        navegador.findElement(By.id("add_to_cart")).click();

        //cria variável para salvar do tipo webdriver wait
        WebDriverWait aguardar = new WebDriverWait(navegador, 10);

        //comando que executa ação para continuar o checkout de compra
        navegador.findElement(By.partialLinkText("Proceed to checkout")).click();

        // validacoes sobre os produtos adicionados ao carrinho
        assertEquals("Faded Short Sleeve T-shirts", navegador.findElement(By.linkText("Faded Short Sleeve T-shirts")).getText());
        
      //comando que executa ação para continuar o checkout de compra
        navegador.findElement(By.partialLinkText("Proceed to checkout")).click();
        
        return this;
    }
    
    public ProductPage adicionarNovoCliente() {
   	 //inserindo inserindo novo e-mail para iniciar criação de novo registro de cliente"
       navegador.findElement(By.id("email_create")).sendKeys("teste_db20@dbteste.com");
       
     //submetendo validação do sistema para novo registro de cliente
       navegador.findElement(By.id("SubmitCreate")).click();
       
     //Ações para o preechimento do formulário dados do cliente  
       navegador.findElement(By.id("id_gender1")).click();
       
       navegador.findElement(By.id("customer_firstname")).click();
       navegador.findElement(By.id("customer_firstname")).sendKeys("nome de teste");
       
       navegador.findElement(By.id("customer_lastname")).click();
       navegador.findElement(By.id("customer_lastname")).sendKeys("sobrenome de teste");
       
       navegador.findElement(By.id("passwd")).click();
       navegador.findElement(By.id("passwd")).sendKeys("002588");
       
       navegador.findElement(By.id("days")).click();
       new Select(navegador.findElement(By.id("days"))).selectByValue("12");
       navegador.findElement(By.id("days")).click();
       
       navegador.findElement(By.id("months")).click();
       new Select(navegador.findElement(By.id("months"))).selectByValue("12");
       navegador.findElement(By.id("months")).click();
       
       navegador.findElement(By.id("years")).click();
       new Select(navegador.findElement(By.id("years"))).selectByValue("2000");
       
       navegador.findElement(By.id("years")).click();
       navegador.findElement(By.id("firstname")).click();
       navegador.findElement(By.id("lastname")).click();
       navegador.findElement(By.id("company")).click();
       
       navegador.findElement(By.id("company")).sendKeys("empresa teste");
       navegador.findElement(By.id("address1")).click();

       navegador.findElement(By.id("address1")).sendKeys("002588");
       navegador.findElement(By.id("city")).click();

       navegador.findElement(By.id("city")).sendKeys("novayork");
       navegador.findElement(By.id("id_state")).click();
       
       new Select(navegador.findElement(By.id("id_state"))).selectByVisibleText("New York");
       navegador.findElement(By.id("id_state")).click();
       
       navegador.findElement(By.id("postcode")).click();
       navegador.findElement(By.id("postcode")).sendKeys("10001");
       
       navegador.findElement(By.id("phone_mobile")).click();
       navegador.findElement(By.id("phone_mobile")).sendKeys("555189896589");
       
       navegador.findElement(By.id("alias")).click();
       navegador.findElement(By.id("alias")).sendKeys("My address23");
       navegador.findElement(By.xpath("//button[@id='submitAccount']/span")).click();
       
	 
     return this;
   }
    
    public ProductPage confirmarCompra() {
    
        WebElement teste = navegador.findElement(By.xpath("//ul[@id='address_delivery']/li[7]"));
        boolean validacaoElemento = teste.toString().contains("555189896589");
        System.out.println(teste.toString());
    	
 	   navegador.findElement(By.xpath("//div[@id='center_column']/form/p/button/span")).click();
 	   navegador.findElement(By.id("cgv")).click();
 	   navegador.findElement(By.xpath("//form[@id='form']/p/button/span")).click();
 	   navegador.findElement(By.xpath("//div[@id='HOOK_PAYMENT']/div/div/p/a/span")).click();
 	   navegador.findElement(By.xpath("//p[@id='cart_navigation']/button/span")).click();
    	
    	return this;
    	
    }
    
}
