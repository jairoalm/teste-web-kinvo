package br.com.kinvo.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.kinvo.regraDeNegocio.tests.ValidaCampoNomeTest;
import br.com.kinvo.regraDeNegocio.tests.ValidaConfirmarEmailTest;
import br.com.kinvo.regraDeNegocio.tests.ValidaEmailTest;
import br.com.kinvo.regraDeNegocio.tests.ValidarCampoSenhaTest;


@RunWith(Suite.class)
@SuiteClasses({
	ValidaCampoNomeTest.class,
	ValidaEmailTest.class,
	ValidaConfirmarEmailTest.class,
	ValidarCampoSenhaTest.class
	
})
public class SuiteRegraDeNegocio {
	
}
