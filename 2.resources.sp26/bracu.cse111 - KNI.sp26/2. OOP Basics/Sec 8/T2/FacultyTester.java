public class FacultyTester{
  
  public static void main(String [] args){
    
    Faculty kni = new Faculty();
    Faculty msi = new Faculty();
    
    kni.initial = "KNI";
    kni.pin = 1234;
    
    msi.initial = "MSI";
    msi.pin = 4567;
    
    
    System.out.println("Info of KNI");
    System.out.println("Initial: "+ kni.initial);
    System.out.println("Pin: "+ kni.pin);
    
    System.out.println("Info of MSI");
    System.out.println("Initial: "+ msi.initial);
    System.out.println("Pin: "+ msi.pin);
    
    kni = msi;   //kni = Barishal, msi = Barishal
    
    System.out.println("Initial: "+ kni.initial);
  }
  
}