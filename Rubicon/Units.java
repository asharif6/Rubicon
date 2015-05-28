
abstract class Unit{
  
  //Fields
  public String name;
  public String repr;
  public int player;
  public int maxMoves = 4;
  public int HP;
  public String status;
  public Coord loc;

  
  private Unit(String name, String repr, int player, int maxMoves, int HP, Coord loc){
    this.name =name;
    this.repr = repr;
    this.player = player;
    this.maxMoves = maxMoves;
    this.HP = HP;
    this.status = "ALIVE";
    this.loc = loc;
  }
  
  public void move(Coord c){
    int rMoves = 0;
    int cMoves = 0;
    rMoves = this.loc.r - c.r;
    cMoves = this.loc.c - c.c;
    if (rMoves < 0){
      rMoves *= -1;
    }
    if (cMoves < 0){
      cMoves *= -1;
    }
    if (cMoves + rMoves <= this.maxMoves){
      this.loc = c;
    }
    else {
      System.out.println(String.format("You cannot move %d moves. Max Moves: ", cMoves + rMoves, this.maxMoves));
    }
  }
                                      
  public void attack(Unit a){
    boolean rRange = false; 
    boolean cRange = false;
    boolean canAttack = false;
    if (a.loc.r - this.loc.r == 1 || a.loc.r - this.loc.r == -1){
      rRange = true;
    }
    if (a.loc.c - this.loc.c == 1 || a.loc.c - this.loc.c == -1){
      cRange = true;
    }
    if (rRange && !cRange){
      canAttack = true;
    }
    if (cRange && !rRange){
      canAttack = true;
    }
    if (canAttack){
      a.HP -= 1;
      a.maxMoves -= 1;
      if (a.HP <= 0){
        a.status = "DEAD";
      }
    }
    else{
      System.out.println(String.format("Enemy %s is out of range", a.name));
    }   
  }
  
  public String repr(){
    return this.repr + player;
  }
  
  public String toString(){
    if (this.HP <= 0){
      return name + ": " + this.status;
    }
    return  name +": " + this.repr + " (HP/M: " + this.HP + " " + this.status+ ")";
  }

  
}
