import java.util.*;

public class AnyBToAnyB {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        int decimal = AnyBToD(n, b1);
        int value = DeciToAnyB(decimal, b2);
        System.out.println(value);
    }

    public static int AnyBToD(int n, int b1) {
        int ans = 0;
        int pow = 1;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            ans += rem * pow;
            pow *= b1;

        }
        return ans;
    }

    public static int DeciToAnyB(int decimal, int b2) {
        int ans = 0;
        int pow = 1;
        while (decimal > 0) {
            int rem = decimal % b2;
            decimal /= b2;
            ans += rem * pow;
            pow *= 10;
        }
        return ans;
    }
}