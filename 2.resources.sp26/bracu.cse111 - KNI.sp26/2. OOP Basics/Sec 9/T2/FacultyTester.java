public class FacultyTester{
  public static void main(String [] args){
    
    Faculty kni = new Faculty();
    Faculty msi = new Faculty();
    
    System.out.println("Information of KNI");
    System.out.println(kni.initial);
    System.out.println(kni.pin);
    
    System.out.println("Information of MSI");
    System.out.println(msi.initial);
    System.out.println(msi.pin);
    
    kni.initial = "KNI";
    kni.pin = 1234;
    
    msi.initial = "MSI";
    msi.pin = 5678;
    
    System.out.println("Information of KNI");
    System.out.println(kni.initial);
    System.out.println(kni.pin);
    
    System.out.println("Information of MSI");
    System.out.println(msi.initial);
    System.out.println(msi.pin);

    System.out.println(kni);
    System.out.println(msi);
    
    kni = msi;  //kni = Badda, msi = Gulshan
    
    System.out.println(kni.initial);
    
    System.out.println(kni);
    System.out.println(msi);
    
    kni.initial = "TAW";
    System.out.println(msi.initial);
    
  }
  
}