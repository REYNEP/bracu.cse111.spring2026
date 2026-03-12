public class BankAccount{
  public int acc;
  public String type;
  
  public BankAccount(){
    acc = 2324;
    type = "Salary";
  }
  public BankAccount(int a, String t){
    acc = a;
    type = t;
  }
  
  public void printDetails(){
    System.out.println("Account No: "+acc);
    System.out.println("Type: "+type);
  }
  
}