public class PhoneTester{
  public static void main(String args[]){
     Phone p1 = new Phone();      
     p1.showDetails();
     System.out.println("---------1---------");
     System.out.println(p1.increasePrice(2000));
     System.out.println("---------2---------");
     p1.showDetails();
     Phone p2 = new Phone();
     System.out.println("---------4---------");
     p2.showDetails();
     System.out.println("---------5---------");
     System.out.println(p2.increasePrice(5000));
     System.out.println("---------6---------");
     p2.changeBrandName("Oppo");
     System.out.println("---------7---------");
     p2.showDetails();
     p1.showDetails();
     System.out.println("---------8---------");
     p2.changeColor("Red");
     System.out.println(p2);
     System.out.println(p2.color);
   }
} 

    
    
    
