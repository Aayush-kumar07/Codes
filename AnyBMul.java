import java.util.*;

public class AnyBMul {
    public static int AnyBAdd(int n, int m, int b) {
        int ans = 0, pow = 1, carry = 0;
        while (n > 0 || m > 0 || carry > 0) {
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

    public static int MultDigWithNum(int n, int m, int b) {
        int ans = 0, pow = 1, carry = 0;
        while (n > 0 || carry > 0) {
            int prod = carry + (n % 10) * m;
            carry = prod / b;
            prod %= b;
            n /= 10;
            ans += prod * pow;
            pow *= 10;
        }
        return ans;
    }

    public static int getProduct(int n, int m, int b) {
        int ans = 0, pow = 1;
        while (m > 0) {
            int digitMul = MultDigWithNum(n, m % 10, b);
            m /= 10;
            ans = AnyBAdd(ans, digitMul * pow, b);
            pow *= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n = scn.nextInt();
        int m = scn.nextInt();
        int value = getProduct(n, m, b);
        System.out.println(value);
    }
}