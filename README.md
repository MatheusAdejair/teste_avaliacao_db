# projeto_selenium_db
Script de teste em selenium webdriver para a busca de produtos em uma loja virtual - Site demo. 

O teste automatizado consiste em buscar o produto "Faded Short Sleeve T-shirts", seleciona-lo, adicionar ao carrinho de compras e efetivar a compra.

Para execução do teste devem ser seguidos os seguintes passos:

1 - Fazer download do eclipse - versão atual disponível no site https://www.eclipse.org/

2 - Atualizar dependências do arquivo POM.xml que se fizerem necessárias para atender as versões atuais de cada ferramenta / framework 

3 - Alterar a informação dentro da classe "public ProductPage adicionarNovoCliente()"
Deve incrementar + 1 para o usuário de e-mail, dado que não criei um código de geração de e-mails a fim de agilizar esta entrega
---> navegador.findElement(By.id("email_create")).sendKeys("teste_db2X@dbteste.com");

4 - Configurar os caminhos de pastas para armazear evidências - caso seja necessário

