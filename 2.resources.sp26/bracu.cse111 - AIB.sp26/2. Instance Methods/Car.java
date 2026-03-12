// Template Class
// Design Class
// Blueprint of a Car
// Car class
// Car is also a user defined Non-Primitive Datatype
class Car{
  //Instance Variables
  double speed;
  int wheels = 4;
  String color = "No Color";
  String model = "Default Model";
  boolean engine;
  
  //Instance Method
  public void startEngine(){
    if( !this.engine )
      engine=true;
    else
      System.out.println("Engine is already started!");
  }
  public void setDetails( String m, String c, int w ){
    this.model = m;
    this.color = c;
    this.wheels = w;
  }
  //Instance Method
  public void printDetails(){
    System.out.println("Model: "+this.model);
    System.out.println("Color: "+this.color);
    System.out.println("Wheels: "+this.wheels);
    System.out.println("Engine Status: "+this.engine);
  }
  
  //Instance Method
  public void changeColor(String color){
    this.color = color;
  }
  public void accelerate(){
    if( engine ) this.speed += 5.5;
    else System.out.println("Engine is Off! Cannot Accelerate");
  }
  public void brake(){
    if( engine ){
      this.speed -= 3.5;
      if( this.speed<0 ) this.speed = 0.0;
    } else {
      System.out.println("Engine is Off!");
    }
  }
  public void showSpeed(){
    System.out.println( "Model: "+this.model+"  Speed: "+this.speed );
  }
  
  public boolean compareCar( Car x ){
    if( this.model == x.model &&
       this.color == x.color &&
       this.wheels == x.wheels ){
      return true;
    } else {
      return false;
    }
  }
  
  public void printThis(){
    System.out.println( "This: "+this );
  }
  
}









