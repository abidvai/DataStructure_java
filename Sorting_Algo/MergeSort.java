package Sorting_Algo;
import java.util.*;

public class MergeSort {
	public static void mergeSort(int a[], int start, int mid, int end) {
		
		int  merge[] = new int[end-start +1];
		
		int index1 = start;
		int index2 = mid+1;
		int x = 0;
		
		while(index1 <= mid && index2 <= end) {
			if(a[index1] <= a[index2]) { 
				merge[x++] = a[index1++];
			} else {
				merge[x++] = a[index2++];
			}
		}
		while(index1 <= mid) {
			merge[x++] = a[index1++];
		}
		while(index2 <= end) {
			merge[x++] = a[index2++];
		}
		
		for(int i=0, j=start; i < merge.length; i++, j++) {
			a[j] = merge[i];
		}
	}
	public static void divide(int a[], int start, int end) {
		if(start >= end) {
			return;
		}
		
		int mid = start + (end - start) / 2;
		divide(a, start, mid);
		divide(a, mid+1, end);
		
		mergeSort(a, start, mid, end);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int m = a.length;
		
		divide(a, 0, m-1);
		
		System.out.println("Sorted array is: ");
		for(int i=0; i < m; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
