import java.util.*;

public class Board{
  protected int rows = 18;
  protected int cols = 16;
  String[][] board = new String[rows][cols];
  //[[e1,w1,f1],[null, null, null],[e2,w2,f2]]
    
   // e1 w1 f1
   //  -  -  - 
   // e2 w2 f2 
  
}



public String toString(){
  String temp = "_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _\n";
  for (int i = 0; i < board.length; i++){
    for (int j = 0; j < board[0].length; j++){
      
  
  
  System.out.println();
  System.out.println(this.toString());
  System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
  
  