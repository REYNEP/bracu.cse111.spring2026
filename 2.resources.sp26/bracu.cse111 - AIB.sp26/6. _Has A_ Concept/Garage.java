class Garage{
  String name;
  Car[] cars;
  int count;
  
  public Garage(String nm, int size){
    this.name = nm;
    System.out.println("Welcome to "+nm+"'s Garage!");
    this.cars = new Car[size];
  }
  public Garage(String nm){
    this( nm, 3 );
  }
  public void storeCar( Car c ){
    if( count<this.cars.length ){
      this.cars[count] = c;
      count++;
      System.out.println(c.model+" has been parked in "+this.name+"'s Garage");
    } else {
      System.out.println("No Parking Space Left!");
    }
  }
  public void showCars(){
    for( int i=0; i<this.cars.length; i++ ){
      Car c = this.cars[i];
      if( c!=null ) c.printDetails();
    }
  }
  public void showCars( String color ){
    for( int i=0; i<this.cars.length; i++ ){
      Car c = this.cars[i];
      if( c!=null && c.color==color ) c.printDetails();
    }
  }
  public void removeCar(){
    if( count > 0 ){
      this.cars[ count-1 ] = null;
      count--;
      Car c = this.cars[ count-1 ];
      System.out.println(c.model+" has been removed!");
    } else {
      System.out.println("No cars to remove!");
    }
  }
  public void removeCar( String color ){
    for( int i=0; i<this.cars.length; i++ ){
      Car c = this.cars[i];
      if( c!=null && c.color==color ){
        this.cars[i]=null;
        count--;
        System.out.println(c.model+" has been removed!");
      }
    }
  }
  
  
  
  
}