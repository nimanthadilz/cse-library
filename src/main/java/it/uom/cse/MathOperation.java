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

    public static int sumOfPrimes(int n){
        int sum = 0;
        int i = 2;
        while(n > 0){
            if(isPrime(i)){
                sum += i;
                n -= 1;
            }
            i++;
        }
        return sum;
    }

    private static boolean isPrime(int n){
        if(n == 1){
            return false;
        }else if(n == 2){
            return true;
        }else if(n%2 == 0){
            return false;
        }else{
            for(int j = 2; j < n; j++){
                if(n%j == 0){
                    return false;
                }
            }
            return true;
        }
    }

    public static int fib(int n){
        if (n==0){
            return 0;}
        if (n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

}
