package Day21;

import java.util.Scanner;
//Time Complexity : O(r1*c1)
//Space Complexity : O(r1*c1)
public class AdditionOfTwoMatrics {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter any row and columns of matrics 1");
		int r1 = scan.nextInt();
		int c1 = scan.nextInt();
		int[][] matrix1 =new int[r1][c1];
		System.out.println("Enter the values of matrics 1");
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) {
				matrix1[i][j]= scan.nextInt();
			}
		}
		
		System.out.println("Enter any row and columns of matrics 2");
		int r2 = scan.nextInt();
		int c2 = scan.nextInt();
		int[][] matrix2 =new int[r2][c2];
		System.out.println("Enter the values of matrics 2");
		for (int i = 0; i < r2; i++) {
			for (int j = 0; j < c2; j++) {
				matrix2[i][j]= scan.nextInt();
			}
		}
		
		System.out.println("Matrics 1");
		printMatrix(matrix1);
		System.out.println("Matrics 2");
		printMatrix(matrix2);
		System.out.println("Addition of matrics");
		additionOfTwoMatrics(matrix1,matrix2,r1,r2,c1,c2);
	}

	private static void additionOfTwoMatrics(int[][] matrix1, int[][] matrix2, int r1, int r2, int c1, int c2) {
		if(r1!=r2 || c1!=c2) {
			return;
		}
		
		int[][] additionOfMatrix = new int[r1][c1];
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) {
				additionOfMatrix[i][j] = matrix1[i][j]+matrix2[i][j];
			}
		}
		printMatrix(additionOfMatrix);
	}

	private static void printMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
