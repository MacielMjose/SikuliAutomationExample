package br.com.renner.ecomex.testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import br.com.renner.ecomex.tasks.TelaFaturaTask;

public class CriarFaturaTestCase {
	
private TelaFaturaTask fatura;
private Screen screen;
	
	@Before
	
	public void setup() throws FindFailed{
		screen = new Screen();
		fatura = new TelaFaturaTask(screen);
		fatura.clicaTelaFatura();
	}
	
	@Test
	public void criaFatura() throws FindFailed{
		fatura.incluiInvoice("TSTInvoice", "TSTProforma", "324");
		fatura.incluiFabricante("761011405", "761011405");
		fatura.incluiNegociacao("08042020", "08042020", "A VISTA", "FOB", "USD");
	}
	
	@After
	public void fechaFatura() {
		// TODO Auto-generated method stubs

	}

}
