package Grafo;

import java.util.HashMap;

/**
 * classe que representa um vertice e suas conecções (sucessores e antecessores)
 */

public class Vertice {
	// Estrutura principal do vertice
	private String nomeVertice; // Nome de identificação do vertice
	
	private HashMap<String, Aresta> arestasEntrada = new HashMap<String, Aresta>(); // antecessores
	private HashMap<String, Aresta> arestasSaida = new HashMap<String, Aresta>();   //sucessores
	private String dados; // Dados adicionais que podem ser inseridos para
							// algoritmos personalizados

	public Vertice(String vertice) {
		setVertice(vertice);
	}

	
	/*
	 * adiciona uma aresta
	 */
	public void adicionaAresta(Aresta aresta) {
		// verifica se o vertice e fonte ou destino da aresta
		if (this.nomeVertice == aresta.getFonte().getVertice()) {
			arestasSaida.put(aresta.getDestino().getVertice(), aresta);
			// se o grafo for nao orientado, tem que adicionar tanto nas arestas
			// que chegam quanto nas arestas que saem
			if (!aresta.isDirecionada())
				arestasEntrada.put(aresta.getDestino().getVertice(), aresta);
		}

		// Similar ao de cima
		if (this.nomeVertice == aresta.getDestino().getVertice()) {
			arestasEntrada.put(aresta.getFonte().getVertice(), aresta);
			if (!aresta.isDirecionada())
				arestasSaida.put(aresta.getFonte().getVertice(), aresta);
		}
	}

	/**
	 * remove a aresta formada pelos dois vertices passados como parametro
	 */
	public void removeAresta(Vertice v1, Vertice v2) {
		// Verifica se o vertice e fonte ou destino da aresta
		if (this.nomeVertice == v1.getVertice()) {
			boolean dir = arestasSaida.get(v1).isDirecionada();
			arestasSaida.remove(v1.getVertice());
			// se a aresta for nao orientada, e preciso tirar dos dois conjuntos
			if (dir == false)
				arestasEntrada.remove(v2.getVertice());
		} else {
			if (this.nomeVertice == v2.getVertice()) {
				boolean dir = arestasSaida.get(v2).isDirecionada();
				arestasSaida.remove(v2.getVertice());
				// se a aresta for nao orientada, e preciso tirar dos dois
				// conjuntos
				if (dir == false)
					arestasEntrada.remove(v1.getVertice());
			}
		}
	}

	public String toString() {
		return "" + nomeVertice;
	}

	public int getNumeroAntecessores() {
		return arestasEntrada.size();
	}

	public int getNumeroSucessores() {
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
