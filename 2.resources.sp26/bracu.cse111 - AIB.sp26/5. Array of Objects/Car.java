class Car{
  
  boolean engine;
  int wheels;
  int doors;
  String model;
  String color;
  double speed;
  
  //CompileTime Polymorphism :: Overloading
  // Contructor v0
  public Car( String m ){
    this();
    this.model = m;
  }
  // Contructor v1
  public Car(){
//    System.out.println("Creating an Object");
  }
  // Contructor v2
  public Car( String m, String c ){
    this( m );
    this.color = c;
  }
  
  
  public void showTheObject(){
    System.out.println( this.model );
  }
  
  //CompileTime Polymorphism :: Overloading
  
  // Overloading v0
  public void updateCarInfo( String m, String c, int w, int d ){
    this.updateCarInfo( w, m );
    this.updateCarInfo( c, d );
  }
  // Overloading v0_1
  public void updateCarInfo(){
    this.updateCarInfo( "Default Model", "No Color", 1, 1 );
  }
  // Overloading v1
  public void updateCarInfo( String m ){
    this.model = m;
  }
  // Overloading v2
  public void updateCarInfo( int w ){
    this.wheels = w;
  }
  // Overloading v3
  public void updateCarInfo( String c, int d ){
    this.color = c;
    this.doors = d;
  }
  // Overloading v3_1 
  public void updateCarInfo( int w, String m ){
    this.model = m;
    this.wheels = w;
  }
  
  
  public void showCar(){
    System.out.print( "Model: "+this.model );
    System.out.print( ", Color: "+this.color );
    System.out.print( ", Wheels: "+this.wheels );
    System.out.println( ", Doors: "+this.doors );
  }
  public void showCar( boolean shwSpd ){
    System.out.print( "Model: "+this.model );
    System.out.print( ", Color: "+this.color );
    System.out.print( ", Wheels: "+this.wheels );
    System.out.println( ", Doors: "+this.doors );
    if( shwSpd ) this.showSpeed();
  }
  
  
  public boolean isCrossingSpeedLimit( int limit ){
    if( this.speed > limit ) return true;
    else return false;
  }
  
  
  public void startEngine(){
    this.engine=true;
    System.out.println(this.model+" Engine Started!");
  }
  //Overloaded v0
  public void accelerate( double speed ){
    if( this.engine ) this.speed+=speed;
    else System.out.println("Engine is off!");
  }
  //Overloaded v1
  public void accelerate(){
    if( this.engine ) this.speed+=10;
    else System.out.println("Engine is off!");
  }
  //Overloaded v2
  public boolean accelerate( int speed ){
    if( this.engine ){
      this.speed+=speed;
      return true;
    }
    else{
      System.out.println("Engine is off!");
      return false;
    }
  }
  
  
  
  public void brake(){
    if( this.engine ){
      if( speed-5<0 ) {
        this.speed = 0;
      } else {
        this.speed -= 5;
      }
    }
  }
  public void showSpeed(){
    System.out.println("The "+this.model+" is going at "+this.speed+" km/hr");
  }
  
  
  
  
  public void crash( Car x ){
    System.out.println( this.model+" crashed with "+x.model );
    System.out.println("Airbags deployed!!!!");
  }
  public boolean compareCar( Car x ){
    return (
       this.model.equals(x.model) &&
       this.color.equals(x.color) &&
       this.wheels == x.wheels &&
       this.doors == x.doors
      );
  }
  
}







