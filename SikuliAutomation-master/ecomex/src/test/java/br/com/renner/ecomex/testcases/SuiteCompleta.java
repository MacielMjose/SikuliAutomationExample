package br.com.renner.ecomex.testcases;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import br.com.renner.ecomex.testcases.LoginTestCase;
import br.com.renner.ecomex.testcases.VerificarPedidoTestCase;


@RunWith(Suite.class)
@SuiteClasses({LoginTestCase.class, VerificarPedidoTestCase.class,CriarFaturaTestCase.class})

public class SuiteCompleta {
	//classe responsavel pela ordem dos test cases
}
