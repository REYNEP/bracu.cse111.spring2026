import java.util.Arrays;
public class Tester{
 public static void main(String [] args){
  Department cse = new Department("CSE", 1200);
  Department cs = new Department("CS", 700);
  System.out.println("1--------------------");
  cse.info();
  System.out.println("2--------------------");
  cs.info();
  System.out.println("3--------------------");
  cse.mergeStudents(cs);
  System.out.println("4--------------------");
  cse.info();
  System.out.println("5--------------------");
  int [] newStudents = {12, 13, 16};
  cse.addStudents(newStudents);
  System.out.println("6--------------------");
  cse.info();
  System.out.println("7--------------------");
  System.out.println(Arrays.toString(newStudents));
 }
}

