package Day8;

public class FindTheSecondSmallestAndSecondLargest {

	public static void main(String[] args) {
		int[] arr= {10,76,22,99,86,65,34,89,42};
		
		int firstSmallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for (int num : arr) {
			//for second smallest number
			if(num < firstSmallest) {
				secondSmallest  = firstSmallest;
				firstSmallest = num;
			}else if(num < secondSmallest && num!=firstSmallest) {
				secondSmallest = num;
			}
			
			//for second largest number
			if(num > firstLargest) {
				secondLargest  = firstLargest;
				firstLargest = num;
			}else if(num>secondLargest && num!=firstLargest) {
				secondLargest = num;
			}	
		}
		
		System.out.println("Second Smallest is : "+secondSmallest);
		System.out.println("Second Largest is : "+secondLargest);
		
	}
}
