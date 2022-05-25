import java.util.*;

public class DecimalAdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int value = Conversion(n, m);
        System.out.println(value);
    }

    public static int Conversion(int n, int m) {
        int ans = 0;
        int pow = 1;
        int carry = 0;
        while (n != 0 || m != 0 || carry != 0) {
            int sum = carry + n % 10 + m % 10;
            n /= 10;
            m /= 10;
            carry = sum / 10;
            sum %= 10;
            ans += sum * pow;
            pow *= 10;
        }
        return ans;
    }
}