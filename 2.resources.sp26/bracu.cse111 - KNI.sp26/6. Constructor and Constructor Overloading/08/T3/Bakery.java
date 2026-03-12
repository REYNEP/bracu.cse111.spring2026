public class Bakery{
  public String name;
  public int cap;
  public String [] items;
  public int [] quan;
  public int count;
  
  public Bakery(String n){
    name = n;
    cap = 7;
    items = new String [cap];
    quan = new int [cap];   
  }
  public Bakery(String n, int c){
    name = n;
    cap = c;
    items = new String [cap];
    quan = new int [cap];
  }
  public void addItems(String i, int q){
    if(count<cap){
      items[count] = "Cookies";
      quan[count] = q;
      count++;
    }
  }
  
  public void sellItems(String n, int q){
    boolean found = false;
    for(int i = 0; i<count; i++){
      if(items[i].equals(n)){
        found = true;
        if(quan[i]>=q){
          quan[i]-=q;
        }
        else{
          System.out.println("Sorry! 15 Muffins are not available.");
        }
      }
    }
    if(found == false){
      System.out.println("Not found");
    }
  } 
}