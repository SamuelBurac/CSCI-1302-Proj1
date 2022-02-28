public class diceArray {
	
	static int randDiceRoll() {
		int roll = 0;
		int min = 1;
		int max = 6;
		roll = (int)(Math.random() * (max - min + 1) + min);
		return roll;
	}

	public static void main(String[] args) {

	int[] rolls = new int[5];
	int yaz = 0; // Number of Yahtzees
	final int totalRolls = 7_776;
	
	for (int i = 0; i < totalRolls; ++i) {
	rolls[0] = randDiceRoll();
	System.out.print(rolls[0]);
	rolls[1] = randDiceRoll();
	System.out.print(rolls[1]);
	rolls[2] = randDiceRoll();
	System.out.print(rolls[2]);
	rolls[3] = randDiceRoll();
	System.out.print(rolls[3]);
	rolls[4] = randDiceRoll();
	System.out.println(rolls[4]);
	
		if (rolls[0] == rolls[1] && rolls[0] == rolls[2] && rolls[0] == rolls[3] && 
			rolls[0] == rolls[4]) {
			++yaz;
		}
	
	}
	System.out.println(yaz + " total Yahtzees after 7,776 rolls");
	System.out.println();
	// 2D Yahtzee
	
	System.out.println("2D Arrays time ;)");
	System.out.println();
	
	int[][] Rolls = new int[5][5];
	yaz = 0;
	int cYaz = 0;
	int dYaz =0;
	
	
	for (int a=0; a < 5; ++a) {
		
		for (int i=0; i < 5; ++i) {
			Rolls [a][i] = randDiceRoll();
			System.out.print(Rolls[a][i]);
		}
		//finds Yahtzees
		if (Rolls[a][0] == Rolls[a][1] && Rolls[0][0] == Rolls[a][2] && Rolls[0][0] == Rolls[a][3] && 
				Rolls[0][0] == Rolls[a][4]) {
				++yaz;
			}
		
		System.out.println();
	}
	
	//finds column Yahtzees
	for (int i = 0; i < 5; ++i) {
		if (Rolls[0][i] == Rolls[1][i] && Rolls[0][i] == Rolls[2][i] && Rolls[0][i] == Rolls[3][i] && 
				Rolls[0][i] == Rolls[4][i]) {
				++cYaz;
			}
	}
	
	//finds diagonal Yahtzees
	if (Rolls[0][0] == Rolls[1][1] && Rolls[0][0] == Rolls[2][2] && Rolls[0][0] == Rolls[3][3] && 
			Rolls[0][0] == Rolls[4][4]) {
			++dYaz;
		}
	
	if (Rolls[4][0] == Rolls[3][1] && Rolls[4][0] == Rolls[2][2] && Rolls[4][0] == Rolls[1][3] && 
			Rolls[4][0] == Rolls[0][4]) {
			++dYaz;
		}
	
	System.out.println("There are " + yaz + " row Yahtzees");
	System.out.println("There are " + cYaz + " column Yahtzees");
	System.out.println("There are " + dYaz + " diagonal Yahtzees");
	}
}
