public class Shop
{
  public String shopName;
  public String location;
  public String owner;
  String [] shopItems = new String[5];
  int index = 0;
  public void addItem(String [] items)
  {
    for(int i =0; i<items.length; i++)
    {
      addItem(items[i]);
//      if(index < shopItems.length)
//      {
//        shopItems[index++] = items[i];
//      }    
    }
  }
  public void addItem(String item)
  {
    if(index < shopItems.length)
    {
      shopItems[index++] = item;
    }
  }
  public void addItem(String item1, String item2)
  {
    addItem(item1);
    addItem(item2);
//    if(index < shopItems.length)
//    {
//      shopItems[index++] = item1;
//    }
//    if(index < shopItems.length)
//    {
//      shopItems[index++] = item2;
//    }
  }
  public Shop()   //non-parameterized constructor
  {
//    shopName = "Default";
//    location = "Badda";
//    owner = "Mr. x";
    this("Default", "Badda", "Mr. x");
  }
  public Shop(String s, String l)   //parameterized constructor
  {
    //s = Grocery101, l = Gulshan
//    shopName = s;
//    location = l;
//    owner = "Default owner";
//    System.out.println("A shop has been created!");
    
    this(s , l , "Default owner");
  }
  public Shop(String s, String l, String o)   //parameterized constructor
  {
    shopName = s;
    location = l;
    owner = o;
    System.out.println("A shop has been created!");
  }
  public void showDetails()
  {
    System.out.println("Shop name: "+ shopName);
    System.out.println("Shop location: "+ location);
    System.out.println("Shop owner: "+ owner);
    System.out.println("Shop items: ");
    for(int i =0; i<index; i++)
    {
      System.out.println(shopItems[i]);
    }
  }
}