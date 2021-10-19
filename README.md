Documento para o projeto web Kinvo
#Web-Front-Kinvo

Come�o:

Este projeto � um teste de automa��o onde nele, conseguir� executar localmente em sua m�quina, atrav�s de uma c�pia, para fins de desenvolvimento (caso necess�rio), consulte na implanta��o, nas notas de como implantar o projeto em um sistema em funcionamento.

#Pr�-requisitos

Aqui est� tudo que precisa ser instalado e como instalar para que o software seja executado corretamente.

#Ferramentas utilizadas:

 - Eclipse
 - Maven
 - JUnit
 - Selenium (framework)
 - Chrome (Navegador utilizado)

#Instala��o de ambiente:

 - Eclipse (utilizado) ou IDE do seu gosto
 - SDK - Instalar o sdk manager
 - JDK - Instalar o adoptOpen JDK - Versao instalada 15.0.0.36_hotspot
 - Java - Instalado Jre vers�o 1.8.0_301 ou o mais atual
 - Maven - Instalar o Apache Maven
 - Selenium
 - JUnit
 - Driver - ChromeDriver.exe, Geckodriver.exe, IDEDriverServer.exe

#Instalar plugins:
 - Maven No arquivo pom.xml deve ser instalado as dependencias do MAVEN, library escolhida para este projeto
 - Site utilizado: https://mvnrepository.com/
 - No site do mvn repository, informar qual a dependencia que ser� criada no arquivo pom.xml
 - criar " " depois da linha de propriedades e inserir dentro dessa tag das dependencias referente ao "MAVEN" conforme documento do projeto.
 
OBS.: Sempre instalar com a vers�o mais atual das dependencias ou a mais proxima das que forem instaladas (seguindo a maioria dos sites onde est�o com maior estabilidade).

#Ambiente de versionamento:

 - GitHubDesktop (opicional)
 - Pacote Git (utilizado muito o Git bash)
 - Linguagem de programa��o:
 - Java
 - Ambiente testado:
 - Front End (Web)
 - Executando os testes
 - Como executar:

Na pasta br.com.kinvo.tests tem um arquivo ContaTest e na pasta br.com.kinvo.suite tem dois arquivos SuiteRegraDeNegocio.java e SuiteSeguran�adeSenha Clica-se com o bot�o direiro do mouse em cima do arquivo e clica em Run As -> 1 JUnit Test Ou dentro da Classe: realizando o mesmo caminho.

O que testar e porque: Est� testando uma p�gina WEB front end do site da empresa Kinvo onde � necess�rio validar o fluxo de criar conta. Porque � um processo essencial para que o usu�rio posso ter acesso ao perfil de sua carteira e gereciar seus financiementos.

Estoria
Como usu�rio (cliente) do site Kinvo Eu quero que o sistema relize o cadastro corretamente para eu tenha acesso a p�gina de resumo de carteira e visualizar minhas aplica��es.

#Para Implantar

 - Ter permiss�o de administrador da m�quina, sen�o, n�o conseguir� realizar o processo.
 - Instalar todos os programas mencionados no item de #Ferramentas", "#Instala��o de ambiente" e "Plugins", acima;

#Sites e p�ginas relacionadas

 - MVN Repository para instalar as dependencias do Maven, Cucumber, Java, Gherkin, Selenium
 - [MVN] https://mvnrepository.com/
 - [selenium] https://www.selenium.dev/
 - [jdk 8 - kit] https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html
 - [sdk] https://developer.microsoft.com/pt-br/windows/downloads/sdk-archive/
 - [Maven - Apache] https://maven.apache.org/
 - [Eclipse] https://www.eclipse.org/downloads/
 - [GeckoDriver] https://github.com/mozilla/geckodriver/releases
 - [Chrome Driver/ WebDriver] https://chromedriver.chromium.org/downloads
 - [Git] https://git-scm.com/
 - [Sourcetree] https://www.sourcetreeapp.com/ (para ajudar no versionamento com o GIT)
 - [Git Hub Desktop - opicional] https://desktop.github.com/
 - [Backspace no selenium] https://www.ti-enxame.com/pt/selenium-webdriver/campo-de-texto-claro-usando-tecla-delete-ou-back-space-no-webdriver/823553417/
 
#Nota geral

Com o rob� de automa��o n�o foi poss�vel finalizar o fluxo at� o final por causa do "Recaptcha" antes do bot�o "Criar". 

Obs: Em automa��o Web o uso do recaptcha deve ser discutido internamente para que aplica��o que for liberado para os testes essa op��o seja desativada. Isso facilita o desenvolvimento da automa��o. 

#Dica

Na aplica��o frontend de acordo com as boas pr�ticas de desenvolvemento os elementos devem ter um ID para identifica��o. Na aplica��o foi poss�vel identificar os elementos do formul�rio usando Xpath. 

 
#Para ver o versionamento desse codigo consulte

#Autor(a) (QA) Jairo Almeida

#No GIT cont�m o projeto

[Git - Projeto Automa��o] https://github.com/jairoalm/teste-web-kinvo