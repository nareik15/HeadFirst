package other;

public class BeerSong {

	public static void main(String[] args) {
		//BeerSong_flawed();
		BeerSong_fixed();

	}
	
	
	
	public static void BeerSong_flawed(){
		int beerNum = 99;
		String word = "bottles";
		
		while (beerNum >0) {
			if (beerNum == 1) {
				word = "bottle";
			}
			
			System.out.println(beerNum + " " + word + " of beer on the wall,");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("Take one down,");
			System.out.println("Pass it around.");
			
			beerNum -= 1;
			
			if (beerNum > 0) {
				System.out.println(beerNum + " " + word + " of beer on the wall.");
			} else {
				System.out.println("No more bottles of beer on the wall.");
			}
			System.out.println("");
		}
	}
	
	public static void BeerSong_fixed(){
		// improvements made
		// 1. moved the location of the "beerNum == 1" check as program currently makes mistake in penultimate round of song
		// 2. a reduction in lines though perhaps not improvement in readability...?
		//    the "if (beerNum > 0)" near the botom is unnecessary due the while loop pull out that if/else
		// EDIT: this second point is wrong. need to keep as is...
		
		int beerNum = 99;
		String word = "bottles";
		
		while (beerNum >0) {			
			System.out.println(beerNum + " " + word + " of beer on the wall,");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("Take one down,");
			System.out.println("Pass it around.");
			
			beerNum -= 1;
			
			if (beerNum == 1) {
				word = "bottle";
			}
			
			if (beerNum > 0) {
				System.out.println(beerNum + " " + word + " of beer on the wall.");
			} else {
				System.out.println("No more bottles of beer on the wall.");
			}
			System.out.println("");
		}
	}

}
