import java.util.*;

public class Rotate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int temp = n;
        int nod = 0;
        while (temp > 0) {
            temp = temp / 10;
            nod++;
        }
        k = (k % nod + nod) % nod;
        int a = n / (int) Math.pow(10, k);
        int b = n % (int) Math.pow(10, k);
        int ans = (b * (int) Math.pow(10, nod - k) + a);
        System.out.println(ans);

    }
}