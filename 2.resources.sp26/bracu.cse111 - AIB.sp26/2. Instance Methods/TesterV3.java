class TesterV3{
  
  public static void main(String[] args){
    
    //c is an instance/Object
    Car c = new Car();//Creating a car object/instance
    System.out.println( "C: "+c );
    c.setDetails( "Honda Civic", "Blue", 4 );
//    c.printDetails();
    System.out.println("-----1----");
    Car c1 = new Car();//Creating a car object/instance
    System.out.println( "C1: "+c1 );
    c1.setDetails( "Honda Civic", "Blue", 4 );
//    c1.printDetails();
    
    System.out.println( "Comparing: "+c.compareCar( c1 ) );
    c.changeColor( "White" );
    System.out.println( "Comparing: "+c1.compareCar( c ) );
    
  }
  
  
}