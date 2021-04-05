package br.com.dominio;

import java.math.BigDecimal;

import br.com.dominio.loja.LojaCentralDaInformatica;
import br.com.dominio.modelo.Produto;
import br.com.dominio.venda.Venda;
import br.com.dominio.venda.VendaFactory;

public class Program {

	public static void main(String[] args) {
		
		Produto produto  = new Produto();
		produto.setQuantidade(1);
		produto.setNome("Smartphone Moto X 2ª geração ");
		produto.setValor(new BigDecimal(1000));
		
		VendaFactory factory = new LojaCentralDaInformatica();
		
		Venda venda = new Venda(factory);
		
		venda.realizarVenda(produto);
	}

}
