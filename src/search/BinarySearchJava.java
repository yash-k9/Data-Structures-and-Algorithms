package search;/*
	Binary Search algorithm searches for the target in a sorted array 
	by dividing the array into half. It returns if search key is found
	at mid. If search key is not found and  mid-element is less than
	the target, it narrows down the interval to upper half and if the 
	mid-element is larger than narrows down the interval to lower half.

	Time Complexity : O(Log n)
	Space Complexity : O(1)

*/

public class BinarySearchJava {

	public static int binarySearch(int[] arr, int target){
		int size = arr.length;
		int low = 0;
		int high = size - 1;
		
		while (low <= high) {
			int mid = low + ((high - low) / 2);

			if(arr[mid] == target){
				return mid;
			}
			else if(arr[mid] < target){
				low = mid + 1;
			}
			else if(arr[mid] > target){
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args){
		int arr[] = {2, 3, 4, 7, 15, 20, 25, 45};
		int size = arr.length;
		int target = 7;

		int result = binarySearch(arr, target);
		if(result != -1){
			System.out.println("The element is found at index " + result);
		}
		else{
			System.out.println("The element is not found.");
		}	
	}
}