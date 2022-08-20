import java.util.*;

public class repeatingindexprint
{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int idx = n;
        int curr = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    if (j < idx) {
                        idx = j;
                        curr = i;
                    }
                }
            }
        }
        System.out.println(curr);

    }
}