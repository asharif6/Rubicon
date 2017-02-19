//Function: Class Representing the Fire unit and its special ability
//Extends: MainUnit (which extends Unit)
//Extended By: None

public class Fire extends MainUnit{

	public Fire(int x, int y, int teamNum) {
		super("Fire",x,y, teamNum);
	}
	
	//Fire strikes ALL units in adjacent (including diagonal) spots for 1 HP
	public void specialAbility(int x, int y) throws Exception{
		//all units in adjacent spots have their HP decremented
		if(this.checkAdjacent(x, y)){
			if (Board.getSpot(x+1, y).checkSpotNotEmpty()) Board.getSpot(x+1, y).getUnit().decrementHP();
			if (Board.getSpot(x+1, y+1).checkSpotNotEmpty()) Board.getSpot(x+1, y+1).getUnit().decrementHP();
			if (Board.getSpot(x+1, y-1).checkSpotNotEmpty()) Board.getSpot(x+1, y-1).getUnit().decrementHP();
			if (Board.getSpot(x-1, y).checkSpotNotEmpty()) Board.getSpot(x-1, y).getUnit().decrementHP();
			if (Board.getSpot(x-1, y+1).checkSpotNotEmpty()) Board.getSpot(x-1, y+1).getUnit().decrementHP();
			if (Board.getSpot(x-1, y-1).checkSpotNotEmpty()) Board.getSpot(x-1, y-1).getUnit().decrementHP();
			if (Board.getSpot(x, y+1).checkSpotNotEmpty()) Board.getSpot(x, y+1).getUnit().decrementHP();
			if (Board.getSpot(x, y-1).checkSpotNotEmpty()) Board.getSpot(x, y-1).getUnit().decrementHP();
			this.numMoves=0;
		}
		else{
			System.out.println("Please select an adjacent non-diagonal spot!");
		}
	}
	
}
