package br.com.kinvo.segurancaDeSenha.tests;

import org.junit.Assert;
import org.junit.Test;
import br.com.kinvo.page.CriarContaPage;
import br.com.kinvo.utils.Utils;

public class ValidarComMenos8Caracteres extends Utils {

	CriarContaPage conta = new CriarContaPage();

	@Test
	public void validar_Com_Menos_8_Caracteres() {
		conta.setInteragir_Com_Campo_Nome("Kinvo");
		conta.setInteragir_Com_Campo_Email("kinvo@kinvo.com");
		conta.setInteragir_Com_Campo_Confirmar_Email("kinvo@kinvo.com");
		conta.setInteragir_Com_Campo_Senha("Kinvo@1");

		Assert.assertEquals("Mínimo de 8 caracteres", conta.getTextoErroSenha("Mínimo de 8 caracteres"));
	}
}
