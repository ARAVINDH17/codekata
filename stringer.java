import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
		int k=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++){
      a[i]=sc.nextLong();
		}
		String str="";
		for(int i=0;i<n;i++){
			if(a[i]!=k){
				str=str+""+a[i]+" ";
			}
		}
		System.out.println(str.trim());	
		if(str.length()<=0){
			System.out.println("empty");
		}	
	}

  }
