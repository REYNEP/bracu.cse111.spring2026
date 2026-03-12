public class BankAccount
{
  public String name;
  public int accountNo;
  private double balance;
  public BankAccount(String n, int a, double b)
  {
    name = n;
    accountNo = a;
    balance = b;
  }
  public double getBalance()
  {
    return balance;
  }
  public void setBalance(double newBalance)
  {
    balance = newBalance;
  }
  public void details()
  {
    accountName();
    System.out.println("Account No: "+accountNo);
    System.out.println("Balance: "+balance);
  }
  private void accountName()
  {
    System.out.println("Account holder: "+name);
  }
}