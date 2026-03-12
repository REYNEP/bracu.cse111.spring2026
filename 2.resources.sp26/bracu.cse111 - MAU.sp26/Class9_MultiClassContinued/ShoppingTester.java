public class ShoppingTester
{
  public static void main(String [] args)
  {
    ShoppingItem i1 = new ShoppingItem("Carrots", 80, "Vegetables");
    ShoppingItem i2 = new ShoppingItem("Chicken", 450, "Poultry");
//    i1.itemDetails();
//    i2.itemDetails();
    ShoppingCart c1 = new ShoppingCart();
    c1.addItem(i1); //i1 - DHK  
    c1.addItem(i2); //i2 - CTG
    c1.cartDetails();
    
    //i1.name....DHK.name
  }
}