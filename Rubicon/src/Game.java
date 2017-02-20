//Function: Class where game is played
//Extends: None
//Extended By: None

public class Game {
	
//	private Board b = new Board();
//	
//	public Game(){
//		this.b.initializeBoard();
//	}
//	
//	private String toString(){
//		return b.toString();
//	}
	public static void main(String[] args){
		Board b = new Board();
		b.initializeBoard();
		System.out.println(b.toString());
	}
	
}
