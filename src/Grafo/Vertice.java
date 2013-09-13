package Grafo;

import java.util.HashMap;

public class Vertice {
	// Estrutura principal do vertice
	private String nomeVertice; //Nome de identificação do vertice
	private HashMap<String, Aresta> arestasEntrada = new HashMap<String, Aresta>(); // Arestas que chegam no vertice 
	private HashMap<String, Aresta> arestasSaida = new HashMap<String, Aresta>(); // Arestas que saem do vertice
	
	private String dados; //Dados adicionais que podem ser inseridos para algoritmos personalizados   
	
	public Vertice(String vertice) {
		setVertice(vertice);
	}

	public void adicionaAresta(Aresta aresta) {
		//verifica se o vertice e fonte ou destino da aresta
		if (this.nomeVertice == aresta.getFonte().getVertice()){
			arestasSaida.put(aresta.getFonte().getVertice() + "-" + aresta.getDestino().getVertice(), aresta);
			// se o grafo for nao orientado, tem que adicionar tanto nas arestas que chegam quanto nas arestas que saem
			if (!aresta.isDirecionada())
				arestasEntrada.put(aresta.getFonte() + "-" + aresta.getDestino(), aresta);
		}
		
		// Similar ao de cima
		if (this.nomeVertice == aresta.getDestino().getVertice()) {
			arestasEntrada.put(aresta.getFonte().getVertice() + "-" + aresta.getDestino().getVertice(), aresta); 
			if (!aresta.isDirecionada())
				arestasSaida.put(aresta.getFonte().getVertice() + "-" + aresta.getDestino().getVertice(), aresta);
		}
	}
	
	public void removeAresta(Aresta aresta) {
		// Verifica se o vertice e fonte ou destino da aresta
		if (this.nomeVertice == aresta.getFonte().getVertice()) {
			arestasSaida.remove(aresta.getFonte().getVertice() + "-" + aresta.getDestino().getVertice());
			// se a aresta for nao orientada, e preciso tirar dos dois conjuntos
			if (!aresta.isDirecionada())
				arestasEntrada.remove(aresta.getFonte().getVertice() + "-" + aresta.getDestino().getVertice());
		}
		
		if (this.nomeVertice == aresta.getDestino().getVertice()) {
			arestasEntrada.remove(aresta.getFonte().getVertice() + "-" + aresta.getDestino().getVertice());
			if (!aresta.isDirecionada())
				arestasSaida.remove(aresta.getFonte().getVertice() + "-" + aresta.getDestino().getVertice());
			
		}
	}
	
	public String toString() {
		return "" + nomeVertice;
	}
	
	public int getNumeroAntecessores(){
		return arestasEntrada.size();
	}
	
	public int getNumeroSucessores(){
		return arestasSaida.size();
	}
	
	public String getVertice() {
		return nomeVertice;
	}

	public void setVertice(String vertice) {
		this.nomeVertice = vertice;
	}

	public String getDados() {
		return dados;
	}
	
	public void setDados(String dados) {
		this.dados = dados;
	}

	public HashMap<String, Aresta> getArestasOrigem() {
		return arestasEntrada;
	}

	public void setArestasOrigem(HashMap<String, Aresta> arestasOrigem) {
		this.arestasEntrada = arestasOrigem;
	}

	public HashMap<String, Aresta> getArestasDestino() {
		return arestasSaida;
	}

	public void setArestasDestino(HashMap<String, Aresta> arestasDestino) {
		this.arestasSaida = arestasDestino;
	}

}
