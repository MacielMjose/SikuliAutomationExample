package br.com.renner.ecomex.appobjects;

import org.sikuli.script.Pattern;

public class CriarFaturaAppObjects {
	private static String filepath = "\\src\\main\\resources\\images\\";

	public Pattern getTelaFatura() {
		
		return new Pattern(filepath+"telaFatura.PNG");
	}
	public Pattern getIncluirFaturaButton() {
		return new Pattern(filepath+"incluirButton.PNG");
	}
	public Pattern getInvoiceField() {
		return new Pattern(filepath+"invoiceField.PNG");
	}
	public Pattern getProformaField() {
		return new Pattern(filepath+"proformaField.PNG");
	}
	public Pattern getOrganizacaoField() {
		return new Pattern(filepath+"organizacaoField.PNG");
	}
	public Pattern getInclusaoFaturaTela() {
		return new Pattern(filepath+"inclusaoFaturaTela.PNG");
	}
	public Pattern getTelaFaturaCompleta() {
		return new Pattern(filepath+"telaFaturaCompleta.PNG");
	}
	public Pattern getdtEmissaoField() {
		return new Pattern(filepath+"dtEmissaoField.PNG");
	}
	public Pattern getdtBase() {
		return new Pattern(filepath+"dtBase.PNG");
	}
	public Pattern getcondPgtField() {
		return new Pattern(filepath+"condPgtField.PNG");
	}
	public Pattern getincotermField() {
		return new Pattern(filepath+"incotermField.PNG");
	}
	public Pattern getmoedaField() {
		return new Pattern(filepath+"moedaField.PNG");
	}
	public Pattern getmoedaField2() {
		return new Pattern(filepath+"moedaField2.PNG");
	}
}
