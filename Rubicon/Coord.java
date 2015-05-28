public class Coord{ 
  public int r; 
  public int c; 
  public Coord(int r , int c){ 
    this.r = r; 
    this.c = c; 
     
  } 
  public String toString(){ 
    String a = String.format("(%d,%d)",r,c); 
    return a; 
  } 
}