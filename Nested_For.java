package javabasics;

public class Nested_For {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                System.out.println(i+","+j);
            }
            System.out.println("All the iteration of j are done here.");
        }
    }
}
