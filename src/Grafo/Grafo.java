package Grafo;

import java.util.ArrayList;
import java.util.Random;

/**
 * classe que representa um grafo generico
 */
public class Grafo {

	private ArrayList<Vertice> vertices;

	public Grafo(boolean direcionado) {
		vertices = new ArrayList<Vertice>();
	}

	/**
	 * Insere um vertice no grafo
	 */
	public void adicionaVertice(Vertice vertice) {
		if (!vertices.contains(vertice)) {
			// Testa se o vertice ja possui uma chave igual
			vertices.add(vertice);
			return;
		}
		System.out.println("Valor de vertice ja existente no grafo! -> "
				+ vertice.toString());
	}

	/**
	 * Remove o vertice do grafo e todas as aresta conectadas a ele
	 */
	public void removeVertice(Vertice vertice) {
		if (vertices.contains(vertice)) {
			vertices.remove(vertice);
		}
	}

	public void conecta(Vertice v1, Vertice v2, Aresta aresta) {
		vertices.get(vertices.indexOf(v1)).adicionaAresta(aresta, v2);
		vertices.get(vertices.indexOf(v2)).adicionaAresta(aresta, v2);
	}

	public void desconecta(Vertice v1, Vertice v2) {
		vertices.get(vertices.indexOf(v1)).removeAresta(v2);
		vertices.get(vertices.indexOf(v2)).removeAresta(v1);
	}

	/**
	 * retorna a ordem do grafo (numero de vertices)
	 */
	public int ordem() {
		return vertices.size();
	}

	/**
	 * TODO retorna um conjunto com os vertices do grafo qual tipo de retorno?
	 * lista, hashmap?..
	 * 
	 * @return
	 */
	public ArrayList<Vertice> getVertices() {
		return vertices;
	}

	/**
	 * TODO retorna um vertice qualquer do grafo
	 */
	public Vertice umVertice() {
		Random random = new Random();
		return vertices.get(random.nextInt(vertices.size()));
	}

	/**
	 * TODO retorna os vertices adjacentes do verttice v do grafo
	 * 
	 * @return
	 */

	@SuppressWarnings("unchecked")
	public ArrayList<Vertice> adjacentes(Vertice v) {
		return (ArrayList<Vertice>) v.getAdjacentes().keySet();
	}

	/**
	 * TODO retorna o numero de vertices adjacentes do verttice v do grafo
	 */
	public int grauAdjacentes(Vertice v) {
		return v.getAdjacentes().size();
	}

	public String toString() {
		return vertices.toString();
	}

	public ArrayList<Vertice> getGrafo() {
		return vertices;
	}

	/*
	 * public HashMap<String, Aresta> getArestas() { return arestas; }
	 * 
	 * public void setArestas(HashMap<String, Aresta> arestas) { this.arestas =
	 * arestas; }
	 */

	/**
	 * este metodo vai criar uma nova aresta conforme os parametos passados
	 * 
	 * @param fonte
	 *            vertice fonte
	 * @param destino
	 *            vertice destino
	 * @param peso
	 *            o peso da aresta
	 */

	/*
	 * public void adicionaAresta(Vertice fonte, Vertice destino, int peso,
	 * boolean direcionada) { if (vertices.containsKey(fonte.getNomeVertice())
	 * && vertices.containsKey(destino.getNomeVertice())) { // Verifica se os
	 * vertices estao inseridos no grafo if (arestas.containsKey(fonte + "-" +
	 * destino)) // Verifica se a aresta ja existe
	 * System.out.println(fonte.toString() + " e " + destino.toString() +
	 * "ja estao conectados!"); else // Chave ganha nome dos vertices
	 * fonte-destino arestas.put(fonte + "-" + destino, new Aresta(fonte,
	 * destino, peso, direcionada)); } else { // Fonte nao e vertice do grafo if
	 * (vertices.containsKey(destino.getNomeVertice())) System.out.println(fonte
	 * + " nao e vertice do grafo!"); else { // Destino nao e vertice do grafo
	 * if (vertices.containsKey(fonte.getNomeVertice()))
	 * System.out.println(destino + " nao e vertice do grafo!"); else // Ambos
	 * vertices nao pertencem ao grafo System.out.println(fonte + " e " +
	 * destino + "nao sao vertices do grafo!"); } } }
	 * 
	 * /** TODO remove a aresta entre os vertices v1 e v2
	 */

}
