//Function: Class Representing the Wind unit and its special ability
//Extends: MainUnit (which extends Unit)
//Extended By: None
public class Wind extends MainUnit{
	
	public Wind(int x, int y, int teamNum) {
		super("Wind", x, y, teamNum);
	}
	
	//Provided an coords for an adjacent spot, Wind attacks ALL units 4 spots in that direction for 1 HP
	public void specialAbility(int x, int y) throws Exception{
		
		if (!(this.checkAdjacent(x, y))){
			System.out.println("Please select an adjacent non-diagonal spot!");
			return;
		}
		//checks if special strike is applied to the 4 spots below
		if (this.getX()-x == 1){
			int temp = x-4;
			for(int i = x; i>temp; i--){
				if (Board.getSpot(i, y).checkSpotNotEmpty()) Board.getSpot(i, y).getUnit().decrementHP();
			}
		}
		//checks if special strike is applied to the 4 spots above
		else if (x-this.getX() == 1){
			int temp = x+4;
			for (int i = x; i<temp; i++){
				if (Board.getSpot(i, y).checkSpotNotEmpty()) Board.getSpot(i, y).getUnit().decrementHP();
			}
		}
		else if (this.getY()-y == 1){
			int temp = y-4;
			for(int i = y; i>temp; i--){
				if (Board.getSpot(x, i).checkSpotNotEmpty()) Board.getSpot(i, y).getUnit().decrementHP();
			}
		}
		else if (y-this.getY() == 1){
			int temp = y+4;
			for(int i = y; i<temp; i++){
				if (Board.getSpot(x, i).checkSpotNotEmpty()) Board.getSpot(i, y).getUnit().decrementHP();
			}
		}
	}
}
