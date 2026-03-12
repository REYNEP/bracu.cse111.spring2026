public class TestDemo{
  
  public static void main(String[] args){
    int[] arr = {43,64,23,563,65,23,54,36,54,6};
    int[] arr1 = {43,64,6};
    int[] arr2 = {34,7,432};
    int[] arr3 = {3,6,4};
    
    //f(2)
    printArr( arr );
    sumArr( arr );
    int x = maxArr( arr );
    System.out.println( "Inside the main method: "+x );
    
  }
  
  public static int maxArr( int[] x ){
    int max_i = 0;
    for( int i=1; i<x.length; i++){
      if( x[i] > x[max_i] ){
        max_i = i;
      }
    }
    System.out.println( "Max Index: "+max_i );
    System.out.println( "Max Value: "+x[max_i] );
    return x[max_i];
  }

  public static void sumArr( int[] x ){
    int sum = 0;
    for( int i=0; i<x.length; i++){
      sum += x[i];
    }
    System.out.println( "Sum: "+sum );
  }
  

//f(x) = x^2+5
  public static void printArr( int[] x ){
    for( int i=0; i<x.length; i++){
      System.out.print( x[i]+" " );
    }
    System.out.println();
  }
  
}