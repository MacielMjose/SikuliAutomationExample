package br.com.renner.ecomex.appobjects;

import org.sikuli.script.Pattern;

public class LoginAppObjects {

	private static String filepath = "\\src\\main\\resources\\images\\";

	public Pattern getUserLogado() {
		return new Pattern(filepath + "userLogado.PNG");
	}

	public Pattern getCloseButton() {
		return new Pattern(filepath + "closeButton.PNG");
	}

	public Pattern getCloseWithTaskOpenYesButton() {
		return new Pattern(filepath + "closeWithTaskOpenYesButton.PNG");
	}

	public Pattern getUnableToAuthenticateError() {
		return new Pattern(filepath + "erroUnableToAuthenticate.PNG");
	}

	public Pattern getPasswordField() {
		return new Pattern(filepath + "passwordField.PNG");
	}

	public Pattern getUsernameField() {
		return new Pattern(filepath + "usernameField.PNG");
	}

	public Pattern getLoginButton() {
		return new Pattern(filepath + "loginButton.PNG");
	}
	
	public Pattern getEmpresa() {
		return new Pattern(filepath + "empresaField.PNG");
	}
	public Pattern getRunJavaButton() {
		return new Pattern(filepath + "javaRunButton.PNG");
	}
	public Pattern getUltimoAcessoButton() {
		return new Pattern(filepath + "messageOkButton.PNG");
	}
	public Pattern getNaoSaiuCorretamenteMessage() {
		return new Pattern(filepath + "naoSaiuCorretamenteMessage.PNG");
	}
	public Pattern getManterConexoesButton() {
		return new Pattern(filepath + "ManterConexoesButton.PNG");
	}
}
