import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    Arrays.sort(a);
    String tem="";
    int count=0;
    for(int i=1;i<n;i++){
         if(a[i-1]!=a[i])
         count=0;
         if(a[i-1]==a[i])
         count++;
         if(count==1)
         tem=tem+" "+Integer.toString(a[i]);
    }
    tem=tem.trim();
    System.out.println(tem);
  }
}