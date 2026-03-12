import java.util.Arrays;
public class LibraryTest {
    public static void main(String[] args) {
        Library lib = new Library();
//        System.out.println(lib);  // I'm a library    
        lib.printDetails();  
        lib.name = "City Library";
        System.out.println("1###################");
        System.out.println(lib.addBook("Harry Potter"));
        System.out.println("===================");
        lib.printDetails();      
        System.out.println("2###################");
        System.out.println(lib.addBook("The Alchemist"));
        System.out.println(lib.addBook("1984"));
        System.out.println("===================");
        lib.printDetails();  
        System.out.println("3###################");
        System.out.println(lib.addBook("To Kill a Mockingbird"));
        System.out.println("4###################");
        String [] stalls;
        stalls = new String []{"A","B","C"};
//        lib.stallPrint(stalls);
        lib.stallPrint(new String []{"p","q","r"}); 
        
//        System.out.println("5###################");
//        System.out.println("All library books: " + Arrays.toString(lib.bname));
        for(int i = 0; i<lib.bname.length; i++){
           System.out.println(lib.bname[i]);
        }
        String [] demo = lib.books();
        System.out.println(Arrays.toString(lib.books()));
   }
}