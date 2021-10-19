package br.com.kinvo.regraDeNegocio.tests;

import org.junit.Assert;
import org.junit.Test;

import br.com.kinvo.page.CriarContaPage;
import br.com.kinvo.utils.Utils;

public class ValidaEmailTest extends Utils{
	
	CriarContaPage conta = new CriarContaPage();
	
	@Test
	public void valida_Campo_Email(){
		
		conta.setInteragir_Com_Campo_Nome("Kinvo");
		conta.setInteragir_Com_Campo_Email("kinvo.kinvo.com");
		conta.setInteragir_Com_Campo_Confirmar_Email("kinvo@kinvo.com");
		conta.setInteragir_Com_Campo_Senha("Kinvo@123");
		
		Assert.assertEquals("Este email não é válido", conta.getTextoErro("Este email não é válido"));
		Assert.assertEquals("A confirmação difere do e-mail inserido", conta.getTextoErro("A confirmação difere do e-mail inserido"));
		
		//System.out.println(conta.getTextoErro("Erros"));	
	}

}
