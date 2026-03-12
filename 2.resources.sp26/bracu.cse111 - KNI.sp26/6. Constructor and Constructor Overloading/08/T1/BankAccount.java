public class BankAccount{
  public int acc = 2324;
  public String type = "Salary";
  
  public BankAccount(){
    System.out.println("A new account has been created");
  }
  
  public void info(){
    System.out.println("Account No: "+acc);
    System.out.println("Type: "+type);
  }
  
}