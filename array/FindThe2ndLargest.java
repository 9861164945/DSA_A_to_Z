package array;

public class FindThe2ndLargest
{

	  public int findSecondLargest(int[] arr) {
	        if (arr.length < 2) {
	            return -1; // Not enough elements
	        }

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int num : arr) {
	            if (num > largest) {
	                secondLargest = largest;
	                largest = num;
	            } else if (num < largest && num > secondLargest) {
	                secondLargest = num;
	            }
	        }

	        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
	    }
}
