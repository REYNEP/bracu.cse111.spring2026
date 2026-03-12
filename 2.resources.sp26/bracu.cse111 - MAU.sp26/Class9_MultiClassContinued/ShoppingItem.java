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
  ShoppingItem [] itemObjects = new ShoppingItem[5]; //array of objects
  int index = 0;
  public void addItem(ShoppingItem obj)  //obj - CTG
  {
    if(index < itemObjects.length)
    {
      itemObjects[index++] = obj;
    }
  }
  //itemObjects[0] - DHK... itemObjects[0].name/ itemObjects[0].price
  //itemObjects[1] - CTG
  public void cartDetails()
  {
    System.out.println("Items in my cart: ");
    for(int i =0; i<index; i++)
    {
      itemObjects[i].itemDetails();   //CTG.itemDetails()
//      System.out.println("Item Name: "+itemObjects[i].name);
//      System.out.println("Item Price: "+itemObjects[i].price);
//      System.out.println("Item Section: "+itemObjects[i].section);
    }
  }
}


