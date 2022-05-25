import java.util.*;

public class pattern10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int os = n / 2;
        int is = -1;
        for (int r = 1; r <= n; r++) {
            for (int cos = 1; cos <= os; cos++) {
                System.out.print("\t");
            }
            System.out.print("*\t");
            for (int cis = 1; cis <= is; cis++) {
                System.out.print("\t");
            }
            if (r > 1 && r < n) {
                System.out.println("*\t");
            }
            if (r <= n / 2) {
                os--;
                is += 2;
            } else {
                os++;
                is -= 2;
            }
            System.out.println();
        }
    }

}