import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=sc.nextInt();
		int sum=1;
		for(int i=0;i<p;i++)
		sum=sum*n;
		System.out.println(sum);
    
  }
}