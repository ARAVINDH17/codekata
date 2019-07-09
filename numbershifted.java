import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		long val=0;
		String str="";
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
          if(a[j]>val){
						val=a[j];
					}
			}
			if(i==n-1){
				a[i]=0;
			}
			else{
			a[i]=val;
			val=0;
			}
				str=str+""+a[i]+" ";
		}
		System.out.print(str.trim());
	
		
	 }
	}

  