package planetExplorer;

import java.util.Scanner;

public class PlanetExplorerApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter radious");
		double r=scan.nextDouble();
		PlanetExplorer planetExplorer=new PlanetExplorer();
		System.out.printf("%.2f",planetExplorer.calculateSurfaceArea(r));
	}

}
