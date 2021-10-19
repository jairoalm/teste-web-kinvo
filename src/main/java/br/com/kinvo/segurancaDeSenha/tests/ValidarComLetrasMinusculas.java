package br.com.kinvo.segurancaDeSenha.tests;

import org.junit.Assert;
import org.junit.Test;

import br.com.kinvo.page.CriarContaPage;
import br.com.kinvo.utils.Utils;

public class ValidarComLetrasMinusculas extends Utils{
	
	CriarContaPage conta = new CriarContaPage();
	
	@Test
	public void test03_Validar_Com_Letras_Minusculas() {
		conta.setInteragir_Com_Campo_Nome("Kinvo");
		conta.setInteragir_Com_Campo_Email("kinvo@kinvo.com");
		conta.setInteragir_Com_Campo_Confirmar_Email("kinvo@kinvo.com");
		conta.setInteragir_Com_Campo_Senha("kinvo@123");

		Assert.assertEquals("Pelo menos 1 letra maiúscula", conta.getTextoErroSenha("Pelo menos 1 letra maiúscula"));
	}
}
