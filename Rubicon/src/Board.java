//Function: This class represents the board of game where each square is represent by a Spot Object 
//Extends: None
//Extended By: None

public class Board {
	//this 2D array of Spot objects represents all the squares on the board
	private static Spot[][] spots = new Spot[15][17];

	public Board() {
		for(int i=0; i<spots.length; i++){
            for(int j=0; j<spots[0].length; j++){
                spots[i][j] = new Spot(i, j);
            }
        }
	}
	//Returns spot if it is within bounds. Null is returned otherwise
	public static Spot getSpot(int x, int y ){
		if(x<15 && x>-1 && y<17 && y>-1){
			return spots[x][y];
		}
		return null;
	}
	
	//Updates each spot by calling upon Spot.updateSpot()
	public void updateBoard(){
		for(int i=0; i<spots.length; i++){
            for(int j=0; j<spots[0].length; j++){
            	spots[i][j].updateSpot();
            }
		}
	}
}
