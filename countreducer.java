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
  int k=0;
	long tem=n;
	while(tem>0){
		if(k%2==0){
			tem=tem-a;
		}
		else{
			tem=tem-b;
			if(tem==0)
			return true;
		}

k++;
	}
		return false;
	}
}