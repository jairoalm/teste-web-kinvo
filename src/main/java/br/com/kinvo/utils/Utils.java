package br.com.kinvo.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Utils {
	
	@Rule
	public TestName testName = new TestName();
		
	@Before
	public void inicializar(){		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");		
		DriverFactory.getDriver().get("https://app.kinvo.com.br/inscreva-se");		
	}
	
	@After
	public void finaliza() throws IOException {		
			
		TakesScreenshot ss = (TakesScreenshot) DriverFactory.getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);		
		FileUtils.copyFile(arquivo, new File("target" + 
		File.separator + "screenshot" + File.separator + testName.getMethodName() + ".jpg"));
		if (Propriedade.FECHAR_BROWSER){
			//DriverFactory.killDriver();
		}	
	}
}
