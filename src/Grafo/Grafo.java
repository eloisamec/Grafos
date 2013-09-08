package Grafo;
import java.util.HashMap;


public class Grafo 
{
	private HashMap<Integer, Integer> vertices;
	private HashMap<String, Integer> arestas;

	public Grafo()
	{
		setVertices(new HashMap<Integer, Integer>());
		setArestas(new HashMap<String, Integer>());
	}
	
	public boolean verifica_vertice()
	{
		
		return true;
	}

	public HashMap<Integer, Integer> getVertices() {
		return vertices;
	}

	public void setVertices(HashMap<Integer, Integer> vertices) {
		this.vertices = vertices;
	}

	public HashMap<String, Integer> getArestas() {
		return arestas;
	}

	public void setArestas(HashMap<String, Integer> hashMap) {
		this.arestas = hashMap;
	}
	
}
