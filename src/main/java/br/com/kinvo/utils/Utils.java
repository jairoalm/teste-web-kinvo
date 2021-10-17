package br.com.kinvo.utils;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Utils {
		
	@Before
	public void inicializar(){		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");		
		DriverFactory.getDriver().get("https://app.kinvo.com.br/inscreva-se");		
	}
	/*@After
	public void finaliza(){
		DriverFactory.getDriver().quit();
	}*/
}
