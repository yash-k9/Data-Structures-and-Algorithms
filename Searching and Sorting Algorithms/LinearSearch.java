/**
	Linear Search finds the target element in a linear order
	if found, returns the index or returns -1. The array
	doesn't have to be sorted.

	Time Complexity : O(n) 
	Space Complexity: O(1)

**/

public class LinearSearch{

	public static int search(int[] arr, int target){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == target){
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args){
		int arr[] = {12, 1, 45, 68, 23, 98};
		int target = 23;

		int index = search(arr, target);

		if(index != -1){
			System.out.println("The element is found at index "+ index);
		}
		else{
			System.out.println("The element is not found in the array.");
		}
	}
}