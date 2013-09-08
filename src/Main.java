import java.util.HashMap;

import Grafo.Grafo;
import Grafo.Vertice;

public class Main 
{

	public static void main(String[] args)
	{
		Grafo grafo = new Grafo(true);
		grafo.insereVertice(new Vertice("Floripa"));
		grafo.insereVertice(new Vertice("Curitiba"));
		grafo.insereVertice(new Vertice("Floripa"));
		grafo.insereVertice(new Vertice("Poa"));
		grafo.insereVertice(new Vertice("SP"));
		
		for (Vertice v : grafo.getGrafo().values())
			System.out.println(v);
	}
}
