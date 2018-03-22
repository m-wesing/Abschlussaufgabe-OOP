package lottogenerator;

import javax.swing.JOptionPane;

public class eingabe {
	
	public static int[] frage() {
		
		int iA = 0;
		int iW = 0; 
		int iX = 0; 
		int iY = 0; 
		int iZ = 0;
		int[] iUebergabe = {0,0,0,0}; 

		
		do {
			try {
				iW = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie die Anzahl der zu ziehenden Kugeln ein (1 - ?): "));
			} 
			catch (NumberFormatException s)
				{JOptionPane.showMessageDialog(null, "Bitte geben sie eine gültige, ganze Zahl ein.");}
		}while(iW<1);
		
		iA=iW+1;
		
		do {
			try {
				iX = Integer.parseInt(JOptionPane.showInputDialog("Wie oft soll der Lottozahlengenerator ausgeführt werden (1 - ?): "));
			} 
			catch (NumberFormatException s)
				{JOptionPane.showMessageDialog(null, "Bitte geben sie eine gültige, ganze Zahl ein.");}
		}while(iX<1);
		 
		 do {
			 try {
				 iY = Integer.parseInt(JOptionPane.showInputDialog("Wieviel Superzahlen sollen gezogen werden (1 - 3): "));
			 }
			 catch (NumberFormatException s)
			 	{JOptionPane.showMessageDialog(null, "Bitte geben sie eine gültige, ganze Zahl ein.");}
		 } while(iY<1 || iY>3);
		 	 
		  do {
			 try {
				 iZ = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie den Maximalbereich der Lottozahlen an (" + iA + " - ?): "));
			 }
			 catch (NumberFormatException s)
			 {JOptionPane.showMessageDialog(null, "Bitte geben sie eine gültige, ganze Zahl ein.");}
		 } while(iZ<iA);
		 

		 iUebergabe[0]=iX;
		 iUebergabe[1]=iY;
		 iUebergabe[2]=iZ;
		 iUebergabe[3]=iW;
		 return iUebergabe;
	}
}
