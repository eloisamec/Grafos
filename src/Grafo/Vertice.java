package Grafo;

public class Vertice {
	private String nomeVertice;

	public Vertice(String vertice) {
		setVertice(vertice);
	}
	
	public String getVertice() {
		return nomeVertice;
	}

	public void setVertice(String vertice) {
		this.nomeVertice = vertice;
	}
	
	public String toString(){
		return "" + nomeVertice;
	}

}
