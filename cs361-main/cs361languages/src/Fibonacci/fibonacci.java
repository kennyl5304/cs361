package Fibonacci;

public class fibonacci {
    
    public static int fibonacciInt(int num){
        if(num <= 2){
            return 1;
        }
        else{
            return fibonacciInt(num-1) + fibonacciInt(num-2);
        }
    }

    public static void main(String[] args){
        System.out.println(fibonacciInt(2));
        System.out.println(fibonacciInt(10));
    }
}
