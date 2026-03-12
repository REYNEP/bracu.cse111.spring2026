public class TaxiTester{
  public static void main(String args []){
    //Taxi t = new Taxi(); //I have to define a non-parameterized constructor in the class as well. Becuase the default one has overrriden
   
    Taxi t1 = new Taxi("Gulshan", "Yellow");
    Taxi t2 = new Taxi("Badda", "Black");
    Taxi t3 = new Taxi("Gulshan", "Yellow");
    System.out.println(t1);
    
    t1.compareTaxi(t3); // should print same
  }
}