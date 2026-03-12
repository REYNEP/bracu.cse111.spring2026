public class Student{
  public String name;
  public double cgpa = 0.0;
  public String dept = "CSE";
  
   public void details(){
    System.out.println("Name: "+name);
    System.out.println("Department: "+dept);
    System.out.println("CGPA: "+cgpa);
  }
   public void updateInfo(String name){
     this.name = name;
   }   
   public void updateInfo(String n, String d){
     this.name = n;
     dept = d;
   }
   public void updateInfo(String n, double c, String d){
     this.name = n;
     this.dept = d;
     cgpa = c;
   }
   public void updateInfo(String n, String d, double c){
     this.name = n;
     dept = d;
     cgpa = c;
   }
   
}