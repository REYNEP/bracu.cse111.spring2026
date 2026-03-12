import java.util.Arrays;
public class BracStudentTester
{
  public static void main(String [] args)
  {
    //className reference_variable = new className();
    BracStudent student1 = new BracStudent();
    BracStudent student2 = new BracStudent();
    new BracStudent();
    System.out.println(student1);
    System.out.println(student2);
    
//    student1 = name:Unknown, id: 0, semester=null, courses
//    student2 = name:Unknown, id:0, semester:null, courses
    
    System.out.println(student1.name);  //DHK.name
    System.out.println(student2.name);  //CTG.name
    
    System.out.println(student1.id);
    System.out.println(student2.id);
    
    System.out.println(student1.semester);
    System.out.println(student2.semester);
    
//    System.out.println(Arrays.toString(student1.courses));
    
    student1.name = "Bob";
    student2.name = "Alice";
    
    student1.id = 123;
    student2.id = 456;
    
    student1.semester = "Spring 2026";
    student2.semester = "Summer 2026";
    
    System.out.println(student1.name);
    System.out.println(student2.name);
    
    System.out.println(student1.id);
    System.out.println(student2.id);
    
    System.out.println(student1.semester);
    System.out.println(student2.semester);
    
//    m1();
    
    student1.attendClass();
    student2.attendClass();
  }
}










