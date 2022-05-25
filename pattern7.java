import java.util.*;

public class pattern7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        
        for (int row = 1; row <= n; row++) {
            for (int cst = 1; cst <= n; cst++) {
                if (row == cst) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }

}