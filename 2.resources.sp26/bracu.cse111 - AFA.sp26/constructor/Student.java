public class Student{
  String name = "Default";
  Student(){
 
  }
  Student(String s){
     name = s;
  }
  
  public void display(){
    System.out.println("Name of the student " +name);
  }
}