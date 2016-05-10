/**
 * 
 */
package headBattleship;

/**
 * SimpleBattelshipTester --- For running tests on simple Battleship
 * @author Kieran Doherty
 *
 */
public class SimpleBattleshipTester {
	
	public static void main (String[] args){
		
		SimpleBattleship ship = new SimpleBattleship();
		int[] testLocations = {2,3,4};
		
		ship.setLocationCells(testLocations);
		
		
		String testGuess = "2";
		String result = ship.checkGuess(testGuess);
		String testResult;
		
		if (result.equals("hit")) {
			testResult = "passed";
		}
		else {
			testResult = "failed";
		}
		System.out.println(testResult);
		
		
		
		/** this is the test code that the book includes. I've changed mine slightly and may augment later.
		 Sharpen your Pencil Task:
		 - in general, need more robust tests.
		 - check that incorrect input is dealt with, (e.g. "m")
		 - check that all possible return values can be returned (hit/miss
		 - ...?
		 
		 
		SimpleBattleship ship = new SimpleBattleship();
		int[] testLocations = {2,3,4};
		
		ship.setLocationCells(testLocations);
		
		
		String testGuess = "2";
		String result = ship.checkGuess(testGuess);
		String testResult = "failed";
		
		if (result.equals("hit")) {
			testResult = "passed";
		}
		System.out.println(testResult);
		*/
		
	}

}
