import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int a[]=new int[n*2];
		 int i,j;
		 for( i=0;i<a.length;i++){
			 a[i]=sc.nextInt();
		 }
		 String str="";
		 for(i=0,j=n;i<n;i++,j++){
			 int x=a[i]+a[j];
      str=str+""+x+" ";
		 }
		 System.out.print(str.trim());
	
	}
}