import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int k=sc.nextInt();
   int a[]=new int[n];
   boolean bol=false;
   for(int i=0;i<n;i++)
   a[i]=sc.nextInt();
   for(int i=0;i<n;i++){
     for(int j=0;j<n;j++){
       if((i!=j)&&(a[i]+a[j]==k))
       bol=true;
     }
   }
   if(bol)
   System.out.print("YES");
   else
   System.out.print("NO");
  }
}