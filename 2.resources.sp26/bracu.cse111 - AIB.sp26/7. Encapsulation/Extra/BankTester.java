class BankTester{  
  public static void main(String[] args){
    BankAcc acc = new BankAcc("Rahim","27/8/1998",26);
    
    System.out.println( acc.checkPass("onno password") );
    System.out.println( acc.checkPass("KothinPassword") );
    
    acc.addMoney( 500, "KothinPassword" );
    acc.printDetails();

  }
}