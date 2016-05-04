package myBattleship;

// An initial attempt at a game of Battleship prior to reading through the 4th Chapter of Head First Java.
// Intended as a short test and with the utility being in comparing to in-book program upon completion. 

public class MainGame {

	public static void main(String[] args) {

		System.out.println("Welcome to Battleship");
		System.out.println("You will be guessing the location of ships on a 7x7 grid.");
		System.out.println("Guesses will be in the form: A5, G7, B1, etc)" );
		System.out.println("Let's go!");
		
		GameWorld world = new GameWorld(3,7,7);
		
		while ( world.getRemainingShips() > 0) {
			
		}
		
		
		//end game. display stats
		
	}

}
