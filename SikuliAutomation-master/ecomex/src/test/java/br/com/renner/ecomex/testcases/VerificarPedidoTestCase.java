package br.com.renner.ecomex.testcases;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import br.com.renner.ecomex.tasks.PedidoCompraTask;

public class VerificarPedidoTestCase {
	private static PedidoCompraTask pedido;
	private static Screen screen;

	
	@Before
	public void EntraTelaPedido() throws FindFailed {
		screen = new Screen();
		pedido = new PedidoCompraTask(screen);
		pedido.clicaTelaPedido();
	}
	
	@Test
	public void PesquisaPedido() throws FindFailed{
		pedido.pesquisaPedido("2509959");
	}
	@After
	public void FecharTela() throws FindFailed {
		pedido.fechaTelaPedido();
	}
}
