package Grafo;

import java.util.HashMap;

/**
 * classe que representa um grafo generico
 */
public class Grafo {
	
	private boolean direcionado; // true se for um grafo direcionado
	private HashMap<String, Vertice> grafo;
	private HashMap<String, Aresta> arestas;

	public Grafo(boolean direcionado) {
		grafo = new HashMap<String, Vertice>();
		setArestas(new HashMap<String, Aresta>());
		this.setDirecionado(direcionado);
	}

	/**
	 * insere um vertice no grafo
	 */
	public void adicionaVertice(Vertice vertice) {
		if (grafo.containsKey(vertice.getVertice()))
			// Testa se o v�rtice j� possui uma chave igual
			System.out.println("Valor de v�rtice j� existente no grafo! -> "
					+ vertice.toString());
		else { // Caso n�o tenha, adiciona um novo v�rtice ao grafo
			grafo.put(vertice.getVertice(), vertice);
		}
	}

	/**
	 * este método vai criar uma nova aresta conforme os parametos passados
	 * 
	 * @param fonte vertice fonte
	 * @param destino vertice destino
	 * @param peso  o peso da aresta
	 */
	public void conecta(Vertice fonte, Vertice destino, int peso) {
		if (grafo.containsKey(fonte.getVertice())
				&& grafo.containsKey(destino.getVertice())) {
			// Verifica se os v�rtices est�o inseridos no grafo
			if (arestas.containsKey(fonte + "-" + destino))
				// Verifica se a aresta j� existe
				System.out.println(fonte.toString() + " e "
						+ destino.toString() + "j� est�o conectados!");
			else
				// Chave ganha nome dos v�rtices fonte-destino
				arestas.put(fonte + "-" + destino, new Aresta(fonte, destino,
						peso));
		} else {
			// Fonte n�o � v�rtice do grafo
			if (grafo.containsKey(destino.getVertice()))
				System.out.println(fonte + " n�o � v�rtice do grafo!");
			else {
				// Destino n�o � v�rtice do grafo
				if (grafo.containsKey(fonte.getVertice()))
					System.out.println(destino + " n�o � v�rtice do grafo!");
				else
					// Ambos v�rtices n�o pertencem ao grafo
					System.out.println(fonte + " e " + destino
							+ "n�o s�o v�rtices do grafo!");
			}
		}
	}

	/**
	 * TODO remove o vertice do grafo e todas as aresta conetcatas com ele
	 */
	public void removeVertice(Vertice v) {

	}

	/**
	 * TODO remove a aresta entre os vertices v1 e v2
	 */
	public void desconecta(Vertice v1, Vertice v2) {

	}

	/**
	 * TODO retorna a ordem do grafo (numero de vertices)
	 */
	public int ordem() {
		return 0;
	}

	/**
	 * TODO retorna um conjunto com os vertice do grafo qual tipo de retorno?
	 * lista, hashmap?..
	 */
	public void getVertices() {

	}

	/**
	 * TODO retorna um vertice qualquer do grafo
	 */
	public Vertice getUmVercice() {
		return null;
	}

	/**
	 * TODO retorna os vertices adjacentes do verttice v do grafo
	 */
	public void adjacentes(Vertice v) {

	}

	/**
	 * TODO retorna o numero de vertices adjacentes do verttice v do grafo
	 */
	public int grauAadjacentes(Vertice v) {
		return 0;
	}

	public String toString() {
		return grafo.toString();
	}

	public HashMap<String, Vertice> getGrafo() {
		return grafo;
	}

	public boolean isDirecionado() {
		return direcionado;
	}

	public void setDirecionado(boolean direcionado) {
		this.direcionado = direcionado;
	}

	public HashMap<String, Aresta> getArestas() {
		return arestas;
	}

	public void setArestas(HashMap<String, Aresta> arestas) {
		this.arestas = arestas;
	}
}
