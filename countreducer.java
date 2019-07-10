import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	long n=sc.nextInt();
	long a=sc.nextInt();
	long b=sc.nextInt();
	 boolean bol=check(n,a,b);
	 if(bol){
		 System.out.print("YES");
	 }
	 else{
		 System.out.println("NO");
	 }
  }
	public static boolean check(long n,long a,long b){
	  long tem=n;
		int k=0,p=0,q=0;
		long sum1=0,sum2=0;
		while(tem>0){
			if(k%2==0){
         if(p%2==0){
					 sum1=sum1+a;
				 }
				 else{
					 sum1=sum1+b;
				 }
        p++;
			}
			else{
				 if(q%2==0){
					 sum2=sum2+a;
				 }
				 else{
					 sum2=sum2+b;
				 }
        q++;

			}
			long x=sum1+sum2;
			if(sum1==sum2&&x==n){
				return true;
			}
			else{
				if(x>n){
					return false;
				}
			}
			k++;
		}
	
		return false;
	}
}
