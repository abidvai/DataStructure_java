package Sorting_Algo;

public class Binary_Search {
public static void binarySerach(int a[],int key) {

		int low = 0 , high = a.length-1;
		while(low <= high) {
			int mid = (low + (high - low)) / 2;
			if(a[mid] == key) {
				System.out.println("Element found at index: " + mid);
				break;
			}else if(a[mid] > key) {
				low = mid -1;
			}else {
				high = mid +1;
			}
		}
		if(low > high) {
			System.out.println("Element not Found!!!");
		}				
	}

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int key = 111;
		binarySerach(a,key);
	}
}
