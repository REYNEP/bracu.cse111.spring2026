public class BankAccount{
  public int acc;
  public String type;  
  public BankAccount(){
    this.acc = 0;
    this.type = "Not set";
  }  
  public BankAccount(int a, String t){
    this.acc = a;
    this.type = t;
    System.out.println("Bank account is created");
  }
  public void printDetails(){
    System.out.println("Account No: "+acc);
    System.out.println("Type: "+type);
  }
  
  
  
}