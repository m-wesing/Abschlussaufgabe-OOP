package lottogenerator;

public class superzahl {
	public static int[] superzahlmischen(int[] iX) {
		
		boolean[] kugelgezogen;
		int[] superzahlen;
		int zufallszahl =0;

		superzahlen= new int[iX[1]];
		kugelgezogen= new boolean[10];

		for ( int i =0; i < superzahlen.length; i ++){
			if (i==0){
				zufallszahl=(int) (Math.random()*10+1);
				superzahlen[0]=zufallszahl;
				kugelgezogen[zufallszahl-1]=true;
			}
			zufallszahl=(int) (Math.random()*10+1);
			while (kugelgezogen[zufallszahl-1]==true){
				zufallszahl=(int) (Math.random()*10+1); 
			}

		 kugelgezogen[zufallszahl-1]=true;
		 superzahlen[i] = zufallszahl;
		}

		return superzahlen;
		
	}
}