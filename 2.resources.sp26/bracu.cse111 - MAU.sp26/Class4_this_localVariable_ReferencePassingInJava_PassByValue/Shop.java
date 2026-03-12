public class Shop
{
  public String shopName;
  public String location;
  public String owner;
  public void updateDetails(String n, String l, String o)
  {
    String owner = "Random";
    System.out.println(this);
    shopName = n;
    location = l;
    this.owner = o;
  }
  public void showDetails()
  {
    System.out.println("Shop name: "+shopName);
    System.out.println("Shop location: "+location);
    System.out.println("Shop owner: "+owner);
  }
}