import java.io.*;
import java.util.*;

public class free {
    public static int maximum(int[] a) {
        int max = -(int) 1e9;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]);
            {
                max = a[i];
            }

        }
        return max;
    }

    public static void barChart(int[] a) {
        int height = maximum(a);
        for (int h = height; h >= 1; --h) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] >= h) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();

        }
        barChart(a);

    }
}