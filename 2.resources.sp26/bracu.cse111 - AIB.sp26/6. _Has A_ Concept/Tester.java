class CarTester{
  public static void main(String[] args){  
    
    Garage g1 = new Garage( "Luigi" );
    System.out.println("------------------");
    Car c1 = new Car( "Toyota Cross", "White" );
    Car c2 = new Car( "Nissan X-Trail", "Red" );
    Car c3 = new Car( "Toyota Supra", "White" );
    System.out.println("------------------");
    g1.storeCar( c1 );
    g1.storeCar( c2 );
    g1.storeCar( c3 );
    System.out.println("------------------");
    Car c4 = new Car("Mazda RX-8", "Blue");
    g1.storeCar( c4 );
    System.out.println("------------------");
    g1.showCars();
    System.out.println("------------------");
    g1.removeCar( "White" );
    System.out.println("------------------");
    g1.showCars();
  }
  
}
