import java.util.*;

public class SpiralRev {
  public static Scanner scn=new Scanner(System.in);
public static void input(int [][]a)
{
    for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<a[0].length;j++)
        {
            a[i][j]=scn.nextInt();
        }                                                           // ----->
     }                                                              // <------|
}
  public static void main(String[] args) {
  int n=scn.nextInt();
  int m=scn.nextInt();
  int [][]a=new int [n][m];
  input(a);

  int minr=0;
  int maxr=n-1;
  int minc=0;
  int maxc=m-1;
int count=n*m;
while(count!=0)
{
  for(int i=minc;i<=maxc && count!=0;i++)
  {
    System.out.println(a[minr][i]);
    count--;
  }
  minr++;
  for(int i=minr;i<=maxr && count!=0;i++)
  {
    System.out.println(a[i][maxc]);
    count--;
  }
  maxc--;
  for(int i=maxc;i>=minc && count!=0;i--)
  {
    System.out.println(a[maxr][i]);
    count--;
  }
  maxr--;

  for(int i=maxr;i>=minr && count!=0;i--)
  {
    System.out.println(a[i][minc]);
    count--;
  }
  minc++;

}


  }
}