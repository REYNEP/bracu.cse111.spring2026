public class HumanTester{ 
  public static void main(String [] args){           
    Human h1 = new Human();
    Human h2 = new Human();
    
    System.out.println(h1);
    System.out.println(h2);
    
    System.out.println(h2.name); 
    System.out.println(h2.nID);
    
    h2.name = "Bob";
    h2.nID = 456;
    
    System.out.println(h1.name); 
    System.out.println(h2.nID);
    
  }
}

//AccessModifier datatype variableName = value