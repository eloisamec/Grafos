package Grafo;

import java.util.HashMap;

/**
 * classe que representa um vertice e suas conexões (sucessores e antecessores)
 */

public class Vertice {
	// Estrutura principal do vertice
	private String nomeVertice; // Nome de identificação do vertice
	private HashMap<Vertice, Aresta> adjacentes = new HashMap<Vertice, Aresta>();
	private String dados; // Dados adicionais que podem ser inseridos para
							// algoritmos personalizados

	/*
	 * adiciona uma aresta
	 */

	public Vertice(String nome) {
		nomeVertice = nome;
	}

	public void adicionaAresta(Aresta aresta, Vertice destino) {
		if (!adjacentes.containsKey(aresta))
			adjacentes.put(destino, aresta);
	}

	public void removeAresta(Vertice vertice) {
		if (!adjacentes.containsValue(vertice))
			System.out.println("Vertice nao mapeado.");
		adjacentes.remove(vertice);
	}

	public void setNomeVertice(String vertice) {
		this.nomeVertice = vertice;
	}

	public String getNomeVertice() {
		return nomeVertice;
	}

	public HashMap<Vertice, Aresta> getAdjacentes() {
		return adjacentes;
	}

	public String getDados() {
		return dados;
	}

	public void setDados(String dados) {
		this.dados = dados;
	}

	/*
	 * public Vertice(String vertice) { setNomeVertice(vertice); }
	 * 
	 * public void adicionaAresta(Aresta aresta) { // verifica se o vertice e
	 * fonte ou destino da aresta if (this.nomeVertice ==
	 * aresta.getFonte().getNomeVertice()) {
	 * arestasSaida.put(aresta.getDestino().getNomeVertice(), aresta); // se o
	 * grafo for nao orientado, tem que adicionar tanto nas arestas // que
	 * chegam quanto nas arestas que saem if (!aresta.isDirecionada())
	 * arestasEntrada .put(aresta.getDestino().getNomeVertice(), aresta); }
	 * 
	 * // Similar ao de cima if (this.nomeVertice ==
	 * aresta.getDestino().getNomeVertice()) {
	 * arestasEntrada.put(aresta.getFonte().getNomeVertice(), aresta); if
	 * (!aresta.isDirecionada())
	 * arestasSaida.put(aresta.getFonte().getNomeVertice(), aresta); } }
	 * 
	 * /* remove a aresta formada pelos dois vertices passados como parametro
	 */

	/*
	 * public void removeAresta(Vertice v1, Vertice v2) { // Verifica se o
	 * vertice e fonte ou destino da aresta if (this.nomeVertice ==
	 * v1.getNomeVertice()) { boolean dir =
	 * arestasSaida.get(v1).isDirecionada();
	 * arestasSaida.remove(v1.getNomeVertice()); // se a aresta for nao
	 * orientada, e preciso tirar dos dois conjuntos if (dir == false)
	 * arestasEntrada.remove(v2.getNomeVertice()); } else { if (this.nomeVertice
	 * == v2.getNomeVertice()) { boolean dir =
	 * arestasSaida.get(v2).isDirecionada();
	 * arestasSaida.remove(v2.getNomeVertice()); // se a aresta for nao
	 * orientada, e preciso tirar dos dois // conjuntos if (dir == false)
	 * arestasEntrada.remove(v1.getNomeVertice()); } } }
	 * 
	 * public String toString() { return "" + nomeVertice; }
	 * 
	 * public int getNumeroAntecessores() { return arestasEntrada.size(); }
	 * 
	 * public int getNumeroSucessores() { return arestasSaida.size(); }
	 * 
	 * public String getDados() { return dados; }
	 * 
	 * public void setDados(String dados) { this.dados = dados; }
	 * 
	 * public HashMap<String, Aresta> getArestasOrigem() { return
	 * arestasEntrada; }
	 * 
	 * public void setArestasOrigem(HashMap<String, Aresta> arestasOrigem) {
	 * this.arestasEntrada = arestasOrigem; }
	 * 
	 * public HashMap<String, Aresta> getArestasDestino() { return arestasSaida;
	 * }
	 * 
	 * public void setArestasDestino(HashMap<String, Aresta> arestasDestino) {
	 * this.arestasSaida = arestasDestino; }
	 */
}
