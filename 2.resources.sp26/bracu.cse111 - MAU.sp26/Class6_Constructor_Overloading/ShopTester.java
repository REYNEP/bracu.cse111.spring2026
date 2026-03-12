public class ShopTester
{
  public static void main(String [] args)
  {
    Shop s1 = new Shop("Tech Shop", "Mohakhali", "Mr. Y");
    Shop s2 = new Shop("Hungrynaki", "Badda", "Mr. Y");
    Shop s3 = new Shop();
    Shop s4 = new Shop("Grocery101", "Gulshan");
    s1.addItem("Carrots");
    s1.addItem("Cake", "Bread");
    s1.addItem(new String []{"Milk", "Chicken", "Beef"});
    s1.addItem("Biscuits");
    s1.addItem("Potatoes");
    System.out.println("================");
    s1.showDetails();
  }
}