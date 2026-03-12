public class Course1Tester{
  public static void main(String args []){
     Course1 cse110 = new Course1();
     Course1 cse111 = new Course1();
     Course1 mat110 = new Course1();
     cse110.courseName = "Langauge I";
     cse110.courseCode = "CSE110";
     cse110.credit = 4;
     System.out.println("1----------------");     
     cse110.details();  //instance method
     System.out.println("2----------------");     
     cse111.details();
    }
}


