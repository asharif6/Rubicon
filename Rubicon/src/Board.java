//Function: This class represents the board of game where each square is represent by a Spot Object 
//Extends: None
//Extended By: None

public class Board {
	// this 2D array of Spot objects represents all the squares on the board
	private static Spot[][] spots = new Spot[15][17];

	public Board() {
		for (int i = 0; i < spots.length; i++) {
			for (int j = 0; j < spots[0].length; j++) {
				spots[i][j] = new Spot(i, j);
			}
		}
	}

	// Returns spot if it is within bounds. Null is returned otherwise
	public static Spot getSpot(int x, int y) {
		if (x < 15 && x > -1 && y < 17 && y > -1) {
			return spots[x][y];
		}
		return null;
	}
//Places ALL units on board
	public void initializeBoard() {
		// Player 1's Elementals placed
		getSpot(0, 0).placeUnit(new Elemental(0, 0, 1));
		getSpot(0, 2).placeUnit(new Elemental(0, 2, 1));
		getSpot(0, 4).placeUnit(new Elemental(0, 4, 1));
		getSpot(0, 6).placeUnit(new Elemental(0, 6, 1));
		getSpot(0, 8).placeUnit(new Elemental(0, 8, 1));
		getSpot(0, 10).placeUnit(new Elemental(0, 10, 1));
		getSpot(0, 12).placeUnit(new Elemental(0, 12, 1));
		getSpot(0, 14).placeUnit(new Elemental(0, 14, 1));

		// Player 2's Elementals placed
		getSpot(0, 16).placeUnit(new Elemental(0, 16, 2));
		getSpot(2, 16).placeUnit(new Elemental(2, 16, 2));
		getSpot(4, 16).placeUnit(new Elemental(4, 16, 2));
		getSpot(6, 16).placeUnit(new Elemental(6, 16, 2));
		getSpot(8, 16).placeUnit(new Elemental(8, 16, 2));
		getSpot(10, 16).placeUnit(new Elemental(10, 16, 2));
		getSpot(12, 16).placeUnit(new Elemental(12, 16, 2));
		getSpot(14, 16).placeUnit(new Elemental(14, 16, 2));
		
		//Player 1's Main Units Placed
		getSpot(0, 1).placeUnit(new Fire(0, 1, 1));
		getSpot(0, 3).placeUnit(new Earth(0, 3, 1));
		getSpot(0, 5).placeUnit(new Dark(0, 5, 1));
		getSpot(0, 9).placeUnit(new Lightning(0, 9, 1));
		getSpot(0, 11).placeUnit(new Wind(0, 11, 1));
		getSpot(0, 13).placeUnit(new Water(0, 13, 1));
		
		//Player 2's Main Units Placed
		getSpot(1, 16).placeUnit(new Water(1, 16, 2));
		getSpot(3, 16).placeUnit(new Wind(3, 16, 2));
		getSpot(5, 16).placeUnit(new Lightning(5, 16, 2));
		getSpot(9, 16).placeUnit(new Dark(9, 16, 2));
		getSpot(11, 16).placeUnit(new Earth(11, 16, 2));
		getSpot(13, 16).placeUnit(new Fire(13, 16, 2));
	}

	// Updates each spot by calling upon Spot.updateSpot()
	public void updateBoard() {
		for (int i = 0; i < spots.length; i++) {
			for (int j = 0; j < spots[0].length; j++) {
				spots[i][j].updateSpot();
			}
		}
	}
	
	public String toString(){
	    String repr = " __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __\n";
	    String temp = "";
	    for (int i = 0; i < 15; i++){
	      repr += "|";
	      for (int j = 0; j < 17; j++){
	        temp = getSpot(i,j).toString();
	        if (temp!=null){
	          repr += temp;
	        }
	        else{
	          repr += "  ";
	        }
	        temp += "|";
	      }
	      repr += "\n __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __\n";
	    }
	    return repr;
	}
}
