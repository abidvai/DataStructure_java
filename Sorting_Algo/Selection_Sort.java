package Sorting_Algo;

public class Selection_Sort {
	public static void printArray(int a[]) {
		for(int i=0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		int a[] = {10,9,8,7,6,5,4,3,2,1};
		
		//Selection Sort
		//Time complexity: O(n^2)
		
		for(int i = 0; i < a.length; i++) {
			int smallest = i;
			for(int j= i+1; j < a.length; j++) {
				if(a[smallest] > a[j]) {
					smallest = j;
				}
			}
			int temp = a[smallest];
			a[smallest] = a[i];
			a[i] = temp;
		}
		printArray(a);
	}
}
