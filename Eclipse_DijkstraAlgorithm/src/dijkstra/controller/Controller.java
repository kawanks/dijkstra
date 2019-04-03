package dijkstra.controller;
import dijkstra.models.*;

public class Controller {
	
	public static void main(String[] args) {
		Graph gf= new Graph(5);
		DijkstraAlgorithm dj;
		
		try {
			dj = new DijkstraAlgorithm(gf);
			
			gf.showNodes();
			
			System.out.println("\n\n\n");
			
			dj.mudar();//Depois de usar esse método grafo gf não devia mudar os valores
			
			gf.showNodes();
			
			System.out.println("\n\n\n");
			dj.gf.showNodes();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
