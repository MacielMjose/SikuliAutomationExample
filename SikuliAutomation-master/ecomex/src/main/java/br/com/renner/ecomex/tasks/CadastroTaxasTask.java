package br.com.renner.ecomex.tasks;

import java.sql.Date;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

import br.com.renner.ecomex.appobjects.CadastroTaxaAppObjects;
import br.com.renner.ecomex.appobjects.CriarFaturaAppObjects;

public class CadastroTaxasTask {
	private final Screen scr;
	private CadastroTaxaAppObjects taxa;
	public CadastroTaxasTask(Screen screen) {
		this.scr = screen;
		this.taxa = new CadastroTaxaAppObjects();
	}
	
	public void clicaTelaTaxa()throws FindFailed{
		scr.doubleClick(taxa.getCadastroTaxas());
	}
	
	public String generateDate() {
		
	Date todayDate = new Date(System.currentTimeMillis());
			
			String date = todayDate.toString();
		
			char b[] = date.toCharArray();
			char c[] = new char[10];
			
			for(int i = 9; i >= 0; i --) {	
				if(i == 9) {
					c[1] = b[i];
				}
				if(i == 8) {
					c[0] = b[i];
				}
				if(i == 6) {
					c[3] = b[i];
				}
				if(i == 5) {
					c[2] = b[i];
				}	
				if(i == 3) {
					c[7] = b[i];
				}
				if(i == 2) {
					c[6] = b[i];
				}
				if(i == 1) {
					c[5] = b[i];
				}
				if(i == 0) {
					c[4] = b[i];
				}
			}
			String dataFormatada = String.valueOf(c);
			//System.out.println(dataFormatada); testing porpuses
		return dataFormatada;
	}

	public void incluirTaxa(String tipo,String moeda,String data,String taxaMoedaNac)throws FindFailed{
		scr.wait(taxa.getCadastroTaxasTela());
		scr.click(taxa.getcadTaxasTipoField());
		scr.type(tipo);
		scr.type(Key.TAB);
		scr.type(moeda);
		scr.type(Key.TAB);
		scr.type(data);
		scr.type(Key.TAB);
		scr.type(taxaMoedaNac);
		scr.type(Key.TAB);
	}
}
