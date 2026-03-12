public class Tester{
 public static void main(String[] args) {
  
        //c is an instance/Object
        Car c = new Car();//Creating a car object/instance
        c.setDetails( "Honda Civic", "Blue", 4 );
        c.startEngine();
        c.accelerate( 50.5 );
        c.accelerate();
        c.showSpeed();
        c.printDetails();
        System.out.println("-----1----");
        Car c1 = new Car();//Creating a car object/instance
        c1.setDetails( "Toyota Cross", "White" );
        c1.printDetails();
        System.out.println("-----2----");
        c1.crash( c );
        System.out.println("-----3----");
        System.out.println( c.speed );
        System.out.println( c1.speed );
 }
}