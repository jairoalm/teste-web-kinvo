package br.com.kinvo.tests;

import org.junit.Assert;
import org.junit.Test;

import br.com.kinvo.page.ContaPage;
import br.com.kinvo.utils.Utils;

public class ValidarCampoSenha extends Utils{	

	ContaPage conta = new ContaPage();

	@Test
	public void valida_Campo_Senha() {

		conta.setInteragir_Com_Campo_Nome("Kinvo");
		conta.setInteragir_Com_Campo_Email("kinvo@kinvo.com");
		conta.setInteragir_Com_Campo_Confirmar_Email("kinvo@kinvo.com");
		conta.setInteragir_Com_Campo_Senha("k");
		conta.setLimpar_Campo_Senha_Com_Backspace();

		Assert.assertEquals("Por favor, digite sua senha.", conta.getTextoErro("Por favor, digite sua senha."));
		
	}

}
