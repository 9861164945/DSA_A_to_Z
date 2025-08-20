package array;

public class FindLargestElement 
{
	public  int largest(int[] arr) {
	    if (arr == null || arr.length == 0) throw new IllegalArgumentException("Empty array");
	    int max = arr[0];
	    for (int x : arr) {
	        if (x > max) max = x;
	    }
	    return max;
	}
	public  int smallest(int[] arr) {
	    if (arr == null || arr.length == 0) throw new IllegalArgumentException("Empty array");
	    int min = arr[0];
	    for (int x : arr) {
	        if (x < min) min = x;
	    }
	    return min;
	}




}
