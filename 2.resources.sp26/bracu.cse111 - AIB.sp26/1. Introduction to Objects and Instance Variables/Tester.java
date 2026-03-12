class Tester{
  
  public static void main(String[] args){
    
    //c is an instance/Object
    Car c = new Car();//Creating a car object/instance
    Car c3 = new Car();//Creating a car object/instance
//    Car c1 = new Car();//Creating a car object/instance
//    Car c2 = new Car();//Creating a car object/instance
    c.model = "Toyota Cross";
    c3.model = "Honda Civic";
    
    System.out.println( "C: "+c );
    System.out.println( "C3: "+c3 );
    System.out.println( "C Model: "+c.model );
    System.out.println( "C3 Model: "+c3.model );
    c = c3;
    System.out.println( "C: "+c );
    System.out.println( "C3: "+c3 );
    System.out.println( "C Model: "+c.model );
    System.out.println( "C3 Model: "+c3.model );
    
//    System.out.println( "Model: "+c1.model );
//    System.out.println( "Model: "+c2.model );
  }
  
}