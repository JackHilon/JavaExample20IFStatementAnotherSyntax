package javaexample20ifstatementanothersyntax;

import java.util.Scanner;

public class JavaExample20IFStatementAnotherSyntax {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] two = GetTwoIntegers(in);
        int a = two[0];
        int b = two[1];

        System.out.println("Your numbers are: " + a + " and: " + b);

        int max = FindMax(a, b);
        System.out.println("The max(" + a + " , " + b + ") is: " + max);

        int doubleMax = FindDoubleMax(a, b);
        System.out.println("The double max(" + a + " , " + b + ") is: " + doubleMax);
        
        in.close(); 

    }

    private static int FindDoubleMax(int num1, int num2) {
        try {
            int DMax = 2 * ((num1 > num2) ? num1 : num2);
            if (DMax < FindMax(num1, num2)) {
                throw new ArithmeticException("Overflow Exception");
            }
            return DMax;
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
            return 0;
        }
    }

    private static int FindMax(int num1, int num2) {
        int max = (num1 > num2) ? num1 : num2;
        return max;
    }

    private static int[] GetTwoIntegers(Scanner in) {
        System.out.print("Enter two integers: ");
        try {
            int[] res = new int[2];
            res[0] = 0;
            res[1] = 0;
            res[0] = in.nextInt();
            res[1] = in.nextInt();
            return res;
        } catch (Exception e) {
            in.nextLine();
            System.out.println(e.toString());
            return GetTwoIntegers(in);
        }
    }

}
