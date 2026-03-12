public class ShoppingItem
{
  String name;
  int price;
  String section;
  public ShoppingItem(String n, int p, String s)
  {
    name = n;
    price = p;
    section = s;
  }
  public void itemDetails()
  {
    System.out.println("Name of item: "+name);
    System.out.println("Item price: "+price);
    System.out.println("Section item kept in: "+section);
  }
}
class ShoppingCart
{
  String [] itemNames = new String[5];
  int index = 0;
  public void addItem(ShoppingItem obj)  //obj - DHK
  {
    if(index < itemNames.length)
    {
      itemNames[index++] = obj.name;
    }
  }
  public void cartDetails()
  {
    System.out.println("Items in my cart: ");
    for(int i =0; i<index; i++)
    {
      System.out.println(itemNames[i]);
    }
  }
}













