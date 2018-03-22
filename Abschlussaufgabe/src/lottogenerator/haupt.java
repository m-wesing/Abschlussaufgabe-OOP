package lottogenerator;


public class haupt {

	public static void main(String[] args) {
		
		int[]iAusgabe;
		int[]iAusgabeSZ;
		int[]iEingabe;
		
		iEingabe=eingabe.frage();
	
		for (int i=0; i<iEingabe[0]; i++) {
		System.out.println("Ziehung: " +(i+1));
		iAusgabe=generator.mischen(iEingabe);
		iAusgabeSZ=superzahl.superzahlmischen(iEingabe);
		ausgabe.drucken(iAusgabe, iAusgabeSZ);
		
		
		}
		
		
	}

}
