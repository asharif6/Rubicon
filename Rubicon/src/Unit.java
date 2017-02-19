//Function: Abstract class defining methods and fields common to all units
//Extends: None
//Extended By: MainUnit

public abstract class Unit {
	int HP;
	int numMoves = 4;
	Spot position;
	boolean canMove = true;
	int x,y; //represent its row/col on board
	boolean checkAlive;
	int teamNum;
	String name;

	//constructor initializing fields
	public Unit(String name, int hp, int x, int y, int teamNum) {
		this.name = name;
		this.HP = hp;
		this.x = x;
		this.y = y;
		this.checkAlive = true;
		this.teamNum = teamNum;
	}
	//Getter method: gets HP field
	public int getHP(){
		return this.HP;
	}
	//Method called when units gets attacked and loses 1 hp
	public void decrementHP(){
		this.HP--;
		this.updateStatus();
	}
	
	public int numMoves(){
		return this.numMoves;
	}
	
	public void setNumMoves(int moves){
		this.numMoves = moves;
	}
	
	public int getX(){
		return this.x;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	//All units can attack an enemy unit in an adjacent non-diagonal spot
	public void basicAttack(int x, int y){
		if(this.checkAdjacent(x, y)){
			if(this.checkSameTeam(Board.getSpot(x, y).getUnit())){
				Board.getSpot(x,y).getUnit().decrementHP(); //attack damages opposing unit for 1 hp
				this.numMoves=0; //attacking unit cannot move after attacking			
			}
			//error indicated if invalid target is selected
			else{
				System.out.println("Must Attack an opposing adjacent unit!");
			}
		}
		//error indicated if invalid spot is selected
		else{
			System.out.println("Selected spot is not adjacent!");
		}
	}
	
	//Method ensures that given coords adjacent (non-diagonal) to current unit's coords
	public boolean checkAdjacent(int row, int col){
		int checkRow=0;
		int checkCol=0;
		if (col==0){
			checkRow = this.getX()-row;
			if (checkRow<0) checkRow *= -1;
			checkCol = 0;
		}
		else if (row==0){
			checkCol = this.getY()-col;
			if (checkCol<0) checkCol *= -1;
			checkRow = 0;
		}
		return ((checkRow==1 && checkCol==0)||(checkCol==1 && checkRow==0));
	}
	
	//Method checks if this unit and given units and on the same team (friendly)
	public boolean checkSameTeam(Unit u){
		return (this.getTeamNum()==u.getTeamNum());
	}
	
	//updates status after unit takes damage, spot is cleared if unit is dead
	public void updateStatus(){
		if (this.HP == 0){
			this.checkAlive = false;
			Board.getSpot(this.x, this.y).resetSpot();
		}
		if (this.name.equals("elem")==false){
			this.numMoves--;
		}
	}
	
	public boolean getStatus(){
		return this.checkAlive;
	}
	public int getTeamNum(){
		return this.teamNum;
	}
	
	//Moves this unit to and adjacent spot provided it is empty
	public void move(int x, int y){
		if (this.checkAdjacent(x, y)){
			if (!((Board.getSpot(x, y).checkSpotNotEmpty())&& this.numMoves>0)){
				Integer oldX = new Integer(this.getX());
				Integer oldY = new Integer(this.getY());
				Board.getSpot(x, y).placeUnit(this);
				Board.getSpot(oldX, oldY).resetSpot();
				this.setX(x);
				this.setY(y);
				this.numMoves--; //units number of remaining moves decrements after moving
			}
		}
		else{
			System.out.println("Please select a valid adjacent non-diagonal spot!");
		}
	}
	
	//String Representation of All Units
	public String toString(){
		return String.format("%s (%d)\nHP: %d", this.name, this.teamNum, this.HP);
	}
	
//	public Spot getSpot(){
//		return this.position;
//	}
//	
//	public void setSpot(Spot newSpot){
//		this.
//	}

}
