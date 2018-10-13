import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String tem="";
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    Arrays.sort(a);
    int count=0;
    for(int i=1;i<n;i++){
      if(a[i-1]==a[i])
      count++;
        else
        count=0;
        if(count==1)
        tem=tem+" "+Integer.toString(a[i]);
    }
    System.out.print(tem);
  }
}