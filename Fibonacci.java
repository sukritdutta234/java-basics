package javabasics;

public class Fibonacci {
    public static void main(String[] args) {
        // to print first 20 numbers of fibonacci series
        int num1 = 0,num2 = 1, num3;
        System.out.println(num1);
        System.out.println(num2);
        for (int i = 1; i <=18 ; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.println(num3);
        }
    }
}
