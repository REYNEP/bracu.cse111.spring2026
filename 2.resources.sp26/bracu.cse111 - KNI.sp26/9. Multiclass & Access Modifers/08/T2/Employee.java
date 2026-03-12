public class Employee{
  public String name;
  private int id;
  protected double salary;
  String dept;
  
  public Employee(String n, int i){
    name = n;
    id = i;
  }
  
  public void setID(int i){
    if(i>99){
      id = i;
    }
    else{
      System.out.println("Enter a valid ID");
    }
  }
  public int getID(){
    return id;
  }
    
    
    
    
//  public void setID(int i){
//    if (i>9){
//      id = i;
//    }
//    else{
//      System.out.println("Enter a valid ID");
//    }
//  }
    
//  public int getID(){
//    return id;
//  }
    
    public void info(){
      System.out.println("Name: "+name);
      System.out.println("ID: "+id);
      System.out.println("Salary: "+salary);
      System.out.println("Department: "+dept);
    }
  }