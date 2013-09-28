package Grafo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

/**
 * classe que representa um grafo generico
 */
public class Grafo {

	private static ArrayList<Vertice> vertices;

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
		System.out.println("Valor de vertice inválido! -> "
				+ vertice.toString());
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

	public ArrayList<Vertice> getGrafo() {
		return vertices;
	}

	public Vertice umVertice() {
		Random random = new Random();
		return vertices.get(random.nextInt(vertices.size()));
	}

	public Set<Vertice> adjacentes(Vertice v) {
		return v.getAdjacentes().keySet();
	}

	public int grau(Vertice v) {
		return v.getAdjacentes().size();
	}

	public boolean isRegular() {

		int grau = grau(vertices.get(0));
		int grauTestado;
		for (Vertice v : vertices) {
			grauTestado = grau(v);
			if (grauTestado != grau)
				return false;
		}
		return true;
	}
	
	public boolean isCompleto() {
		
		int n =  ordem() -1;
		for (Vertice v : vertices) {
			if (grau(v) != n)
				return false;
		}
		return true;
	}
	
	public ArrayList<Vertice> fechoTransitivo(Vertice v) {
		ArrayList<Vertice> jaVisitados = new ArrayList<Vertice>();
		return procuraFechoTransitivo(v, jaVisitados);
	}
	
	public ArrayList<Vertice> procuraFechoTransitivo(Vertice v, ArrayList<Vertice> jaVisitados) {
		ArrayList<Vertice> fechoTransitivo = new ArrayList<Vertice>();
		jaVisitados.add(v);
		for (Vertice vAdj : adjacentes(v)) {
			if (!jaVisitados.contains(vAdj))
				fechoTransitivo = procuraFechoTransitivo(vAdj, jaVisitados);
		}
		return fechoTransitivo;
	}
	public boolean isConexo() {
	
		return vertices.equals(fechoTransitivo(umVertice()));
	}
	
	public boolean isArvore() {
		
		Vertice v = umVertice();
		ArrayList<Vertice> vertice = new ArrayList<Vertice>();
		return isConexo() && haCicloCom(v, v, v, vertice);
	}

	public boolean haCicloCom(Vertice v, Vertice vAtual, Vertice vAnterior, ArrayList<Vertice> jaVisitados) {
		if (jaVisitados.contains(vAtual))
			return true;
		
		jaVisitados.add(vAtual);
		for (Vertice vAdj : adjacentes(v)) {
			if (vAdj != vAnterior) {
				if (haCicloCom(v, vAdj, vAtual, jaVisitados))
					return true;
			}
		}
		jaVisitados.remove(vAtual);
		return false;
	}
	public String toString() {
		return vertices.toString();
	}
	
	public static boolean exists(Vertice v) {
		if (vertices.contains(v)) 
			return true;
		return false;
	}

}
