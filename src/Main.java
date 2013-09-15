import Grafo.Aresta;
import Grafo.Grafo;
import Grafo.Vertice;

public class Main {

	public static void main(String[] args) {

		Grafo grafo = new Grafo();
		Vertice v1 = new Vertice("Floripa");
		Vertice v2 = new Vertice("Curitiba");
		Vertice v3 = new Vertice("Poa");
		Vertice v4 = new Vertice("SP");

		grafo.adicionaVertice(v1);
		grafo.adicionaVertice(v2);
		grafo.adicionaVertice(v3);
		grafo.adicionaVertice(v4);
		grafo.conecta(v1, v2, new Aresta(1));
		grafo.conecta(v1, v4, new Aresta(3));
		System.out.printf("Adjacentes de Floripa: %s Grau: %s \n", grafo
				.adjacentes(v1).toString(), grafo.grauAdjacentes(v1));

		grafo.desconecta(v1, v2);
		System.out.printf("Adjacentes de Floripa: %s Grau: %s \n", grafo
				.adjacentes(v1).toString(), grafo.grauAdjacentes(v1));

		System.out.println(grafo.ordem());
		System.out.println(grafo.getGrafo().toString());

		grafo.removeVertice(v3);
		System.out.println(grafo.ordem());
		System.out.println(grafo.getGrafo().toString());

		System.out.println(grafo.umVertice().getNomeVertice());
	}
}
