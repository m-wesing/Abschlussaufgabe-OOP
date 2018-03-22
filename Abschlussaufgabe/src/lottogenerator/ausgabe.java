package lottogenerator;

public class ausgabe {
	public static void drucken(int[] x, int[] y) {
		
		for(int i=0; i<x.length; i++) {
			
			if (x[i]<10) { 
			System.out.print("Lottozahl " + (i+1) + " ist:  00" + x[i] + " | ");}
			else if(x[i]<100)	{
				System.out.print("Lottozahl " + (i+1) + " ist:  0" + x[i] + " | ");}
			else {
				System.out.print("Lottozahl " + (i+1) + " ist:  " + x[i] + " | ");
			}
			
		}
		System.out.print("   ");
		for(int i=0; i<y.length; i++) {
			if (y[i]<10) {
				System.out.print("Superzahl " + (i+1) + " ist:  0" + y[i] + " | ");
			}
			else {
				System.out.print("Superzahl " + (i+1) + " ist:  " + y[i] + " | ");
			}
		}
		
		System.out.print("\n");
		System.out.println("");
		
	}

}
