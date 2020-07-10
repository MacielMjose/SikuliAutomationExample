package br.com.renner.ecomex.appobjects;

import org.sikuli.script.Pattern;

public class PedidosAppObjects {
	private static String filepath = "\\src\\main\\resources\\images\\";
	
	public Pattern getTelaPedidos() {
		return new Pattern(filepath+"telaPedido.png");
	}
	public Pattern getPoNumero() {
		return new Pattern(filepath+"poRel.PNG");
	}
	public Pattern getExecutarButton() {
		return new Pattern(filepath+"executarButton.PNG");
	}
	public Pattern getTelaPedidosCompleta() {
		return new Pattern(filepath+"telaPedidosCompleta.PNG");
	}
	public Pattern getEntrarComCriterioButton() {
		return new Pattern(filepath+"entrarComCriterio.PNG");
	}
	public Pattern getFecharTela() {
		return new Pattern(filepath+"fechaTela.PNG");
	}
}
