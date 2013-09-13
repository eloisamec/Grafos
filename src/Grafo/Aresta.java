package Grafo;

public class Aresta {
	private Vertice fonte, destino;
	private int peso;
	private boolean direcionada; 

	public Aresta(Vertice fonte, Vertice destino, int peso, boolean direcionada) {
		this.setFonte(fonte);
		this.setDestino(destino);
		this.setPeso(peso);
		this.setDirecionada(direcionada);
	}
	
	public String toString(){
		return "Vertice fonte = " + fonte + 
				"Vertice destino = " + destino +
				"Peso = " + peso;
	}

	public Vertice getFonte() {
		return fonte;
	}

	public void setFonte(Vertice v1) {
		this.fonte = v1;
	}

	public Vertice getDestino() {
		return destino;
	}

	public void setDestino(Vertice v2) {
		this.destino = v2;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public boolean isDirecionada() {
		return direcionada;
	}
	
	public void setDirecionada(boolean direcionada) {
		this.direcionada = direcionada;
	}

}
