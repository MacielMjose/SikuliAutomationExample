package br.com.renner.ecomex.utils;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

import org.sikuli.natives.TARGET_TYPE;
import org.sikuli.natives.Vision;
import org.sikuli.script.Button;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Finder;
import org.sikuli.script.Image;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Auxi {

	private Screen screen;
	private boolean valid = true;
	private Finder finder;
	private final String filePath = "\\src\\main\\resources\\images\\auxi";
	
	public Auxi(Screen screen) {
		this.screen = screen;
	}
	
	public void insereTexto(Pattern regiao, String texto) throws IOException, FindFailed {
		screen.click(regiao.targetOffset(40, 0));
		screen.type(regiao, texto);		
	}
	
	public void insereTextoAbaixo(Pattern regiao, String texto) throws FindFailed {
		screen.click(regiao.targetOffset(0, 5));
		screen.type(regiao, texto);
	}
	
	public void clicaEmLista(Pattern regiao, Pattern itemDaLista) throws FindFailed {
		screen.click(regiao.targetOffset(50, 0));
		screen.click(itemDaLista);
	}
	
	public void verificaDataAtual() {
		
	}
	
	
	public List<String> separaItens(String itens) {
		String[] arrayDeItens = itens.split("/");
		List<String> listaDeItens = new ArrayList();
		for(String item : arrayDeItens) {
			listaDeItens.add(item);
		}
		return listaDeItens;
	}
	

}
