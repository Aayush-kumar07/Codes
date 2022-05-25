import java.util.*;

public class frequency_no {
    public static int frequency(int n, int d) {
        int count = 0;
        while(n>0)
        {
        if (n % 10 == d) {
            count++;
           
        }
        n/=10;
    }
        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
       int ans= frequency(n, d);
        System.out.println(ans);
    }

}