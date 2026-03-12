import java.util.Arrays;
public class Class2
{
  public static void main(String [] args)
  {
    //Array
    int [] arr1 = new int[5];
    int [] arr2;  //declaring a variable called arr2 which will contain the memory location/ address of an array
    arr2 = new int[5];  //actually creating a physical array in my computer memory whose address is stored in arr2 variable
    
    System.out.println(arr2);
    System.out.println(Arrays.toString(arr2));
    //0, 1, 2, 3, 4... 0...arr2.length - 1
    for(int i =0; i<=arr2.length-1; i++)
    {
      System.out.println(arr2[i]);
    }
    
    int [] arr3 = new int[]{1, 2, 3, 4, 5, 6, 7};
    int [] arr4 = {1, 2, 3, 4, 5, 6, 7};
    m1(10); 
    int b = m2();
    System.out.println(b);
    
    String [] arr = {"CSE110", "CSE111", "CSE111", "CSE220","CSE220","CSE110","CSE110", "CSE111"};
    
    String [] new_array = removeDuplicates(arr);  //DHK
    System.out.println(Arrays.toString(new_array));
    
    System.out.println(Arrays.toString(removeDuplicates(arr)));
  }
  public static String [] removeDuplicates(String [] ar)   //DHK
  {
    int count = 0;
    for(int i =0; i<ar.length; i++)
    {
      boolean flag = false;
      for(int j =0; j<i; j++)
      {
        if(ar[j].equals(ar[i]))
        {
          flag = true;
          break;
        }
      }
      if(!flag)
      {
        count++;
      }
    }
    String [] new_ar = new String[count];  //{null, null, null}  //CTG
    int index = 0;
    for(int i =0; i<ar.length; i++)
    {
      boolean flag = false;
      for(int j =0; j<i; j++)
      {
        if(ar[j].equals(ar[i]))
        {
          flag = true;
          break;
        }
      }
      if(!flag)
      {
        new_ar[index++] = ar[i];
      }
    }
    return new_ar;
  }
    
  public static int m2()
  {
    //
    //
    //
    return 10;
  }
  public static void m1(int num)
  {
    //
    //
    //
    if(num%2==0)
    {
      System.out.println("Even");
      return;
    }
    //Other works
    //
    
    //return;
  }
}









