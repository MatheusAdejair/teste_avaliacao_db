package teste;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import pages.InicialPage;
import suporte.Generator;
import suporte.Screenshot;
import suporte.Web;

public class procurarProdutosPageObjectsTest {
    private WebDriver navegador;


    @Before
    public void setUp(){
        navegador = Web.createChrome();
    }

    @Test
    public void procurarProdutosTest (){
    	
        new InicialPage(navegador)
                .clickLupa()
                .clicarProduto()
                .adicionaraoCarrinho()
                .adicionarNovoCliente()
                .confirmarCompra()
                ;
    }

    @After
    public void tearDown(){
        //navegador.quit();
    }
}
