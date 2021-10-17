package br.com.kinvo.tests;

import org.junit.Assert;
import org.junit.Test;

import br.com.kinvo.page.ContaPage;
import br.com.kinvo.utils.Utils;

public class ValidaConfirmarEmail extends Utils{

	ContaPage conta = new ContaPage();

	@Test
	public void valida_Confirmar_Email() {

		conta.setInteragir_Com_Campo_Nome("Kinvo");
		conta.setInteragir_Com_Campo_Email("kinvo@kinvo.com");
		conta.setInteragir_Com_Campo_Confirmar_Email("kinvo.kinvo.com");
		conta.setInteragir_Com_Campo_Senha("Kinvo@123");

		Assert.assertEquals("Este email não é válido", conta.getTextoErro("Este email não é válido"));
		
	}

}
