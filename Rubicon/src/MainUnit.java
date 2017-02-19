//Function: Class of Main Units (Main units are all non-elemental units)
//Extends: Unit
//Extended by: Dark, Earth, Fire, Water, Wind & Lightning

public abstract class MainUnit extends Unit{

	public MainUnit(String name,  int x, int y, int teamNum) {
		super(name, 4, x, y, teamNum);
	}
	

	//All main units have specialAbilities
	public abstract void specialAbility(int x,int y) throws Exception;
	
	

}
