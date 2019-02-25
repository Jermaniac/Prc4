package practicas;

public class Grafo {
	int estados;
	String matrix[][];
	private int count=0;
	
	public Grafo (int numestados) {
		this.estados=numestados;
		matrix = new String [estados][estados];
		for (int i=0; i < numestados ; i ++) {
			for (int j=0; j < numestados; j++) {
				matrix[i][j]=" ";
			}
		}
		
	}
	public int traducir ( String t) {
		int resul=0;
		if(t.length()==1) {
		switch (t){
		case "S": resul=0;
		break;
		case "A": resul=1;
		break;
		case "B": resul=2;
		break;
		case "C": resul=3;
		break;
		case "D": resul=4;
		break;
		case "E": resul=5;
		break;
		case "F": resul=6;
		break;
	}
		}
		else {
			return Integer.parseInt(""+t.charAt(1));
			
		}
		return resul;
	}
	public String traducir2 ( int t2) {
		String resul=" ";
			switch (t2){
			case 0: resul="p0";
			count++;
			break;
			case 1: resul="p1";
			count++;
			break;
			case 2: resul="p2";
			count++;
			break;
			case 3: resul="p3";
			count++;
			break;
			case 4: resul="p4";
			count++;
			break;
			case 5: resul="p5";
			count++;
			break;
			case 6: resul="p6";
			count++;
			break;
			case 7: resul="p7";
			count++;
			break;
			}
		return resul;
	}
	
	public void insertarArista (String v1, String v2,String valor) {
	matrix[traducir(v1)][traducir(v2)] = valor;
	}
	public void representar () {
		int count;
		for (int i=0; i < estados ; i ++) {
			System.out.println(" ");
			for (int j=0; j < estados; j++) {
				System.out.print("|" +matrix[i][j]+ "|");
			}
		}
		
		System.out.println(" ");
		for ( int k=0;k<matrix.length;k++) {
			count=0;
			System.out.println(" ");
			System.out.print("Vertice "+traducir2(k)+": ");
			for (int i=0; i < estados ; i ++) {
			if(matrix[k][i] != " ") {
				System.out.print(" conecta "+traducir2(i)+ " con arista "+matrix[k][i]+ " | ");
				count++;
			}
			}
			if(count==0) System.out.print(" no conecta");
		}
			System.out.println(" ");
			
		}
		
		
}
