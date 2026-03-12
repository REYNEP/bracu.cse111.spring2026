public class Bakery{
  
  public String [] items;
  public int [] quan;
  
  public void setShop(String n){
    items = new String [10];
    quan = new int [10];
  }
  public void setShop(String n, int cap){
    items = new String [cap];
    quan = new int [cap];
  }
}
  
  