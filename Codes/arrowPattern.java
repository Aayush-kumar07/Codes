import java.util.*;

public class arrowPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = n / 2;
        int nst = 1;
        for (int r = 1; r <= n; r++) 
        {
            for (int csp = 1; csp <= nsp; csp++) 
            {
                if (r == (n / 2) + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
                for (int cst = 1; cst <= nst; cst++)
                {
                    System.out.print("*\t");
                }
                if (r <= n / 2)
                 {
                    nst++;
                } else 
                {
                    nst--;
                }
            
            System.out.println();
            
        }
    }

}