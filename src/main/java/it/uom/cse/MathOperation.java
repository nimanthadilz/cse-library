package it.uom.cse;

import java.util.Arrays;


public class MathOperation {

    public static double add(double... operands)
    {
        return Arrays.stream(operands).reduce(0d, Double::sum);
    }

    public static double subtract(double operand1, double operand2)
    {
        return operand1 - operand2;
    }

    public static int sumOfPrimes(int n) {

        int sum = 0;

        for (int num = 2; num <= n; num++) {

            int i;

            for (i = 2; i <= (num / 2); i++) {

                if (num % i == 0) {
                    i = num;
                    break;
                }
            }

            if (i != num) {
                sum += num;
            }

        }

        return sum;
    }


    public static int sumOfIntegers(int n) {
        return (n * (n+1))/2;
    }
}
