public class RandomTester
{
  public static void main(String [] args)
  {
    Random r1 = new Random();  //DHK
    Random r2 = new Random();   //CTG
    Random r3 = new Random();   //Khulna
    r1.x = 10;
    r2.x = 20;
    r3.x = 40;
    int [] arr1 = {1, 2, 3, 4, 5};  //banani
    int [] arr2 = {10, 20, 30, 40, 50}; //gulshan
    
    arr2 = arr1;
    System.out.println(arr2[0]);
    System.out.println(arr1[0]);
    System.out.println("1============");
    r1.method1(arr1);
    System.out.println(arr1[3]);
    
    System.out.println("2============");
    r2 = r1;
    System.out.println(r2.x);
    System.out.println(r1.x);
    
    System.out.println("3============");
    r1.method2(r3);
  }
}









