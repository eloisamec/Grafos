import Grafo.Grafo;
import Grafo.Vertice;

public class Main {

	public static void main(String[] args) {
		Grafo grafo = new Grafo(true);
		grafo.adicionaVertice(new Vertice("Floripa"));
		grafo.adicionaVertice(new Vertice("Curitiba"));
		grafo.adicionaVertice(new Vertice("Floripa"));
		grafo.adicionaVertice(new Vertice("Poa"));
		grafo.adicionaVertice(new Vertice("SP"));

		for (Vertice v : grafo.getGrafo())
			System.out.println(v.getNomeVertice());
	}
}
