package simulation;

public class Practice_1 {
    public static void main(String[] args) {
        int n = 199;
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n-row+1 ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
