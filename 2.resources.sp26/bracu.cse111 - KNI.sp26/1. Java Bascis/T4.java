import java.util.Scanner;
import java.util.Arrays;
public class T4{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int arr [] = {23, 56, -23, 11, 44};
    int even = 0, odd = 0, evenC = 0, oddC = 0;
    for(int i = 0; i<arr.length; i++){
      if(arr[i]%2==0){
        even++;
      }
      else{
        odd++;
      }
    }
    int [] evenArr = new int [even];
    int [] oddArr = new int [odd];  
    for(int i = 0; i<arr.length; i++){
      if(arr[i]%2==0){
         evenArr[evenC++] = arr[i];
      }
      else{
        oddArr[oddC++] = arr[i];
      }
    }
  }
}
      
      
      
      
      