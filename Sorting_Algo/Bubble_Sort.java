package Sorting_Algo;

public class Bubble_Sort {
	public static void printArray(int a[]) {
		for(int i=0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		int a[] = {10,9,8,6,4,2,5,3,1};
		
		//Bubble sort
		// Time complexity: O(n^2)
		
		for(int i=0; i < a.length-1; i++) {
			for(int j=0; j < a.length-i -1; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		printArray(a);
	}
}
