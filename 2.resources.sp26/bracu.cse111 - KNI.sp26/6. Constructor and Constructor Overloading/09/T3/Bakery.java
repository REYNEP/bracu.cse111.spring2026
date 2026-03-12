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
      items[count] = i;
      quan[count] = q;
      count++;
      System.out.println("20 Cookies are added.");
    }
    else{
      System.out.println("No capacity");
    }
  }
  
  public void sellItems(String n, int q){
    boolean found = false;
    for(int i = 0; i<count; i++){
      if(items[i].equals(n)){
        found = true;
        if(q<=quan[i]){
          quan[i]-=q;
          System.out.println(".......");
        }
        else{
          System.out.printf("Sorry! %d %s are not available.", q, items[i]);
        }
      }
    }
    if(found == false){
      System.out.println("Item not available");
    }
  }
  
  
  
}




