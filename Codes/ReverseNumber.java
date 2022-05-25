import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = n;
        int count = 0;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        while (count > 0) {
            int rem = n % 10;
            System.out.println(rem);
            n /= 10;
            count--;

        }
    }
}