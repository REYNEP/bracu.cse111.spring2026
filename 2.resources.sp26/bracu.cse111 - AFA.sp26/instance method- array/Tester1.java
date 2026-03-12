public class Tester1{
  public static void main(String []args){
    A a1 = new A();
    A a2 = new A();
    a1.mA(3);
    System.out.println(a1);
  }
}
class A{
  int x = 5;
  
  public void mA(int x){
    x = this.x + x; // 5 + 3
    System.out.println(x);
    System.out.println(this);
  }
}