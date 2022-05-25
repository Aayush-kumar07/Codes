import java.util.*;

public class fibonacci 
{
    public static void main(String[] args) {
    Scanner scn =new Scanner(System.in);
    int n=scn.nextInt();
    int t1 = 0;
    int t2 =1;
    for(int i = 0;i<n;i++)
    {
        System.out.println(t1);
        int next = t1 + t2;
        t1 = t2;
        t2 = next;

    }

}
}