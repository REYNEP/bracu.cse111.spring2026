class TesterV2{
  
  public static void main(String[] args){
    
    //c is an instance/Object
    Car c = new Car();//Creating a car object/instance
    System.out.println( "C: "+c );
    c.printThis();
//    c.changeColor( "White" );
//    c.startEngine();//Method Calling/Invoking
//    c.printDetails();
    System.out.println("-----1----");
    Car c1 = new Car();//Creating a car object/instance
    System.out.println( "C1: "+c1 );
    c1.printThis();
//    c1.changeColor( "Blue" );
//    c1.model = "Axio";
//    c1.printDetails();
  }
  
}