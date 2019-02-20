package practicas;

public class Grafo {
	int estados;
	String matrix[][];
	
	public Grafo (int numestados) {
		this.estados=numestados;
		matrix = new String [estados][estados];
		for (int i=0; i < numestados ; i ++) {
			for (int j=0; j < numestados; j++) {
				matrix[i][j]=" ";
			}
		}
		
	}
	public void insertarArista (char v1, char v2,String valor) {
		int coor1 =0, coor2=0;
		
	switch (v1){
		case 'S': coor1=0;
		break;
		case 'A': coor1=1;
		break;
		case 'B': coor1=2;
		break;
		case 'C': coor1=3;
		break;
		case 'D': coor1=4;
		break;
		case 'E': coor1=5;
		break;
		case 'F': coor1=6;
		break;
	}
	switch (v2){
		case 'S': coor2=0;
		break;
		case 'A': coor2=1;
		break;
		case 'B': coor2=2;
		break;
		case 'C': coor2=3;
		break;
		case 'D': coor2=4;
		break;
		case 'E': coor2=5;
		break;
		case 'F': coor2=6;
		break;

}
	matrix[coor1][coor2] = valor;
	}
	public void representar () {
		for (int i=0; i < estados ; i ++) {
			System.out.println(" ");
			for (int j=0; j < estados; j++) {
				System.out.print("|" +matrix[i][j]+ "|");
			}
		}
		
		
	}
}
