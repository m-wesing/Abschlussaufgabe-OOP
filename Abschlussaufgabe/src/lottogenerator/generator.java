package lottogenerator;

public class generator {
	public static int[] mischen(int[] iHaupt) {

		boolean[] kugelgezogen;
		int[] lottozahlen;
		int zufallszahl = 0;

		lottozahlen = new int[iHaupt[3]];
		kugelgezogen = new boolean[iHaupt[2]];

		for ( int i = 0; i < lottozahlen.length; i ++){
			if (i==0){
			 zufallszahl=(int) (Math.random()*iHaupt[2]+1);
			 lottozahlen[0]=zufallszahl;
			 kugelgezogen[zufallszahl-1]=true;
		 }

		 zufallszahl=(int) (Math.random()*iHaupt[2]+1);
		 while (kugelgezogen[zufallszahl-1]==true){
			 zufallszahl=(int) (Math.random()*iHaupt[2]+1); 
		 }
		 
		 kugelgezogen[zufallszahl-1]=true;
		 lottozahlen[i] = zufallszahl;
		 
		}
		
		return lottozahlen;

		}
}
