package Sorting_Algo;

public class Insertion_Sort {
	public static void printArray(int a[]) {
		for(int i=0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		int a[] = {10,9,8,7,6,5,4,3,2,1};
		
		//Insertion Sort
		//Time complexity: O(n^2)
		
		for(int i = 0; i < a.length; i++) {
			int current = a[i];
			int j = i-1;
			
			while(j >= 0 && current < a[j]) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = current;
		}
		printArray(a);
	}
}
