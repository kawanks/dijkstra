package dijkstra.controller;
import dijkstra.models.*;

public class Controller {
	
	public static void main(String[] args) {
		Graph gf= new Graph(5);
		DijkstraAlgorithm dj;
		
		try {
			dj = new DijkstraAlgorithm(gf);
			
			
			System.out.println("original:");
			
			gf.showNodes();
			
			System.out.println("\n\n\n");
			
			dj.mudar();//Depois de usar esse método grafo gf não devia mudar os valores
			
			System.out.println("mudança de ref:");
			gf.showNodes();
			
			System.out.println("\n\n\nmodificado:");
			dj.gf.showNodes();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
