package array;


public class ReverseArray
{
	  public static  void Reverse(int[] arr, int n)
	 {
       int start = 0;
       int end = n - 1;
       while (start < end)
       {
           Swap(arr, start, end);  
           start++;
           end--;
       }
   }

  public  static void Swap(int[] arr, int p, int q) 
    {
       int temp = arr[p];
       arr[p] = arr[q];
       arr[q] = temp;
   }

}
