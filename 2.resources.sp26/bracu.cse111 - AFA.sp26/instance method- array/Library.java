public class Library{
  public String name = "unknown";
  public int bcount = 0;
  public String [] bname = new String[3];
  public void printDetails(){
    System.out.println("Library Name: " + name);
    System.out.println("Books Stored: " + bcount);
    if(bcount>0){
    System.out.println("Stored books:");
    for(int i = 0; i<bcount; i++){
    System.out.println("-" + bname[i]);
    }
    }
  }
  
  public String addBook(String s){
    if(bcount<3){
    bname[bcount] = s;
    bcount++;
     return "Book added";
    }
    else{
      return "Library Full. Cannot add more books.";
    }
  }
  public void stallPrint(String [] s){
    for(int i = 0; i<s.length; i++){
    System.out.println(s[i]);
    }
  }
  public String[] books(){
    return bname;
  }
}