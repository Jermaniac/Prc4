package practicas;

public class App{
public static void main(String[] args){
	Grafo g = new Grafo (7);
	Grafo g2 = new Grafo(8);
	
	g.insertarArista("S","A","a");
	g.insertarArista("S","C","b");
	g.insertarArista("S","F","d");
	g.insertarArista("S","D","c");
	
	
	g.insertarArista("A","B", "b");
	
	
	g.insertarArista("B", "B", "b");
	g.insertarArista("B","F","c,d");
	
	g.insertarArista("C", "D", "a");
	
	g.insertarArista("D", "S", "a");
	g.insertarArista("D", "E", "c");
	
	g.insertarArista("E", "F", "b");
	
	g.representar();
	//Segundo grafo ejemplo
	g2.insertarArista("p0", "p1", "a");
	g2.representar();
	

	
}
}

