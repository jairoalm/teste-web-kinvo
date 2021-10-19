package br.com.kinvo.segurancaDeSenha.tests;

import org.junit.Assert;
import org.junit.Test;

import br.com.kinvo.page.CriarContaPage;
import br.com.kinvo.utils.Utils;

public class ValidarSemNumero extends Utils{
	
	CriarContaPage conta = new CriarContaPage();
	
	@Test
	public void test04_Validar_Sem_numero() {
		conta.setInteragir_Com_Campo_Nome("Kinvo");
		conta.setInteragir_Com_Campo_Email("kinvo@kinvo.com");
		conta.setInteragir_Com_Campo_Confirmar_Email("kinvo@kinvo.com");
		conta.setInteragir_Com_Campo_Senha("Kinvo@ki");

		Assert.assertEquals("Pelo menos 1 número", conta.getTextoErroSenha("Pelo menos 1 número"));
	}

}
