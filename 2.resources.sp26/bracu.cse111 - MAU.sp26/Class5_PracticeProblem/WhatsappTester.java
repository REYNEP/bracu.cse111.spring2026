public class WhatsappTester
{
  public static void main(String [] args)
  {
    WhatsappGroup w1 = new WhatsappGroup();
    System.out.println("1=================");
    w1.group_name = "Friends forever";
    w1.add_members("Bob");
    w1.add_members("Alice");
    w1.add_members("Carol");
    w1.add_members("Tony");
    w1.add_members("Riley");
    w1.add_members("Rob");
    System.out.println("2=================");
    System.out.println(w1.display());
    System.out.println("3=================");
    System.out.println(w1.check("Bob"));
    System.out.println("4=================");
    w1.send_message("Bob", "Hello!");
    System.out.println("5=================");
    w1.send_message("Rob", "Can I send a message?");
  }
}