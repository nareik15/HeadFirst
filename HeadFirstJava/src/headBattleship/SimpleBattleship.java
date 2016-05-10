package headBattleship;
/**
 * SimpleBattleship --- Used to create "SimpleBattleship" objects.
 * 				SimpleBattleships created in MainGame.
 * @author Kieran Doherty
 */

public class SimpleBattleship {
	
	private int[] locations;
	private int numHits;
	
	public String checkGuess(String stringUserGuess){
	/**
	 * Checks user's guess against this objects int[] locations and returns 
	 * Hit, Miss or Kill 
	 * @param stringUserGuess A user's guess as a String
	 * @return either "Hit", "Miss" or "Kill"	
	 */
	
		// my attempt at code
		int userGuess = Integer.parseInt(stringUserGuess);
		
		
		for (int location: locations){
			if (userGuess == location){
				if (numHits == locations.length){
					return "KILL!";
				}
				numHits ++;
				return "Hit!";
			}
		}
		return "Miss";
		
		//Book's code
		//Noteworthy difference: single return statement
		// see discussions of Dijikstra's "Structured Programming" stating single exit point arguably easier to test (or find code errors)
		
		
		
	}
	
	public void setLocationCells(int[] cellLocations){
	/**
	 * Standard Setter for "locations"
	 * @param cellLocations an int array containing a list of locations for the Battleship
	 * 
	 */
	}
	
	
}
