import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int max=0;
		for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
		if(i==0)
		max=a[i];
		else{
		if(max<a[i])
		max=a[i];
		}
		}
		System.out.print(max);
		 

  }
}