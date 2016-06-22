package SortAlgo;

public class MergeSort {
	public static void sort(int[] n, int left, int right) {
		if(left >= right) {
			return;
		}
		int mid = (left + right) / 2;
		sort(n, left, mid);
		sort(n, mid+1, right);
		mergeSort(n, left, mid, right);
	}

	public static void mergeSort(int[] n, int left, int mid, int right) {
		int[] temp = new int[right - left + 1];
		int dpR = mid+1;
		int dpL = left;
		int tempPointer = 0;
		while(dpL <= mid && dpR <= right) {
			if(n[dpL] < n[dpR]) {
				temp[tempPointer++] = n[dpL++];
			} else {
				temp[tempPointer++] = n[dpR++];
			}
		}
		while(dpL <= mid) {
			temp[tempPointer++] = n[dpL++];
		}
		while(dpR <= right) {
			temp[tempPointer++] = n[dpR++];
		}
		for(int k = 0; k < temp.length; k++) {
			n[left+k] = temp[k];
		}
	}

	public static void main(String[]args) {
		int[] num = {9,4,1,6,0,8,2,7,3,5};
		sort(num, 0, num.length-1);
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
