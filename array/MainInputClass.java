package array;

import java.util.Scanner;
import java.util.Arrays;

public class MainInputClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the Array:");
        int size = sc.nextInt();  // e.g., 5

        int[] arr = new int[size];

        System.out.println("Enter the Elements Into an Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Printing the Array AAElements
        System.out.println("Original Array :"+Arrays.toString(arr));
        //Object -1:
         FindLargestElement f1= new FindLargestElement();
         int largest=f1.largest(arr);
       
        System.out.println("Largest Element is --->"+" On the Above Array "+Arrays.toString(arr)+" is :"+largest);
      //Object 1 for Same class And call it For Different operation:
        int smallest=f1.smallest(arr);
        System.out.println("smallest Element is --->"+" On the Above Array "+Arrays.toString(arr)+" is :"+smallest);
        //Reverse Method....
        ReverseArray.Reverse(arr,size);
        System.out.println(Arrays.toString(arr));
        
        
    }
}
