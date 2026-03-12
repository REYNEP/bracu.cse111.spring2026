import java.util.Scanner;
public class T5{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    int upper = 0, lower = 0, digit = 0, sp = 0;
    System.out.println(sc);
    for(int i = 0; i<str1.length(); i++){
      char ch = str1.charAt(i);
      if(ch!=' '){
        int ascii = (int) ch;
        if(ascii>=65 && ascii<=90){ // if(ch>='A' && ch<='Z')
          upper++;
        }
        else if(ascii>=97 && ascii<=122){
          lower++;
        }
        else if(ascii>=48 && ascii<=57){
          digit++;
        }
        else{
          sp++;
        }
      }
    } 
  }
}