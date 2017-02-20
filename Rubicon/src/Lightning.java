import java.util.*;
//Function: Class Representing the Lightning unit and its special ability
//Extends: MainUnit (which extends Unit)
//Extended By: None

public class Lightning extends MainUnit{
	private ArrayList<Unit> known_spots = new ArrayList<Unit>();
	public Lightning(int x, int y, int teamNum){
		super("Lightn.", x, y, teamNum);
	}
//WIP
//For referrence : Unit(String name, int hp, int x, int y, int teamNum)	
	public void specialAbility(int x,int y){
		Spot curr_spot = new Spot(x,y);
		for(int i = 0;i < known_spots.size();i++){
			if(!(sameSpot(curr_spot, known_spots.get(i))){
				known_spots.add(curr_spot);
			}
			   else{ return;}
		}
		
	}
}
