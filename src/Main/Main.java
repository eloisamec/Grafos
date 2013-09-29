package Main;

import Algoritmo.Dijkstra;
import Grafo.Aresta;
import Grafo.Grafo;
import Grafo.Vertice;

public class Main {

	public static void main(String[] args) {

		Grafo grafo = new Grafo();
		System.out.println("Exemplo de Grafo completo: ");
		Vertice cacupe = new Vertice("Cacupé");
		Vertice jurere = new Vertice("Jurerê");
		Vertice canasvieiras = new Vertice("Canasvieiras");

		grafo.adicionaVertice(cacupe);
		grafo.adicionaVertice(jurere);
		grafo.adicionaVertice(canasvieiras);

		grafo.conecta(cacupe, jurere, new Aresta(5));
		grafo.conecta(cacupe, canasvieiras, new Aresta(7));
		grafo.conecta(jurere, canasvieiras, new Aresta(4));

		System.out.println(grafo.toString_info());
		Dijkstra dij = new Dijkstra(grafo);
		System.out
				.println("Caminho de custo minimo entre Canasvieiras e Cacupé: "
						+ dij.caminhoCustoMinimo(canasvieiras, cacupe));

		System.out.println("----------------------------------------------------");
		System.out.println("Exemplo de Grafo conexo: ");
		Vertice aeroporto = new Vertice("Aeroporto");
		Vertice campeche = new Vertice("Campeche");
		Vertice costeira = new Vertice("Costeira");
		Vertice sacodoslimoes = new Vertice("Saco dos Limões");
		Vertice centro = new Vertice("Centro");
		Vertice trindade = new Vertice("Trindade");
		Vertice agronomica = new Vertice("Agronômica");
		Vertice sambaqui = new Vertice("Sambaqui");
	    Vertice ingleses = new Vertice("Ingleses");
		Vertice corregogrande = new Vertice("Corrego Grande");

		grafo.adicionaVertice(aeroporto);
		grafo.adicionaVertice(campeche);
		grafo.adicionaVertice(costeira);
		grafo.adicionaVertice(sacodoslimoes);
		grafo.adicionaVertice(centro);
		grafo.adicionaVertice(trindade);
		grafo.adicionaVertice(agronomica);
		grafo.adicionaVertice(sambaqui);
		grafo.adicionaVertice(ingleses);
		grafo.adicionaVertice(corregogrande);
		
		grafo.conecta(aeroporto, costeira, new Aresta(4));
		grafo.conecta(costeira, campeche, new Aresta(5));
		grafo.conecta(costeira, sacodoslimoes, new Aresta(8));
		grafo.conecta(centro, sacodoslimoes, new Aresta(5));
		grafo.conecta(trindade, sacodoslimoes, new Aresta(4));
		grafo.conecta(trindade, corregogrande, new Aresta(2));
		grafo.conecta(centro, agronomica, new Aresta(5));
		grafo.conecta(trindade, agronomica, new Aresta(3));
		grafo.conecta(agronomica, cacupe, new Aresta(8));
		grafo.conecta(cacupe, sambaqui, new Aresta(5));
		grafo.conecta(canasvieiras, ingleses, new Aresta(15));
		
		System.out.println(grafo.toString_info());
		dij = new Dijkstra(grafo);
		System.out
				.println("Caminho de custo minimo entre Aeroporto e Cacupé: "
						+ dij.caminhoCustoMinimo(aeroporto, cacupe));
		
		System.out.println("----------------------------------------------------");
		System.out.println("Exemplo de Grafo desconexo: ");
		
		grafo.desconecta(corregogrande, trindade);
		grafo.desconecta(agronomica, cacupe);
		System.out.println(grafo.toString_info());
		}
}
