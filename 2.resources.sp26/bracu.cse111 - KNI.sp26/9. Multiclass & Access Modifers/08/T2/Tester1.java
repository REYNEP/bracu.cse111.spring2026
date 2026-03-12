public class Tester1{
  public static void main(String args[]){
    Employee m1 = new Employee("Ali", -23);
//    System.out.println(m1.name);
//      System.out.println(m1.id);
//    System.out.println(m1.salary);
//    System.out.println(m1.dept);
    m1.info();
    m1.setID(1345);
    m1.info();
    System.out.println(m1.getID());
    
    
    
    
//     m1.setID(783);
//     m1.info();
//     System.out.println(m1.getID());
    
    
    
//    m1.empCode = m1.getID()+"-"+m1.name;
//    System.out.println(m1.empCode);
  }
}