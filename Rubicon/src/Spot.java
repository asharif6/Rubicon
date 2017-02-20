//Function: Class Representing all the squares in the board game
//Extends: None
//Extended By: None
public class Spot {
	int x,y; //row/col of the spot
	Unit currUnit; //current unit on the spot
	
	//constructor initializing fields
	public Spot(int x, int y) {
		this.x = x;
		this.y = y;
		this.currUnit = null; //spots are empty by default
	}
	
	//checks if spot is occupied
	public boolean checkSpotNotEmpty(){
		return this.currUnit != null;
	}
	
	//places unit on current spot
	public void placeUnit(Unit u){
		this.currUnit = u;
	}
	
	//resets spot but emptying it 
	public void resetSpot(){
		this.currUnit = null;
	}
	
	//gets unit on spot
	public Unit getUnit(){
		return this.currUnit;
	}
	public boolean sameSpot(Spot o, Spot g){
		return (g.x == o.x) && (g.y == o.y);
	}
	
	//checks if unit has less than 0 hp. resets spot if so
	public void updateSpot(){
		if (this.getUnit() !=null){
			if (this.getUnit().getHP() >= 0){
				this.resetSpot();
			}
		}
	}
	
	//representation of spots
	public String toString(){
		return this.getUnit().toString();
	}

}
