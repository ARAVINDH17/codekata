import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    String tem="";
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    for(int i=0;i<n;i++){
      if(i==a[i])
      tem=tem+" "+Integer.toString(a[i]);
    }
    tem=tem.trim();
    System.out.print(tem);
}
}