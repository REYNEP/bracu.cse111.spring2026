public class Cart{
  public String [] items = new String [10];
  public int [] price = new int [10];
  public int total;
  public Cart [] list = new Cart[10];
  
  public void storeProduct(String i, int p){
    if(total<10){
      items[total] = i; 
      price[total] = p;
      total++;
    }
  }  
  public void storeProduct(String i1, int p1, String i2, int p2){
    storeProduct(i1, p1);
    storeProduct(i2, p2);
  }
  
  public void info(){
    System.out.println("Cart Items:");
    if(total == 0){
      System.out.println("Cart is empty");
    }
    else{
      for(int i = 0; i<total; i++){
        System.out.println(items[i]+" - "+price[i]);
      }
    }
  }
  public void transferItem(Cart obj, String it){ //this --> c1, obj --> c2
    for(int i = 0; i<total; i++){
      if(this.items[i].equals(it)){
        obj.storeProduct(this.items[i], this.price[i]);          
        this.items[i] = null;  //{null}
        this.price[i] = 0;
        this.total--;
      }
    }
  }
  public void addCart(Cart o1, Cart o2, Cart o3){ // list = {null, null, null, null ....}
    list[total++] = o1;  // list = {c1, c2, c3, null, null ...}
    list[total++] = o2;
    list[total++] = o3;
  }
  
  public void allCartInfo(){
    for(int i = 0; i<total; i++){
      list[i].info();
    }
  } 
}  