package br.com.kinvo.regraDeNegocio.tests;

import org.junit.Assert;
import org.junit.Test;

import br.com.kinvo.page.CriarContaPage;
import br.com.kinvo.utils.Utils;

public class ValidaCampoNomeTest extends Utils {
	CriarContaPage conta = new CriarContaPage();

	@Test
	public void valida_Campo_Nome() {

		conta.setInteragir_Com_Campo_Nome("K");
		conta.setLimpar_Campo_Nome_Com_Backspace();
		conta.setInteragir_Com_Campo_Email("kinvo@kinvo.com");
		conta.setInteragir_Com_Campo_Confirmar_Email("kinvo@kinvo.com");
		conta.setInteragir_Com_Campo_Senha("Kinvo@123");

		Assert.assertEquals("Por favor, digite seu nome", conta.getTextoErro("Por favor, digite seu nome"));

	}

}
