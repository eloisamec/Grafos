package Grafo;

import java.util.HashMap;

public class Grafo {
	private boolean direcionado;
	private HashMap<String, Vertice> grafo;
	private HashMap<String, Aresta> arestas;

	public Grafo(boolean direcionado) {
		grafo = new HashMap<String, Vertice>();
		setArestas(new HashMap<String, Aresta>());
		this.setDirecionado(direcionado);
	}

	public void insereVertice(Vertice vertice) {
		if (grafo.containsKey(vertice.getVertice()))
			// Testa se o vértice já possui uma chave igual
			System.out.println("Valor de vértice já existente no grafo! -> "
					+ vertice.toString());
		else { // Caso não tenha, adiciona um novo vértice ao grafo
			grafo.put(vertice.getVertice(), vertice);
		}
	}

	public void insereAresta(Vertice fonte, Vertice destino, int peso) {
		if (grafo.containsKey(fonte.getVertice())
				&& grafo.containsKey(destino.getVertice())) {
			// Verifica se os vértices estão inseridos no grafo
			if (arestas.containsKey(fonte + "-" + destino))
				// Verifica se a aresta já existe
				System.out.println(fonte.toString() + " e "
						+ destino.toString() + "já estão conectados!");
			else
				// Chave ganha nome dos vértices fonte-destino
				arestas.put(fonte + "-" + destino, new Aresta(fonte, destino,
						peso));
		} else {
			// Fonte não é vértice do grafo
			if (grafo.containsKey(destino.getVertice()))
				System.out.println(fonte + " não é vértice do grafo!");
			else {
				// Destino não é vértice do grafo
				if (grafo.containsKey(fonte.getVertice()))
					System.out.println(destino + " não é vértice do grafo!");
				else
					// Ambos vértices não pertencem ao grafo
					System.out.println(fonte + " e " + destino
							+ "não são vértices do grafo!");
			}
		}
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
