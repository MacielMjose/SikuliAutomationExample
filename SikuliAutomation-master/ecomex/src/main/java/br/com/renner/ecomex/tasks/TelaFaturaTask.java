package br.com.renner.ecomex.tasks;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

import br.com.renner.ecomex.appobjects.CriarFaturaAppObjects;

public class TelaFaturaTask {
	private final Screen scr;
	private CriarFaturaAppObjects fatura;
	public TelaFaturaTask(Screen screen) {
		this.scr = screen;
		this.fatura = new CriarFaturaAppObjects();
	}
	
	public void clicaTelaFatura()throws FindFailed{
		scr.doubleClick(fatura.getTelaFatura());
		scr.wait(fatura.getInclusaoFaturaTela(), 20);
		scr.click(fatura.getIncluirFaturaButton());
	}
	public void incluiInvoice(String invoice,String proforma,String organizacao)throws FindFailed{
		scr.wait(fatura.getTelaFaturaCompleta(),20);
		scr.wait(fatura.getInvoiceField(), 360);
		scr.click(fatura.getInvoiceField());
		scr.type(invoice);
		scr.click(fatura.getProformaField());
		scr.type(proforma);
		scr.click(fatura.getOrganizacaoField());
		scr.type(organizacao);
	}
	public void incluiFabricante(String exportador, String fornecedor) {
		scr.type(Key.TAB);
		scr.type(exportador);
	}
	public void incluiNegociacao(String dtEmissao, String  dtBase, String condPgt, String incoTerm,String moeda) throws FindFailed {
		scr.wait(fatura.getdtEmissaoField());
		scr.click(fatura.getdtEmissaoField());
		scr.type(dtEmissao);
		scr.click(fatura.getdtBase());
		scr.type(dtBase);
		scr.click(fatura.getcondPgtField());
		scr.type(condPgt);
		scr.click(fatura.getincotermField());
		scr.type(incoTerm);
		scr.type(Key.ENTER);
		scr.click(fatura.getmoedaField());
		scr.wait(fatura.getmoedaField2());
		scr.click(fatura.getmoedaField2());
		scr.type(moeda);
		scr.type(Key.TAB);
		//scr.type(Key.CTRL+'s');
	}

}
