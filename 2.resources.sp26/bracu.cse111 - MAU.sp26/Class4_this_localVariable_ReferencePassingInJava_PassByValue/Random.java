public class Random
{
  int x;
  public void method1(int [] arr)  //arr - banani
  {
    arr[3] = 100;
  }
  public void method2(Random obj)  //obj- Khulna
  {
    System.out.println(obj.x);  //r3(Khulna) - x
    System.out.println(x);    //r1(dhk) - x
    System.out.println(this.x);  //r1(dhk) - x
  }
}