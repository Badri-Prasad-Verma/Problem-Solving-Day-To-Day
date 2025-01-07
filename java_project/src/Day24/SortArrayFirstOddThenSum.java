package Day24;

public class SortArrayFirstOddThenSum {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		int left=0;
		int right=arr.length-1;
		
		while(left<right) {
			if(arr[left]%2==0 && arr[right]%2==1) {
				int temp=arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
			if(arr[left]%2==1) {
				left++;
			}
			if(arr[right]%2==0) {
				right--;
			}
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
