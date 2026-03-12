public class BankAccountTester
{
  public static void main(String [] args)
  {
    BankAccount a1 = new BankAccount("Bob", 12345, 100000.0);
    BankAccount a2 = new BankAccount("Rob", 45678, 200000.0);
//    a1.balance -= 10000;
    
    System.out.println(a1.getBalance());  //need get() method to access/get the private variable value
    a1.setBalance(a1.getBalance() + 50000.0);  //need set() method to update/set the private variable value
    
    System.out.println(a1.getBalance());
//    accountName();   //not possible to access as private
    
    a1.details();
  }
}