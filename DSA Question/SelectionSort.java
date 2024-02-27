// import java.util.*;
// public class SelectionSort {
//     public static void Method(int[] arr) {

//         for (int i = 0; i < arr.length - 1; i++) {
//             int MinElement = arr[i];
//             int MinIndex = i;
//             for (int j = i + 1; j < arr.length - 1; j++) {
//                // MinElement=Math.min(MinElement,arr[j]);
//                 if (arr[j]<MinElement) {
//                 MinElement = arr[j];
//                 MinIndex = j;
//                 }
            
            
//             arr[MinIndex]=arr[i];
//             //MinElement = arr[MinIndex];
//             arr[i] = MinElement;
//            // int temp = arr[MinIndex];

//             // int min=arr[i+1];
//             // min=Math.min(min, arr[i]);

//             // }
//             // if(min>arr[i]){
//             // min=arr[i];
//             // }
//             // min=Math.min(min, arr[i]);

//         }
//         for (int m = 0; m < arr.length; m++) {
//             System.out.println(arr[m]);

//         }
//     }
//     }

//     public static void main(String[] args) {
//         int[] arr = { 7, 2, 9, 6, 1, 5, 4 };
//         Method(arr);

//     }

// }
// Java program for implementation of Selection Sort 
import java.io.*; 
public class SelectionSort 
{ 
	void sort(int arr[]) 
	{ 
		int n = arr.length; 

		// One by one move boundary of unsorted subarray 
		for (int i = 0; i < n-1; i++) 
		{ 
			// Find the minimum element in unsorted array 
			int min_idx = i; 
			for (int j = i+1; j < n; j++) 
				if (arr[j] < arr[min_idx]) 
					min_idx = j; 

			// Swap the found minimum element with the first 
			// element 
			int temp = arr[min_idx]; 
			arr[min_idx] = arr[i]; 
			arr[i] = temp; 
		} 
	} 

	// Prints the array 
	void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 

	// Driver code to test above 
	public static void main(String args[]) 
	{ 
		SelectionSort ob = new SelectionSort(); 
		int arr[] = {64,25,12,22,11}; 
		ob.sort(arr); 
		System.out.println("Sorted array"); 
		ob.printArray(arr); 
	} 
} 
/* This code is contributed by Rajat Mishra*/
