package Sorting_Algo;
import java.util.*;

public class QuickSort {
	public static int partition(int a[], int low, int high) {
		int pivot = a[high];
		int i = low-1;
		
		for(int j=low; j < high; j++) {
			if(a[j] < pivot) {
				i++;
				//Swap
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		i++;
		int temp = a[i];
		a[i] = pivot;
		a[high] = temp;
		return i;
	}
	public static void quickSort(int a[], int low, int high) {
		if(low < high) {
			int pivotindex = partition(a, low, high);
			
			quickSort(a, low, pivotindex-1);
			quickSort(a, pivotindex+1, high);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		int m = a.length;
		
		for(int i=0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		quickSort(a, 0, m-1);
		
		// print
		for(int i=0; i < m; i++) {
			System.out.println(a[i] + " ");
		}
	}
}
