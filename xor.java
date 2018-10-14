import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int x=sc.nextInt();
    for(int i=1;i<n;i++)
    x=x^sc.nextInt();
    System.out.print(x);
  }
}