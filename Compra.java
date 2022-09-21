package Desafio;

import java.util.ArrayList;

public class Compra {
	ArrayList<Item> listaItens = new ArrayList<>();

	public void adicionaItem(Produto p, int quantidade) {
		this.listaItens.add(new Item(p, quantidade));
		}
	
	public double valorTotal() {
		double total = 0;
		for(Item item : listaItens) {
			total += item.quantidade * item.produto.preco;
		}
		return total;
	}
}
