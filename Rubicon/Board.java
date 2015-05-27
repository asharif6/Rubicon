import java.util.*;

public class Board{
  //FIELDS
  protected int rows = 18;
  protected int cols = 16;
  String[][] board;
  
  //[[e1,w1,f1],[null, null, null],[e2,w2,f2]]
  
  // e1 w1 f1
  //  -  -  - 
  // e2 w2 f2 
  public Board(int row, int cols){
    this.rows = rows;
    this.cols = cols;
    this.board = new String[rows][cols];
    for (int i = 0; i < this.board.length; i++){
      for (int j = 0; j < this.board[0].length; j++){
        if (i == 0 && j == 0){
          this.board[i][j] = "0";
        }
        else if (j == 0 && i!=0){
          this.board[i][j] = "" + i;
        }
        else if (i == 0 && j!=0){
          this.board[i][j] = "" + j;
        }
      }
    }
  }
  
  
  
  
  public String toString(){
    String repr = " __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __\n";
    String temp = "";
    for (int i = 0; i < board.length; i++){
      repr += "|";
      for (int j = 0; j < board[0].length; j++){
        temp = board[i][j];
        if (temp!=null){
          repr += temp;
        }
        else{
          repr += "  ";
        }
        temp += "|";
      }
      repr += "\n __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __\n";
    }
    return repr;
  }
}
        