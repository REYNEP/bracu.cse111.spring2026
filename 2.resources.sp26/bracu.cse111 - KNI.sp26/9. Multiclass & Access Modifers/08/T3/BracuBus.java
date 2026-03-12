public class BracuBus{
  
  public String route;
  public int cap;
  public String [] pList;
  
  public BracuBus(String r){
    route = r;
    cap = 2;
    pList = new String [cap];
  }
  
  public BracuBus(String r, int c){
    route = r;
    cap = c;
    pList = new String [cap];
  }
  
  public void board(BracuStudent s1, BracuStudent s2){
    board(s1);
    board(s2);
  }

  public void board(BracuStudent s){
    
    if(s.pass == true){
      if(s.getLocation().equals(route)){
        
        //....
      }
      else{
        System.out.println("Wrong bus");
      }
    }
    else{
      System.out.println("You don't have a bus pass!");
    }
  }
}
    
    
    
    
    
    
    