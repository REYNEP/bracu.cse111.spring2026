public class Tester{
  public static void main (String args []){
    Bakery b1 = new Bakery("Sweet Cravings", 10);
    Bakery b2 = new Bakery("Dreamy Delights");
    b1.details();
    System.out.println("-----------------");
    b2.details();
    System.out.println("-----------------");
    b1.addItems("Cookies", 20);
    b1.addItems("Donuts", 15);
    b1.addItems("Muffins", 12);
    System.out.println("-----------------");
    b1.details();
    System.out.println("-----------------");
    b1.sellItems("Donuts",5);
    b1.sellItems("Cookies",7);
    System.out.println("-----------------");
    b1.sellItems("Cake",2);
    System.out.println("-----------------");
    b1.sellItems("Muffins",15);
    System.out.println("-----------------");
    b1.details();
 
    //student2.addCourse(new String [] {"CSE220","PHY112","MAT120","BUS101","CHN101"});
  }
}

