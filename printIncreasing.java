import java.util.*;

public class printIncreasing {
    public static void printIncreasing(int n,int i)
    { 
        if(i>n)
        {
            return;
        }
        System.out.println(i);
        printIncreasing(n,++i);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 1;

        printIncreasing(n, i);
    }
}