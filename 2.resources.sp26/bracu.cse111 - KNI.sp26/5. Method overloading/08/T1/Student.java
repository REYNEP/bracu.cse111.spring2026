public class Student{
  public String name;
  public double cgpa = 0.0;
  public String dept = "CSE";
//  public String [] items;
//  public int [] prices;
  
//  public void setShop(String s){   
//    items = new String [10];
//    prices = new int [10];
//  }
//  public void setShop(String s, int c){
//    items = new String [c];
//    prices = new int [c];
//  }
  
  public void updateInfo(String name){
    this.name = name;
  }  
  public void updateInfo(String n, String dept){
    name = n;
    this.dept = dept;
  }
  public void updateInfo(String n, double cg, String dept){
    name = n;
    this.dept = dept;
    this.cgpa = cg;
  }
  public void updateInfo(String n, String dept,  double cg){
    name = n;
    this.dept = dept;
    this.cgpa = cg;
  }
    public void details(){
    System.out.println("Name: "+name);
    System.out.println("Department: "+dept);
    System.out.println("CGPA: "+cgpa);
  }
    
  
  
  
  
  
  
  
  
  
  
  
  
  
  
//  public void updateInfo(String n){
//    this.name = n;
//  }
//  public void updateInfo(String n, String dept){
//    this.name = n;
//    this.dept = dept;
//  }
//  public void updateInfo(String n, double cg, String dept){
//    this.name = n;
//    this.dept = dept;
//    this.cgpa = cg;
//  }
  
  
  
}