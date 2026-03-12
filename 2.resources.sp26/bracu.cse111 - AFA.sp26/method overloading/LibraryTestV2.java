public class LibraryTestV2{
    public static void main(String[] args) {
        Library lib = new Library();
        lib.printDetails();  
        lib.name = "City Library";
        System.out.println("1###################");
        System.out.println(lib.addBook("Harry Potter"));
        System.out.println("===================");
        lib.printDetails();      
        System.out.println("2###################");
        System.out.println(lib.addBook("The Alchemist",2));
        System.out.println(lib.addBook("1984", "To Kill a Mockingbird"));
        System.out.println("===================");
        lib.printDetails();  
        System.out.println("3###################");
        System.out.println(lib.addBook("Ikigai"));
    }
}


//Output
//Library Name: Unknown
//Books Stored: 0
//1###################
//Book Added
//===================
//Library Name: City Library
//Books Stored: 1
//Stored Books:
//- Harry Potter
//
//2###################
//Book Added
//Book Added
//Book Added
//Book Added
//===================
//Library Name: City Library
//Books Stored: 5
//Stored Books:
//- Harry Potter
//- The Alchemist
//- The Alchemist
//- 1984
//- To Kill a Mockingbird
//3###################
//Library Full. Cannot add more books.