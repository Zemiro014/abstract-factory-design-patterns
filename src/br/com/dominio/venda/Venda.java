package br.com.dominio.venda;

import br.com.dominio.boleto.Boleto;
import br.com.dominio.modelo.Produto;
import br.com.dominio.nfe.NFE;

/*
 * Para fazer uma venda � necess�rio um boleto e uma notafiscal.
 * Acontece que o "boleto" e a "nota fiscal" podem possuir "n" implementa��es (dependendo da situa��o)
 * 
 * Ent�o, para n�o ficar criando um mont�o de "objectos" para "boleto" ou para "nota fiscal",
 *  cria-se uma classe que no seu construtor possa receber uma "interface Factory que seja o mais gen�rico poss�vel e 
 *  que tenha m�todos para criar "nota fiscal" e "boleto"
 *  
 *  
 * */  

public class Venda {

	private NFE notaFiscal;
	private Boleto boleto;
	
	public Venda(VendaFactory factory) {
		
		this.notaFiscal = factory.criarNFE();
		
		this.boleto = factory.criarBoleto();
	}
	
	public void realizarVenda(Produto produto) {
		
		double imposto = notaFiscal.calcularImposto(produto);
		
		boleto.emitir(produto, imposto);
	}
}
