package br.com.kinvo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import br.com.kinvo.utils.DriverFactory;

public class CriarContaPage extends BasePage {

	public void setInteragir_Com_Campo_Nome(String texto) {
		escrever(By.xpath("//input[@name='name']"), texto);
	}

	public void setInteragir_Com_Campo_Email(String texto) {
		escrever(By.xpath("//input[@name='email']"), texto);
	}

	public void setInteragir_Com_Campo_Confirmar_Email(String texto) {
		escrever(By.xpath("//input[@name='emailConfirmation']"), texto);
	}

	public void setInteragir_Com_Campo_Senha(String texto) {
		escrever(By.xpath("//input[@name='password']"), texto);
	}

	public void clicar_Recaptcha() {
		JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.getDriver();
		jse.executeScript("window.scrollBy(0,250)", "");
		new WebDriverWait(DriverFactory.getDriver(), 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By
				.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));
		new WebDriverWait(DriverFactory.getDriver(), 20)
				.until(ExpectedConditions.elementToBeClickable((By.xpath("//div[@class='recaptcha-checkbox-border']"))))
				.click();

	}

	public void botaoCriarConta() {
		clicar(By.xpath("//button[@type='submit']"));
	}

	public String getTextoErro(String valor) {
		return obterTextoBy(By.xpath("//span[text()='" + valor + "']"));
	}

	public String getTextoErroSenha(String valor) {
		return obterTextoBy(By.xpath("//label[text()='" + valor + "']"));
	}

	public void setLimpar_Campo_Nome_Com_Backspace() {
		backspace(By.xpath("//input[@name='name']"));
	}

	public void setLimpar_Campo_Senha_Com_Backspace() {
		backspace(By.xpath("//input[@name='password']"));
	}

}
