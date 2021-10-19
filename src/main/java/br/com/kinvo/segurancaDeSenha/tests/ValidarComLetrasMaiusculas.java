package br.com.kinvo.segurancaDeSenha.tests;

import org.junit.Assert;
import org.junit.Test;

import br.com.kinvo.page.CriarContaPage;
import br.com.kinvo.utils.Utils;

public class ValidarComLetrasMaiusculas extends Utils {

	CriarContaPage conta = new CriarContaPage();

	@Test
	public void test02_Validar_Com_Letras_Maiusculas() {
		conta.setInteragir_Com_Campo_Nome("Kinvo");
		conta.setInteragir_Com_Campo_Email("kinvo@kinvo.com");
		conta.setInteragir_Com_Campo_Confirmar_Email("kinvo@kinvo.com");
		conta.setInteragir_Com_Campo_Senha("KINVO@123");

		Assert.assertEquals("Pelo menos 1 letra minúscula", conta.getTextoErroSenha("Pelo menos 1 letra minúscula"));
	}
}
