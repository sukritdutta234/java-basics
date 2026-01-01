package javabasics;

public class If_Condition {
    public static void main(String[] args) {
        int num1, num2, num3;
        num1 = 100;
        num2 = 400;
        num3 = 3000;
        if (num1 > num2 && num1 > num3) {
            System.out.println("num1 is the largest number");
        }
        else if (num2>num1 && num2>num3) {
            System.out.println("num2 is the largest number");
        }
        else {
            System.out.println("num3 is the largest number");
        }
    }
}
