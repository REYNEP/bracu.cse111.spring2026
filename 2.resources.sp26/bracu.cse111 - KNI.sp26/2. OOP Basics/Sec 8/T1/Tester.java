public class Tester{ 
  public static void main(String [] args){    
    Human h1 = new Human();  //constructor
    Human h2 = new Human();
    
    System.out.println(h1);
    System.out.println(h2);

    
    System.out.println(h1.name);
    System.out.println(h1.nID);
    
    System.out.println(h2.name);
    System.out.println(h2.nID);
    
    //obj.varName = value
    h2.name = "Bob";
    
    System.out.println(h2.name);
    System.out.println(h1.name);
  
    h2.nID = 456;   
    
  }  
}