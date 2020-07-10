package br.com.renner.ecomex.testcases;

import java.sql.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import br.com.renner.ecomex.tasks.CadastroTaxasTask;
import br.com.renner.ecomex.tasks.LoginTask;

public class CadastroTaxaTestCase {

	private static CadastroTaxasTask taxa;
	private static Screen screen;
	private static String projectPath = System.getProperty("user.dir") + "\\src\\main\\resources\\exec\\frmservlet.jnlp";

	@Before
	public void setup() {
		screen = new Screen();
		taxa = new CadastroTaxasTask(screen);
	}
	
	@Test
	public void CadastrarTaxaUSD() throws FindFailed {
		
		Date todayDate = new Date(System.currentTimeMillis());
		String date = taxa.generateDate();
		
		taxa.clicaTelaTaxa();
		taxa.generateDate();
		taxa.incluirTaxa("FISCAL", "USD", date, "4.500000000");
	}
	
	@After
	public void tearDown() {
		// TODO Auto-generated method stub
		//coisas que só podem ser feitas após  o termino do teste

	}
}