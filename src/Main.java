import java.util.HashMap;

import Grafo.Grafo;
import Grafo.Vertice;

public class Main 
{

	public static void main(String[] args)
	{
		Grafo grafo = new Grafo(true);
		grafo.adicionaVertice(new Vertice("Floripa"));
		grafo.adcionaVertice(new Vertice("Curitiba"));
		grafo.adicionaVertice(new Vertice("Floripa"));
		grafo.adicionaVertice(new Vertice("Poa"));
		grafo.adicionaVertice(new Vertice("SP"));
		
		for (Vertice v : grafo.getGrafo().values())
			System.out.println(v);
	}
}
