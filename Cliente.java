package Desafio;

import java.util.ArrayList;

public class Cliente {
	String nome = "Guilherme";
	ArrayList<Compra> listaCompra = new ArrayList<>();

	public double valorCompra() {
		double total = 0;
		for(Compra c : listaCompra) {
			total += c.valorTotal();
		}
		return total;
	}
}
