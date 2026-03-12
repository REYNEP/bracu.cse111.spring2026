public class Tester{
  public static void main(String args[]){
    Cart c1 = new Cart();
    Cart c2 = new Cart();
    Cart c3 = new Cart();
    Cart cartHub = new Cart();
    c1.storeProduct("Pen", 10); 
    c2.storeProduct("Pencil", 15, "Book", 100);
    c2.storeProduct("Eraser", 5);
    c3.storeProduct("Sharpener", 8);
    System.out.println("1------------");
    c1.info();
    System.out.println("2------------");
    c2.info();
    System.out.println("3------------");
    c1.transferItem(c2, "Pen");
    System.out.println("4------------");
    c1.info();
    System.out.println("5-----------");
    c2.info();
    System.out.println("6-----------");
    cartHub.addCart(c1,c2,c3);
    System.out.println("7-----------");
    cartHub.allCartInfo();
  }
}
