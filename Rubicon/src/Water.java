//Function: Class Representing the Water unit and its special ability
//Extends: MainUnit (which extends Unit)
//Extended By: None

public class Water extends MainUnit{

	public Water(int x, int y, int teamNum){
		super("Water", x, y, teamNum);
	}
	//helper method for healing friendly units
	public void healUnit(Unit u){
		if ((u.HP< 4) && u.getTeamNum()==this.getTeamNum()){ 
			u.HP++;
		}
	}
	
	//Water heals all friendly adjacent (and diagonal) units for 1 HP
	public void specialAbility(int x,int y){
		if (this.checkAdjacent(x, y)){
			System.out.println("Pleasure select and adjacent non-diagonal spot!");
			return;
		}
		if (Board.getSpot(x+1, y).checkSpotNotEmpty()){
			this.healUnit(Board.getSpot(x+1, y).getUnit());
		}
		if (Board.getSpot(x+1, y+1).checkSpotNotEmpty()){
			this.healUnit(Board.getSpot(x+1, y+1).getUnit());
		}
		if (Board.getSpot(x+1, y-1).checkSpotNotEmpty()){
			this.healUnit(Board.getSpot(x+1, y-1).getUnit());
		}
		if (Board.getSpot(x-1, y).checkSpotNotEmpty()){
			this.healUnit(Board.getSpot(x-1, y).getUnit());
		}
		if (Board.getSpot(x-1, y+1).checkSpotNotEmpty()){
			this.healUnit(Board.getSpot(x-1, y+1).getUnit());
		}
		if (Board.getSpot(x-1, y-1).checkSpotNotEmpty()){
			this.healUnit(Board.getSpot(x-1, y-1).getUnit());
		}
		if (Board.getSpot(x, y+1).checkSpotNotEmpty()){
			this.healUnit(Board.getSpot(x, y+1).getUnit());
		}
		if (Board.getSpot(x, y-1).checkSpotNotEmpty()){
			this.healUnit(Board.getSpot(x, y-1).getUnit());
		}
	}
}
