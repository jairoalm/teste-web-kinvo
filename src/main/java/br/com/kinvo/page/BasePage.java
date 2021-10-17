package br.com.kinvo.page;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import br.com.kinvo.utils.DriverFactory;

public class BasePage {	
	
	/***** Texto *****/
	public void escrever(By by, String texto){
		DriverFactory.getDriver().findElement(by).sendKeys(texto);
	}
	public void escrever(String id, String texto){
		escrever(By.id(id),(texto));
	}
			
	/***** Botão *****/
	public void clicar(By by){
		DriverFactory.getDriver().findElement(by).click();
	}
	public void clicar(String id){
		clicar(By.id(id));
	}
	
	/***** Texto *****/
	public String obterTexto(String id){
		return DriverFactory.getDriver().findElement(By.id(id)).getText();		
	}
	public String obterTextoBy(By by){
		return DriverFactory.getDriver().findElement(by).getText();		
	}
	
	public void limparCampo(By by){
		DriverFactory.getDriver().findElement(by).clear();		
	}
	
	public void backspace(By by){
		DriverFactory.getDriver().findElement(by).sendKeys(Keys.BACK_SPACE);
	}

}
