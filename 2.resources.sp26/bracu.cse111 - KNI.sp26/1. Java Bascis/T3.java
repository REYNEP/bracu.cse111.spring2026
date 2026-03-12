import java.util.Scanner;
import java.util.Arrays;
public class T3{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); //5
    int [] arr = new int [N]; // 0 0 0 0 0
    for(int i = 0; i<arr.length; i++){  // 13 76 -34 2 -14
      arr[i] = sc.nextInt();  //instance method 
      if(arr[i]>=0){
        arr[i] = 0;
      }
      else{
        arr[i] = -1;
      }
    }
    System.out.println(arr);
    System.out.println((Arrays.toString(arr)).charAt(0));
    
  }
}