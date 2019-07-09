import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  String a[]=new String[n];
		for(int i=0;i<n;i++){
       a[i]=sc.next();
		}
		String str=sc.next();
		int count=0;
		int len=str.length();
		for(int i=0;i<n;i++){
			 String s=a[i].substring(0,len);
			 boolean bol=true;
			 for(int j=0;j<len;j++){
				 if(str.charAt(j)==s.charAt(j)){
				 }
				 else{
					 bol=false;
				 }
			 }
			 if(bol)
			 count++;
		}
		System.out.print(count);
	 }
	}

  