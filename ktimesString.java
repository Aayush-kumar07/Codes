import java.util.*;

public class ktimesString {
    public static String reverse(String str, int i, int j) {
        int n = str.length();
        //  char[] c = str.toCharArray();
        ch fi= str.charAt(i);
        while(i<=j) {
            // swap values at `l` and `h`
            char temp = str.charAt(i);
            str.charAt(i) =  str.charAt(j);
            str.charAt(j) = temp;
        }

        // convert character array to string and return
        return String.copyValueOf(str);

    }

    public static String rotate(String str, int m) {
        int n = str.length();
        m = m % n;
        if (m < 0)
            m += n;
        reverse(str, 0, n - m - 1);
        return str;
    }

    public static void display(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int m = scn.nextInt();
        String s = rotate(str, m);
        display(s);

    }
}