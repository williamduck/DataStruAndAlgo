package SortAlgo;

public class QuickSort {
	public static void quicksort(int[] n, int left, int right) {
		int dp;
		if(right > left) {
			dp = partition(n, left, right);
			quicksort(n, left, dp-1);
			quicksort(n, dp+1, right);
		}
	}

	public static int partition(int[] n, int left, int right) {
		int target = n[left];
		while(right > left) {
			while(right > left && n[right] >= target) {
				right--;
			}
			if(right > left) {
				n[left++] = n[right];
			}
			while(right > left && n[left] <= target) {
				left++;
			}
			if(right > left) {
				n[right--] = n[left];
			}
		}
		n[left] = target;
		return left;
	}
//	public static void main(String[]args){
//		int[] a = {1,3,2,5,9,6,7,0,4,8};
//		quicksort(a, 0, 9);
//		for(int i = 0; i <= 9; i++) {
//			System.out.println(a[i]);
//		}	
//	}

	public static void main(String[] args) {
		int[] a = {1,3,2,5,9,6,7,0,4,8,20,11};
		quicksort(a, 0, a.length-1);
		for(int i = 0; i <= a.length-1; i++) {
			System.out.println(a[i]);
		}	
	}
	
}
