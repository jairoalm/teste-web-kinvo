Documento para o projeto web Kinvo
#Web-Front-Kinvo

Começo:

Este projeto é um teste de automação onde nele, conseguirá executar localmente em sua máquina, através de uma cópia, para fins de desenvolvimento (caso necessário), consulte na implantação, nas notas de como implantar o projeto em um sistema em funcionamento.

#Pré-requisitos

Aqui está tudo que precisa ser instalado e como instalar para que o software seja executado corretamente.

#Ferramentas utilizadas:

 - Eclipse
 - Maven
 - JUnit
 - Selenium (framework)
 - Chrome (Navegador utilizado)

#Instalação de ambiente:

 - Eclipse (utilizado) ou IDE do seu gosto
 - SDK - Instalar o sdk manager
 - JDK - Instalar o adoptOpen JDK - Versao instalada 15.0.0.36_hotspot
 - Java - Instalado Jre versão 1.8.0_301 ou o mais atual
 - Maven - Instalar o Apache Maven
 - Selenium
 - JUnit
 - Driver - ChromeDriver.exe, Geckodriver.exe, IDEDriverServer.exe

#Instalar plugins:
 - Maven No arquivo pom.xml deve ser instalado as dependencias do MAVEN, library escolhida para este projeto
 - Site utilizado: https://mvnrepository.com/
 - No site do mvn repository, informar qual a dependencia que será criada no arquivo pom.xml
 - criar " " depois da linha de propriedades e inserir dentro dessa tag das dependencias referente ao "MAVEN" conforme documento do projeto.
 
OBS.: Sempre instalar com a versão mais atual das dependencias ou a mais proxima das que forem instaladas (seguindo a maioria dos sites onde estão com maior estabilidade).

#Ambiente de versionamento:

 - GitHubDesktop (opicional)
 - Pacote Git (utilizado muito o Git bash)
 - Linguagem de programação:
 - Java
 - Ambiente testado:
 - Front End (Web)
 - Executando os testes
 - Como executar:

Na pasta br.com.kinvo.tests tem um arquivo ContaTest e na pasta br.com.kinvo.suite tem dois arquivos SuiteRegraDeNegocio.java e SuiteSegurançadeSenha Clica-se com o botão direiro do mouse em cima do arquivo e clica em Run As -> 1 JUnit Test Ou dentro da Classe: realizando o mesmo caminho.

O que testar e porque: Está testando uma página WEB front end do site da empresa Kinvo onde é necessário validar o fluxo de criar conta. Porque é um processo essencial para que o usuário posso ter acesso ao perfil de sua carteira e gereciar seus financiementos.

Estoria
Como usuário (cliente) do site Kinvo Eu quero que o sistema relize o cadastro corretamente para eu tenha acesso a página de resumo de carteira e visualizar minhas aplicações.

#Para Implantar

 - Ter permissão de administrador da máquina, senão, não conseguirá realizar o processo.
 - Instalar todos os programas mencionados no item de #Ferramentas", "#Instalação de ambiente" e "Plugins", acima;

#Sites e páginas relacionadas

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

Com o robô de automação não foi possível finalizar o fluxo até o final por causa do "Recaptcha" antes do botão "Criar". 

Obs: Em automação Web o uso do recaptcha deve ser discutido internamente para que aplicação que for liberado para os testes essa opção seja desativada. Isso facilita o desenvolvimento da automação. 

#Dica

Na aplicação frontend de acordo com as boas práticas de desenvolvemento os elementos devem ter um ID para identificação. Na aplicação foi possível identificar os elementos do formulário usando Xpath. 

 
#Para ver o versionamento desse codigo consulte

#Autor(a) (QA) Jairo Almeida

#No GIT contém o projeto

[Git - Projeto Automação] https://github.com/jairoalm/teste-web-kinvo