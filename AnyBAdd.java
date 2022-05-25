import java.util.*;

public class AnyBAdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int b = scn.nextInt();
        int value = Conversion(n, m, b);
        System.out.println(value);
    }

    public static int Conversion(int n, int m, int b) {
        int ans = 0;
        int pow = 1;
        int carry = 0;
        while (n != 0 || m != 0 || carry != 0) {
            int sum = carry + n % 10 + m % 10;
            n /= 10;
            m /= 10;
            carry = sum / b;
            sum %= b;
            ans += sum * pow;
            pow *= 10;
        }
        return ans;
    }
}