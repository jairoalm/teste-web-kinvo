package br.com.kinvo.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.kinvo.segurancaDeSenha.tests.ValidarComLetrasMaiusculas;
import br.com.kinvo.segurancaDeSenha.tests.ValidarComLetrasMinusculas;
import br.com.kinvo.segurancaDeSenha.tests.ValidarComMenos8Caracteres;
import br.com.kinvo.segurancaDeSenha.tests.ValidarSemCaracteresEspeciais;
import br.com.kinvo.segurancaDeSenha.tests.ValidarSemNumero;

@RunWith(Suite.class)
@SuiteClasses({
	ValidarComMenos8Caracteres.class,
	ValidarComLetrasMaiusculas.class,
	ValidarComLetrasMinusculas.class,
	ValidarSemNumero.class,
	ValidarSemCaracteresEspeciais.class
	
})
public class SuiteSegurancaDeSenha {

}
