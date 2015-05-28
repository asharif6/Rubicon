public class Board{ 
  String[][] game = new String[18][16]; 
   
  public Board(){ 
    for(int a = 0; a < game.length; a++){ 
      for(int b = 0; b < game[0].length; b++){ 
        game[a][b] = "||"; 
      } 
    } 
    for(int i = 0; i < game.length;i++){ 
      String a = "" + i; 
      if(a.length() == 1){ 
        game[i][0] = String.format("0%d",i); 
      } 
      else{ 
        game[i][0] = ""+i; 
      } 
    } 
    for(int e = 0; e < game[0].length; e++){ 
      String a = "" + e; 
      if(a.length() == 1){ 
        game[0][e] = String.format("0%d",e); 
      } 
      else{ 
        game[0][e] = ""+e; 
      }       
 
    } 
     
    game[1][1] = "P1"; 
    game[1][2] = "F1"; 
    game[1][3] = "P2"; 
    game[1][4] = "W1"; 
    game[1][5] = "P3"; 
    game[1][6] = "D1"; 
    game[1][7] = "P4"; 
    game[1][8] = "e1"; 
    game[1][9] = "P5"; 
    game[1][10] = "L1"; 
    game[1][11] = "P6"; 
    game[1][12] = "w1"; 
    game[1][13] = "P7"; 
    game[1][14] = "P8"; 
    game[1][15] = "P9"; 
     
     
    game[game.length-1][1] = "pa"; 
    game[game.length-1][2] = "F2"; 
    game[game.length-1][3] = "pb"; 
    game[game.length-1][4] = "W2"; 
    game[game.length-1][5] = "pc"; 
    game[game.length-1][6] = "D2"; 
    game[game.length-1][7] = "pd"; 
    game[game.length-1][8] = "e2"; 
    game[game.length-1][9] = "pe"; 
    game[game.length-1][10] = "L2"; 
    game[game.length-1][11] = "pf"; 
    game[game.length-1][12] = "w2"; 
    game[game.length-1][13] = "pg"; 
    game[game.length-1][14] = "ph"; 
    game[game.length-1][15] = "pi"; 
     
  } 
   
   
  public void collaborate(String piece, Coord nextmove){ 
     
     
     
    if(game[nextmove.r][nextmove.c] != null){ 
      for(int i = 0; i < game.length; i++){ 
        for(int e = 0; e < game[0].length; e++){ 
          if(game[i][e].equals(piece)){ 
            game[i][e] = "||"; 
            game[nextmove.r][nextmove.c] = piece; 
          } 
        } 
      } 
    } 
    else{ 
      System.out.println("Can't move there"); 
    } 
  } 
   
   
  public String toString(){ 
    String ab = ""; 
    for(int i = 0; i < game.length; i++){ 
      for(int e = 0; e < game[0].length; e++){ 
        ab += game[i][e] + " "; 
      } 
      ab += "\n"; 
    } 
    return ab; 
  } 
   
}