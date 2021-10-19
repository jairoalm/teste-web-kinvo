package br.com.kinvo.segurancaDeSenha.tests;

import org.junit.Assert;
import org.junit.Test;

import br.com.kinvo.page.CriarContaPage;
import br.com.kinvo.utils.Utils;

public class ValidarSemCaracteresEspeciais extends Utils{
	
	CriarContaPage conta = new CriarContaPage();
	
	@Test
	public void test05_Validar_Sem_Caracteres_Especiais() {
		conta.setInteragir_Com_Campo_Nome("Kinvo");
		conta.setInteragir_Com_Campo_Email("kinvo@kinvo.com");
		conta.setInteragir_Com_Campo_Confirmar_Email("kinvo@kinvo.com");
		conta.setInteragir_Com_Campo_Senha("Kinvo123");

		Assert.assertEquals("Pelo menos 1 Caracter especial", conta.getTextoErroSenha("Pelo menos 1 Caracter especial"));
	}

}
