package javabasics;

public class LogicalAndBitwiseOperators {
    public static void main(String[] args){
        /*
        * Logical AND &&
        * Logical OR ||
        * Logical NOT !
        * Bitwise AND &
        * Bitwise OR |
        * Bitwise COMPLIMENT ~
        *
        * */
        boolean a = true ;
        boolean b = false ;
        boolean c = true ;
        boolean d = false;
        System.out.println(a && b);
        System.out.println(a && c);
        System.out.println(a || b);
        System.out.println(!a);
        int num1 = 60;//111100
        int num2 = 42;//101010
        System.out.println(num1 & num2);//101000 => 40
        System.out.println(num1 | num2);//111110 => 62
        System.out.println(~num1); // 000011 => -61


    }

}
