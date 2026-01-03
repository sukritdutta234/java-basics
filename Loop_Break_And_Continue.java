package javabasics;

public class Loop_Break_And_Continue {
    public static void main(String[] args) {
        int a = 50;
        int b = 50;
        while(a<100){
            a+=5;
            if(a==75){
                break;
            }
            System.out.println(a);
        }
        while(b<100){
            b+=5;
            if(b==75){
                continue;
            }
            System.out.println(b);
        }

    }
}
