import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String tem="";
    int a[]=new int[n];
    for(int i=0;i<n;i++){
      int x=sc.nextInt();
      if((i%2==0)&&(x%2!=0))
      tem=tem+" "+Integer.toString(x);
      if((i%2!=0)&&(x%2==0))
      tem=tem+" "+Integer.toString(x);
    }
    tem=tem.trim();
    System.out.print(tem);
     
  }
}