package myBattleship;
import java.util.Random;

public class GameWorld{
	private int remainingShips;
	private int width;
	private int height;
	private int[][] worldMap;
	private boolean[][] guessMap;
	
	public GameWorld( int remainingShips, int width, int height){
		this.remainingShips = remainingShips;
		this.width = width;
		this.height = height;
		this.worldMap = new int[width][height];		//a 2d array that contains all 0's for empty spaces and integers for each individual ship (1 for ship 1, 2 for ship 2, etc)
		this.guessMap = new boolean[width][height];// a 2d array of booleans. False if player has not guessed here. True if they have.
	}
	
	public void setup(){
		// place ships into the "worldMap". for the sake of simplicity, currently all ships are 1x3 on the grid.
			int randX, randY;
			Random r = new Random();
			
		for (int i = 0; i < remainingShips; i ++){
			
			// create random coordinate for placing first block of a ship.
			randX = r.nextInt(7);
			randY = r.nextInt(7);
			
			while (worldMap[randX][randY] != 0 ){
				//keep rolling for a starting position that is not taken
				// NEEDS SOME TERMINATING FACTOR. ENDLESS LOOP IF ALL COORDS ARE TAKEN
				randX = r.nextInt(7);
				randY = r.nextInt(7);
			}
			
			
			
			
			// create random coordinate for placing first block in a ship
			randX = r.nextInt(7);
			randY = r.nextInt(7);
			
			// if this block is already taken, choose another block
			if (worldMap[randX][randY] != 0){
				randX = r.nextInt(7);
				randY = r.nextInt(7);
			}
			else{
				
			}
			 
			
			
			
			// find starting point for current ship
			// choose 
			// hmm? can't think of best way to randomly place ships on board at the moment. 
			// 
			//// first idea:
			//	(at all stages checking that chosen coordinates do not overlap
			//	-randomly choose first coordinate to start ship
			// 	-randomly choose vertical or horizontal placement (50/50)
			// 	-if not next to map edge:
			//		randomly build in either direction available
			//	 else
			// 		build boat in one available direction
			
			// perhaps create a "Battleship" class
			// with variables, [x,y,length,...]
			
		}
		
	}
	
	public int getRemainingShips() {
		return remainingShips;
	}

	public void setRemainingShips(int remainingShips) {
		this.remainingShips = remainingShips;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
