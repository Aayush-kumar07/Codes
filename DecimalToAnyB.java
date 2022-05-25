import java.util.*;

public class DecimalToAnyB {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int value = Conversion(n, b);
        System.out.println(value);
    }

    public static int Conversion(int n, int b) {
        int ans = 0;
        int pow = 1;
        while (n > 0) {
            int rem = n % b;
            n /= b;
            ans += rem * pow;
            pow *= 10;
        }

        return ans;
    }
}