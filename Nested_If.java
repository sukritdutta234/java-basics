package javabasics;

public class Nested_If {
    public static void main(String[] args) {
        int marks = 99; // out of 100
        if (marks>=90){
            if (marks>=95){
                System.out.println("Outstanding performance");
            }
            else{
                System.out.println("A Grade");
            }
        } else if (marks>=75) {
            System.out.println("B Grade");
        } else if (marks>=40) {
            System.out.println("C Grade");
        } else {
            System.out.println("Improvement is needed");
        }

    }
}
