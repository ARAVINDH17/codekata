import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String tem="";
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int i=n-1;i>=0;i--){
			tem=tem+""+Integer.toString(a[i]);
			if(i!=0)
			tem=tem+"->";
		}
		System.out.print(tem.trim());
  }
}