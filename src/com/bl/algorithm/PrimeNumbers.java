package com.bl.algorithm;

import java.util.Scanner;
/**
 * Purpose  - To find prime numbers in a range
 * @author  - JaswinderSingh
 * @version - 16.0
 * @since   - 30-09-2021
 */

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int upperbounds, lowerbounds;
        //Taking limit from the user
        //Ask user to enter lower value of interval
        System.out.print("Enter the lower bound : ");
        lowerbounds = sc.nextInt();
        //Ask user to enter upper value of interval
        System.out.print("Enter the upper bound : ");
        upperbounds = sc.nextInt();
        System.out.println("Prime numbers between " + lowerbounds + " and " + "upper  " + upperbounds + "is : ");
        primeNO(lowerbounds, upperbounds);
        sc.close();
    }
  
    private static void primeNO(int lowerbounds, int upperbounds) {
        int a, flag, j;
        for (a = lowerbounds; a <= upperbounds; a++) {

            // Explicitly handling the cases when a is less than 2
            if (a == 1 || a == 0)
                continue;
            flag = 1;
            // WE TRAVERSE TILL SQUARE ROOT OF j only.
            // (LARGEST POSSIBLE VALUE OF A PRIME FACTOR)	
            for (j = 2; j <= a / 2; ++j) {
                if (a % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(a);
        }
    }
}