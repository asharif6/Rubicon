
public enum Units{
  //Name, Max Moves, HP, Special Ability,
  FIRE ("Fire" , 4, 4, a);
  WIND ("Wind" , 4, 4, a);,
  DARKNESS ("Darkness" , 4, 4, a);,
  EARTH ("Earth" , 4, 4, a);,
  LIGHTNING ("Lightning" , 4, 4, a);,
  WATER ("Water" , 4, 4, a);,
  ELEMENTAL ("Elemental", 4, 1, a);
  
  //FIELDS
  public String name;
  public int maxMoves, HP;
  public Ability a;
  
  
  private Units(String name, int maxMoves, int HP, Ability a){
    this.name =name;
    this.maxMoves = maxMoves;
    this.HP = HP;
    this.ability = a;
  }
  
  
  
}
