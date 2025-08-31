package arrays;

public class RemoveDuplicate {
	
	static void replace(int[] arr, int start, int end) {
		for(int i = start; i < end - 1; i++) {
			arr[i]= arr[i + 1] ;
		}
	}
	
	static int removeDuplicate(int[] arr) {
		int size = arr.length;
		for(int i = 0; i < size - 1; i++) {
			for(int j = i+1; j < size; j++) {
				if(arr[i] == arr[j]) {
					replace(arr, j, size); // replace from start to end
					size--;  // to avoid the last element
					j--; // for consecutive duplicate case
				}
			}
		}
		return size;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 1, 2, 2, 4};
		           //1, 2, 3, 2, 2, 4, 4  - 5 (size)
		           //1, 2, 3, 4, 4, 4, 4  - 4 (size)
		
		int n = removeDuplicate(arr); // new size (by user)

		for(int i = 0; i < n; i++) { // from 0 to n (new size)
			System.out.print(arr[i] + " ");
		}
	}

}
