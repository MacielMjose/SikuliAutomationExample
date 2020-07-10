package br.com.renner.ecomex.testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import br.com.renner.ecomex.tasks.LoginTask;

public class LoginTestCase {

	private static LoginTask login;
	private static Screen screen;
	private static String projectPath = System.getProperty("user.dir") + "\\src\\main\\resources\\exec\\frmservlet.jnlp";

	@Before
	public void setup() {
		screen = new Screen();
		login = new LoginTask(screen);
	}
	
	@Test
	public void LoginTeste() throws FindFailed {
		App.open("CMD /C"+projectPath).makeAppEntry();
		login.realizarLogin("915420","@kira1997", "CD 324");
	}
	
	@After
	public void tearDown() {
		// TODO Auto-generated method stub
		//coisas que só podem ser feitas após  o termino do teste

	}
}