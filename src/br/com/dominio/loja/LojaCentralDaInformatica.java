package br.com.dominio.loja;

import br.com.dominio.boleto.Boleto;
import br.com.dominio.boleto.BoletoBancoBrasil;
import br.com.dominio.nfe.NFE;
import br.com.dominio.nfe.NFESaoPaulo;
import br.com.dominio.venda.VendaFactory;

/* Vamos simular uma loja que emite nota fiscal (com o imposto de S�o Paulo) e boleto ( com banco Brasil).
 * 
 * Qualquer institui��o que faz venda deve gerar (criar) nota fiscal e boleto.
 * 
 * Logo elas devem implement a interface mais gen�rica poss�vel
 * 
 * Estamos
 * */

// Class concreta que implementa o VendaFactory
public class LojaCentralDaInformatica implements VendaFactory {

	@Override
	public NFE criarNFE() {
		
		NFE notaFiscal = new NFESaoPaulo(); // Criando a class concreta sobre NFE para esta loja (nota fiscal especifico para S�o Paulo)
		return notaFiscal;
	}

	@Override
	public Boleto criarBoleto() {
		
		Boleto bolet = new BoletoBancoBrasil(); // Criando a class concreta sobre Boleto para esta loja (boleto especifico para o banco Brasil)
		return bolet;
	}
}
