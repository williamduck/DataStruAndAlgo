package SortAlgo;

public class HeapSort {
	public static void heapsort(int[] n) {
		int dp = n.length - 1;
		if(n == null || n.length <= 1) {
			return;
		}
		setupMaxHeap(n);
		while(dp > 0) {
			swithIndex(n, 0, dp--);
			maxHeap(n, dp, 0);
		}
	}

	public static void setupMaxHeap(int[] n) {
		for(int i = n.length/2 - 1; i >= 0; i--) {
			maxHeap(n, n.length - 1, i);
		}
	}

	public static void maxHeap(int[] n, int maxIndex, int index) {
		int rightIndex = index * 2 + 2; 
		int leftIndex = index * 2 + 1;
		int largest = index;
		if(rightIndex <= maxIndex && n[rightIndex] > n[largest]) {
			largest = rightIndex;
		}
		if(leftIndex <= maxIndex && n[leftIndex] > n[largest]) {
			largest = leftIndex;
		}
		if(largest != index) {
			swithIndex(n, index, largest);
			maxHeap(n, maxIndex, largest);
		}
	}

	public static void swithIndex(int[] n, int index1, int index2) {
		int temp = n[index1];
		n[index1] = n[index2];
		n[index2] = temp;
	}

	public static void main(String[] args) {
		int[] num = {9,3,5,7,0,1,8,6,2,4};
		heapsort(num);
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
