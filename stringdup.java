import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 long a[]=new long[n];
	 for(int i=0;i<n;i++){
		 a[i]=sc.nextLong();
	 }
	 long val=0;
	 int len=0;
	 boolean bol=true;
	 for(int i=0;i<n;i++){
		 for(int j=i+1;j<n;j++){
			 if(a[i]==a[j]){
         if(bol){
					 len=j-i;
					 val=a[i];
					
					 bol=false;
				 }
				 else if((j-i)<len){
					 val=a[i];
					 len=j-i;
				 }
			 }
		 }
	 }
	 if(val!=0)
	 System.out.println(val);
	 else
	 System.out.println("unique");
	 }
	}

  