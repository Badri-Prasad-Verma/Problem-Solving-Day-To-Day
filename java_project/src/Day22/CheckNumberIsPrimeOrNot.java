package Day22;

import java.util.Scanner;

public class CheckNumberIsPrimeOrNot {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = scan.nextInt();

        if (isPrimeNumber(num)) {
            System.out.println("Number is a Prime Number");
        } else {
            System.out.println("Number is not a Prime Number");
        }

        scan.close();
    }

    private static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}
