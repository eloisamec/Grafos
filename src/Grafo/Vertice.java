package Grafo;

import java.util.HashMap;

public class Vertice 
{
	private HashMap<Integer, Integer> vertice;
	
	public Vertice()
	{
		setVertice(new HashMap<Integer, Integer>());
	}

	public void insereVertice(int key, int value)
	{
		if (vertice.containsValue(value))
			System.out.println("Valor já existe no grafo!");
		else
		{
			if (vertice.containsKey(key))
				System.out.println("Índice já usado anteriormente");
			else
				vertice.put(key, value);
		}
			
	}
	
	public HashMap<Integer, Integer> getVertice() {
		return vertice;
	}

	public void setVertice(HashMap<Integer, Integer> vertice) {
		this.vertice = vertice;
	}
}
