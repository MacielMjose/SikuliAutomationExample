package br.com.renner.ecomex.tasks;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import br.com.renner.ecomex.appobjects.LoginAppObjects;

public class LoginTask {

	private final Screen scr;
	private LoginAppObjects login;
	public LoginTask(Screen screen) {
		this.scr = screen;
		this.login = new LoginAppObjects();
	}
	
	public void realizarLogin(String username,String password,String empresa) throws FindFailed {
		
		scr.wait(login.getRunJavaButton(),60);
		if(scr.exists(login.getRunJavaButton()) != null){
			scr.click(login.getRunJavaButton());
		}	
		scr.wait(login.getUsernameField(),120);
		scr.click(login.getUsernameField());
		scr.type(username);
		
		scr.click(login.getPasswordField());
		scr.type(password);
		
		scr.type(login.getEmpresa(),empresa);
		scr.click(login.getLoginButton());
		
		if(scr.exists(login.getUltimoAcessoButton())!= null) {
			scr.wait(login.getUltimoAcessoButton(),120);
			scr.click(login.getUltimoAcessoButton());
		}
		if(scr.exists(login.getNaoSaiuCorretamenteMessage()) != null) {
			scr.click(login.getUltimoAcessoButton());
		}
		if(scr.exists(login.getManterConexoesButton()) != null) {
			scr.click(login.getManterConexoesButton());		
		}
	}
}
