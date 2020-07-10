package br.com.renner.ecomex.appobjects;

import org.sikuli.script.Pattern;

public class CadastroTaxaAppObjects {
	
	private static String filepath = "\\src\\main\\resources\\images\\";
	
	public Pattern getCadastroTaxas() {
		return new Pattern(filepath+"cadastroTaxas.PNG");
	}
	public Pattern getCadastroTaxasTela() {
		return new Pattern(filepath+"cadastroTaxasTela.PNG");
	}
	public Pattern getcadTaxasTipoField() {
		return new Pattern(filepath+"cadTaxasTipoField.PNG");
	}
}
