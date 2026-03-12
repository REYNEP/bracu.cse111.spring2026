public class CSECourseTester{
  public static void main(String args []){
    CSECourse cse110 = new CSECourse();
    CSECourse cse111 = new CSECourse();
    CSECourse cse220 = new CSECourse();
    cse110.courseName = "Programming Language I";
    cse110.courseCode = "CSE110";
    cse111.courseName = "Programming Language II";
    cse111.courseCode = "CSE111";
    System.out.println("1-----------------");
    cse110.details();  //instance methods
    System.out.println("2-----------------");
    cse111.details();
  }
}
//Course Name: Programming Language II
//Course Code: CSE111
//Credit: 3

