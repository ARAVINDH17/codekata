import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	  long n=sc.nextInt();
    long tem=n;
		long sum=1;
		long res=0;
		while(tem>0){
			long val=tem%10;
			tem=tem/10;
			for(int i=0;i<2;i++){
			 sum=sum*val;
			}
			res=res+sum;
			sum=1;
		}
		System.out.println(res);
	}
}