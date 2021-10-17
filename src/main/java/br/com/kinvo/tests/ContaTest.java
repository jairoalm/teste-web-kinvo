package br.com.kinvo.tests;

import org.junit.Assert;
import org.junit.Test;
import br.com.kinvo.utils.*;
import br.com.kinvo.page.*;

public class ContaTest extends Utils{
	
	ContaPage conta = new ContaPage();

	@Test
	public void valida_Criar_Conta_Usuário(){
		conta.setInteragir_Com_Campo_Nome("Kinvo");
		conta.setInteragir_Com_Campo_Email("kinvo@kinvo.com");
		conta.setInteragir_Com_Campo_Confirmar_Email("kinvo@kinvo.com");
		conta.setInteragir_Com_Campo_Senha("Kinvo@123");
		conta.clicar_Recaptcha();	
		
		//Assert.assertEquals("Cadastro de DEVs", cadastro.getCapturarTexto());
		
		//System.out.println(cadastro.getCapturarTexto());		
	}	
}
