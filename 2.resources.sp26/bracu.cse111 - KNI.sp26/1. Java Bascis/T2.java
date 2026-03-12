public class T2{
  public static void main(String [] args){
    int [] a = {2,3,4,5,6};
    int [] b = {0,1,1,0,1};
    a[2]+=10;
    System.out.println(a[2]); //14
    a = b;
    System.out.println(a[2]);
  }
}
    