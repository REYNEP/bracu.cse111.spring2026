import java.util.Arrays;
public class oop1{
   public static void main(String [] args){
      Student14 s1 = new Student14();
      System.out.println("Name of the Student: "+s1.name);
      System.out.println("ID of the Student: "+s1.id);
      s1.id = 123; //instance var modify
      s1.print(); //method
      System.out.println(s1.print2(5)); 
      System.out.println("ID of the Student: "+s1.id);
      String [] classes;
      classes = new String [] {"CSE111", "CSE230"};
      s1.classes = classes;
//      System.out.println(Arrays.toString(s1.classes)); //mem loc
      s1.arrayPrint();
   }
}
//Name of the Student: Bob
//ID of the Student: 1
//Hi I'm a student
// 5
//ID of the Student: 123
//[CSE111, CSE230] 
