public class BankAccountTester{
    public static void main(String args[]){
        BankAccount acc1 = new BankAccount();
        System.out.println("-----1-----");
        acc1.printDetails();
        System.out.println("-----2-----");
        BankAccount acc2  = new BankAccount(5779,"Student");
        System.out.println("-----3-----");
        acc2.printDetails();
    }
}

