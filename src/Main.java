import Grafo.Aresta;
import Grafo.Grafo;
import Grafo.Vertice;


public class Main {

	public static void main(String[] args) {

		Grafo grafo = new Grafo();
		//Vertice aeroporto = new Vertice("Aeroporto");
		//Vertice campeche = new Vertice("Campeche");
		//Vertice costeira = new Vertice("Costeira");
		//Vertice sacodoslimoes = new Vertice("Saco dos Limões");
		//Vertice centro = new Vertice("Centro");
		//Vertice trindade = new Vertice("Trindade");
		//Vertice agronomica = new Vertice("Agronômica");
		Vertice cacupe = new Vertice("Cacupé");
		//Vertice sambaqui = new Vertice("Sambaqui");
		Vertice jurere = new Vertice("Jurerê");
		Vertice canasvieiras = new Vertice("Canasvieiras");
		//Vertice ingleses = new Vertice("Ingleses");
		//Vertice corregogrande = new Vertice("Corrego Grande");

		//grafo.adicionaVertice(aeroporto);
		//grafo.adicionaVertice(campeche);
		//grafo.adicionaVertice(costeira);
		//grafo.adicionaVertice(sacodoslimoes);
		//grafo.adicionaVertice(centro);
		//grafo.adicionaVertice(trindade);
		//grafo.adicionaVertice(agronomica);
		grafo.adicionaVertice(cacupe);
		//grafo.adicionaVertice(sambaqui);
		grafo.adicionaVertice(jurere);
		grafo.adicionaVertice(canasvieiras);
		//grafo.adicionaVertice(ingleses);
		//grafo.adicionaVertice(corregogrande);
		//grafo.conecta(aeroporto, costeira, new Aresta(4));
		//grafo.conecta(costeira, campeche, new Aresta(5));
		//grafo.conecta(costeira, sacodoslimoes, new Aresta(8));
		//grafo.conecta(centro, sacodoslimoes, new Aresta(5));
		//grafo.conecta(trindade, sacodoslimoes, new Aresta(4));
		//grafo.conecta(trindade, corregogrande, new Aresta(2));
		//grafo.conecta(centro, agronomica, new Aresta(5));
		//grafo.conecta(trindade, agronomica, new Aresta(3));
		//grafo.conecta(agronomica, cacupe, new Aresta(8));
		//grafo.conecta(cacupe, sambaqui, new Aresta(5));
		grafo.conecta(cacupe, jurere, new Aresta(15));
		grafo.conecta(cacupe, canasvieiras, new Aresta(17));
		grafo.conecta(jurere, canasvieiras, new Aresta(4));
		//grafo.conecta(canasvieiras, ingleses, new Aresta(15));
		
		//System.out.println("Vértices do Grafo -> " + grafo.vertices());
		
		//System.out.printf("Adjacentes de Cacupe: %s Grau: %s \n", grafo.adjacentes(cacupe).toString(), grafo.grau(cacupe));

		//grafo.desconecta(v1, v2);
		//System.out.printf("Adjacentes de Trindade: %s Grau: %s \n", grafo
		//		.adjacentes(trindade).toString(), grafo.grau(trindade));
		//grafo.desconecta(trindade, corregogrande);
		//System.out.printf("Adjacentes de Trindade: %s Grau: %s \n", grafo
		//		.adjacentes(trindade).toString(), grafo.grau(trindade));

		//grafo.conecta(trindade, corregogrande, new Aresta(5));
		
		//System.out.println(grafo.ordem() + " <- Ordem");
		
		//System.out.println(grafo.vertices().toString() + " <- Grafo");

		//grafo.removeVertice(v3);
		//grafo.removeVertice(corregogrande);
		//System.out.println(grafo.ordem() + " <- nova Ordem Grafo");
		//System.out.println(grafo.vertices().toString() + " <- Grafo");

		//System.out.println(grafo.umVertice().getNomeVertice());
		//System.out.println(grafo.adjacentes(corregogrande));
		
		//System.out.println("É regular? " + grafo.isRegular());
		//System.out.println("É completo? " + grafo.isCompleto());
		//System.out.println("FechoTransitivo? " + grafo.fechoTransitivo(canasvieiras).toString());
		//grafo.desconecta(canasvieiras, cacupe);
		grafo.desconecta(cacupe, canasvieiras);
		System.out.println("É regular? " + grafo.isRegular());
		System.out.println("É completo? " + grafo.isCompleto());
		//System.out.println("FechoTransitivo? " + grafo.fechoTransitivo(trindade).toString());
		//grafo.conecta(agronomica, cacupe, new Aresta(4));
		//System.out.println("FechoTransitivo? " + grafo.fechoTransitivo(canasvieiras).toString());
		//System.out.println("É conexo? " + grafo.isConexo());
		//grafo.desconecta(agronomica, cacupe);
		//System.out.println("É conexo? " + grafo.isConexo());
		//grafo.conecta(agronomica, cacupe, new Aresta(4));
		//System.out.println("É árvore? " + grafo.isArvore());
		//grafo.desconecta(trindade, agronomica);
		//grafo.desconecta(jurere, canasvieiras);
		//System.out.println("É arvore? " + grafo.isArvore());
		
		Dijkstra dij = new Dijkstra(grafo);
		System.out.println("caminho de custo minimo entre aeroporto e cacupé: " + dij.caminhoCustoMinimo(canasvieiras, cacupe));
		
	}
}
