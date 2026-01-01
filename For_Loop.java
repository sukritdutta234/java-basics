package javabasics;

public class For_Loop {
    public static void main(String[] args) {

        for (int i=2; i <=100; i+=2){
            System.out.println(i);
        }
        for(int j=10 ; j>0; j--){
            System.out.println(j);
        }
        //all even numbers between 1 to 100
        for (int i = 1; i <=100 ; i++) {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }


    }
}
