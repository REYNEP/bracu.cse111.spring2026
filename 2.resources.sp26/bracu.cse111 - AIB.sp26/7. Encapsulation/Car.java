// Template Class
// Design Class
// Blueprint of a Car
// Car class
// Car is also a user defined Non-Primitive Datatype
class Car{
  
  private boolean engine;
  private int wheels;
  private int doors;
  private String model;
  private String color;
  private double speed;
  
  //Getter
  public String getModel(){
    return this.model;
  }
  //Getter
  public String getColor(){
    return this.color;
  }
  //Setter
  public void setModel( String m ){
    this.model = m;
  }
  
  
  //Constructor v0
  public Car(){
    System.out.println("A Car has been created!!");
  }
  //Constructor v1
  public Car( String m ){
    this();
    this.model = m;
  }
  //Constructor v2
  public Car( String m, String c ){
    this( m );
    this.color = c;
  }
  
  public void printThis(){
    System.out.println( this );
  }
  //v0
  public void setDetails( String m, String c, int w ){
    this.setDetails( m, c );
    this.wheels = w;
  }
  //Overloaded :: v0_1
  public void setDetails(){
    this.model = "Default Model";
    this.color = "No Color";
    this.wheels = 1;
    this.doors = 1;
  }
  //Overloaded :: v1
  public void setDetails( String m ){
    this.model = m;
  }
//  //Overloaded :: v1_1 not going to work
//  public void setDetails( String c ){
//    this.color = c;
//  }
  //Overloaded :: v2
  public void setDetails( String m, String c ){
    this.model = m;
    this.color = c;
  }
//  //Overloaded :: 2_1 not going to work
//  public void setDetails( String c, String m ){
//    this.color = c;
//    this.model = m;
//  }

  
  //Overloaded :: v0
  public void printDetails(){
    System.out.print( "Model: "+this.model );
    System.out.print( ", Color: "+this.color );
    System.out.println( ", Wheels: "+this.wheels );
  }
  //Overloaded :: v1
  public void printDetails( boolean shwSpd ){
    System.out.print( "Model: "+this.model );
    System.out.print( ", Color: "+this.color );
    System.out.println( ", Wheels: "+this.wheels );
    
    if( shwSpd ) this.showSpeed();
  }

  public void startEngine(){
    this.engine=true;
    System.out.println(this.model+" Engine Started!");
  }

  //Overloaded :: v0
  public void accelerate(){
    if( this.engine ) this.speed+=10;
    else System.out.println("Engine is off!");
  }
  //Overloaded :: v1
  public void accelerate( double speed ){
    if( this.engine ) this.speed+=speed;
    else System.out.println("Engine is off!");
  }

  public void brake(){
    if( this.engine ){
      this.speed -= 5;
      if( speed<0 ) this.speed = 0;
    }
  }
  public void showSpeed(){
    System.out.println("The "+this.model+" is going at "+this.speed+" km/hr");
  }
  
  public boolean compareCar( Car x ){
    return ( this.model.equals( x.model ) &&
       this.color.equals( x.color ) &&
       this.doors == x.doors  &&
       this.wheels == x.wheels );
  }
  
  public void crash( Car x ){
    System.out.println( this.model+" crashed with "+x.model );
    System.out.println( "Airbags deployed!!!");
    this.speed = x.speed = 0;
  }
}