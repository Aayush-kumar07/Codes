import java.util.*;

public class AnyBSub {

    public static int Conversion(int m, int n, int b) {
        int ans = 0;
        int pow = 1;
        int borrow = 0;
        while (m > 0) {
            int sub = borrow + m % 10 - n % 10;
            m /= 10;
            n /= 10;
            if (sub < 0) {
                borrow = -1;
                sub += b;
            } else {
                borrow = 0;
            }
            ans += sub * pow;
            pow *= 10;
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int b = scn.nextInt();
        int value = Conversion(m, n, b);
        System.out.println(value);
    }
}