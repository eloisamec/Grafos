package Grafo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

/**
 * classe que representa um grafo generico
 */
public class Grafo {

	private ArrayList<Vertice> vertices;

	public Grafo() {
		vertices = new ArrayList<Vertice>();
	}

	public void adicionaVertice(Vertice vertice) {
		if (!vertices.contains(vertice)) {
			vertices.add(vertice);
			return;
		}
		System.out.println("Valor de vertice ja existente no grafo! -> "
				+ vertice.toString());
	}

	public void removeVertice(Vertice vertice) {
		if (vertices.contains(vertice)) {
			vertices.remove(vertice);
		}
	}

	public void conecta(Vertice v1, Vertice v2, Aresta aresta) {
		v1.adicionaAresta(aresta, v2);
		v2.adicionaAresta(aresta, v1);
	}

	public void desconecta(Vertice v1, Vertice v2) {
		v1.removeAresta(v2);
		v2.removeAresta(v1);
	}

	public int ordem() {
		return vertices.size();
	}

	public Vertice umVertice() {
		Random random = new Random();
		return vertices.get(random.nextInt(vertices.size()));
	}

	public Set<Vertice> adjacentes(Vertice v) {
		return v.getAdjacentes().keySet();
	}

	public int grauAdjacentes(Vertice v) {
		return v.getAdjacentes().size();
	}

	public String toString() {
		return vertices.toString();
	}

	public ArrayList<Vertice> getGrafo() {
		return vertices;
	}
}
