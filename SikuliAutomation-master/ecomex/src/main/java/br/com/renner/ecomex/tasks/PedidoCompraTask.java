package br.com.renner.ecomex.tasks;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import br.com.renner.ecomex.appobjects.PedidosAppObjects;

public class PedidoCompraTask {
	private final Screen scr;
	private PedidosAppObjects pedido;
	public PedidoCompraTask(Screen screen) {
		this.scr = screen;
		this.pedido = new PedidosAppObjects();
	}
	
	public void clicaTelaPedido() throws FindFailed {
		scr.wait(pedido.getTelaPedidos(),120);
		scr.doubleClick(pedido.getTelaPedidos());
	}
	public void pesquisaPedido(String poNumero)throws FindFailed{
		scr.wait(pedido.getPoNumero(),120);
		scr.click(pedido.getPoNumero());
		scr.click(pedido.getEntrarComCriterioButton());
		scr.click(pedido.getPoNumero());
		scr.type(poNumero);
		scr.click(pedido.getExecutarButton());
		
	}
	public void fechaTelaPedido() throws FindFailed{
		scr.click(pedido.getFecharTela());
	}
}
