package Grafo;

import java.util.HashMap;

/**
 * classe que representa um grafo generico
 */
public class Grafo {
	
	private HashMap<String, Vertice> vertices;
	private HashMap<String, Aresta> arestas;

	public Grafo(boolean direcionado) {
		vertices = new HashMap<String, Vertice>();
		setArestas(new HashMap<String, Aresta>());
	}

	/**
	 * Insere um vertice no grafo
	 */
	public void adicionaVertice(Vertice vertice) {
		if (vertices.containsKey(vertice.getVertice()))
			// Testa se o vertice ja possui uma chave igual
			System.out.println("Valor de vertice ja existente no grafo! -> "
					+ vertice.toString());
		else { // Caso nao tenha, adiciona um novo vertice ao grafo
			vertices.put(vertice.getVertice(), vertice);
		}
	}
	
	/**
	 * Remove o vertice do grafo e todas as aresta conectadas a ele
	 */
	public void removeVertice(Vertice v) {
		if (vertices.containsValue(v)){
			vertices.remove(v);
		}
	}

	/**
	 * este metodo vai criar uma nova aresta conforme os parametos passados
	 * 
	 * @param fonte vertice fonte
	 * @param destino vertice destino
	 * @param peso  o peso da aresta
	 */
	public void adicionaAresta(Vertice fonte, Vertice destino, int peso, boolean direcionada) {
		if (vertices.containsKey(fonte.getVertice())
				&& vertices.containsKey(destino.getVertice())) {
			// Verifica se os vertices estao inseridos no grafo
			if (arestas.containsKey(fonte + "-" + destino))
				// Verifica se a aresta ja existe
				System.out.println(fonte.toString() + " e "
						+ destino.toString() + "ja estao conectados!");
			else
				// Chave ganha nome dos vertices fonte-destino
				arestas.put(fonte + "-" + destino, new Aresta(fonte, destino,
						peso, direcionada));
		} else {
			// Fonte nao e vertice do grafo
			if (vertices.containsKey(destino.getVertice()))
				System.out.println(fonte + " nao e vertice do grafo!");
			else {
				// Destino nao e vertice do grafo
				if (vertices.containsKey(fonte.getVertice()))
					System.out.println(destino + " nao e vertice do grafo!");
				else
					// Ambos vertices nao pertencem ao grafo
					System.out.println(fonte + " e " + destino
							+ "nao sao vertices do grafo!");
			}
		}
	}

	

	/**
	 * TODO remove a aresta entre os vertices v1 e v2
	 */
	public void desconecta(Vertice v1, Vertice v2) {

	}

	/**
	 * retorna a ordem do grafo (numero de vertices)
	 */
	public int ordem() {
		return this.vertices.size();
	}

	/**
	 * TODO retorna um conjunto com os vertices do grafo qual tipo de retorno?
	 * lista, hashmap?..
	 */
	public void getVertices() {

	}

	/**
	 * TODO retorna um vertice qualquer do grafo
	 */
	public Vertice getUmVertice() {
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
		return vertices.toString();
	}

	public HashMap<String, Vertice> getGrafo() {
		return vertices;
	}

	public HashMap<String, Aresta> getArestas() {
		return arestas;
	}

	public void setArestas(HashMap<String, Aresta> arestas) {
		this.arestas = arestas;
	}
}
