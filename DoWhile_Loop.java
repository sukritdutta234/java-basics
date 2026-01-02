package javabasics;

public class DoWhile_Loop {
    public static void main(String[] args) {
        int a = 100;
        do{
            a-=5;
            System.out.println(a);
        }while(a>500);
        // the only difference between while and do_while is
        // that do_while will iterate only one time even if the condtions are not true
    }
}
