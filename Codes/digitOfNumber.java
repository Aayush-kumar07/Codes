import java.util.*;

public class digitOfNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 0;
        int temp = n;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        int div = (int) Math.pow(10, count- 1);
        while (div > 0) {
           
            int rem = n / div;
            System.out.println(rem);
            n = n % div;
          div/=10;

        }

    }

}