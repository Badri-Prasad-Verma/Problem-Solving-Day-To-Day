package Day2;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		int[] x= {1,1,2,3,3,4,5,5,6,7,7,8,9};
		int[] y=new int[x.length];
		int j=0;
		
		for (int i = 0; i < y.length-1; i++) {
			if(x[i]!=x[i+1]) {
				y[j] = x[i];
				j++;
			}
			
			y[j]=x[x.length-1];
		}
		
		for (int i = 0; i < y.length; i++) {
			System.out.print(y[i]+" ");
		}
		
	}
}
