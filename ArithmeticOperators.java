package javabasics;

import java.sql.SQLOutput;

public class ArithmeticOperators {
    public static void main(String[] args){
        /*
        * + Add
        * - Sub
        * * Mul
        * / Div
        * % Mod
        * ++ increment
        * -- decrement
        * */
        int num1 = 102;
        int num2 = 200;
        int num3 = 10;
        int sum = num1 + num2 + num3;
        System.out.println(sum);
        int mod = num1%num3;
        System.out.println(mod);
        num1++; // num1 = num1 + 1
        num2--; // num2-=1
        num3-=10;//num3 = num3 - 10
        num3/=3; // num3 = num3/3

    }
}
