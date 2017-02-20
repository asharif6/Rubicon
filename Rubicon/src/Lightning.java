//Function: Class Representing the Lightning unit and its special ability
//Extends: MainUnit (which extends Unit)
//Extended By: None

public class Lightning extends MainUnit{
	public Lightning(int x, int y, int teamNum){
		super("Lightn.", x, y, teamNum);
	}
	
	//Lightning's special ability interact directly with other units
	public void specialAbility(int x,int y){
		return;
	}
	//lightnings special ability is written in Unit as a result
}