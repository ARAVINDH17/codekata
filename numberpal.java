import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	  long n=sc.nextLong();
		long tem=n;
		long total=0;
		while(tem!=0){
			total=total+tem%10;
			tem=tem/10;
		}
   tem=total;
	 long rev=0;
	 while(tem!=0){
		 rev=rev*10+tem%10;
		 tem=tem/10;
	 }
	 if(total==rev){
		 System.out.print("YES");
	 }
	 else{
		 System.out.print("NO");
	 }
	 }
	}

  