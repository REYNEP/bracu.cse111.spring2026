//Task 3 (Class and Practice Task Doc)

public class Players {
  public static void main(String[] args) {
    String[] player_names = {"Hamza", "Jamal", "Topu"};  //DHK
    int[] contributions = new int[player_names.length];  //[40, 35, 20]... CTG
    
    add_contribution(player_names, contributions, "Hamza", 40);
    add_contribution(player_names, contributions, "Topu", 35);
    add_contribution(player_names, contributions, "Tariq", 14);
    add_contribution(player_names, contributions, "Jamal", 20);
    
    System.out.println("====Player Contributions====");
    show(player_names, contributions);
    
    add_new_player(player_names, contributions, "Rana");
    
    System.out.println("====Player Contributions====");
    show(player_names, contributions);
  }
  public static void add_contribution(String [] pN, int [] cont, String name, int c)
  {
    int index =0;
    boolean flag = false;
    for(int i =0; i<pN.length; i++)
    {
      if(pN[i].equals(name))
      {
        flag = true;
        cont[i] = c;
        System.out.println(name+" added contribution.");
      }
    }
    if(!flag)
    {
      System.out.println(name+" not found in team. Cannot add contribution.");
    }
  }
  public static void show(String[] pN, int[] cont) {
    for (int i = 0; i < pN.length; i++) {
      System.out.println(pN[i] + " : " + cont[i] + " goals/assists");
    }
  }
  public static void add_new_player(String[] pN, int[] cont, String newPlayer) {
    int minIndex = 0;
    for (int i = 1; i < cont.length; i++) {
      if (cont[i] < cont[minIndex]) {
        minIndex = i;
      }
    }
    System.out.println(newPlayer + " added as a new player by removing " + pN[minIndex]);
    pN[minIndex] = newPlayer;
    cont[minIndex] = 0; 
  }
}