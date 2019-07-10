import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
		int a[]=new int[n];
		boolean bol=true;
		String str="";
		int min=0;
 for(int i=0;i<n;i++){
	 a[i]=sc.nextInt();
	 if(bol){
   min=a[i];
	 bol=false;
	 }
	 else{
		 if(a[i]<min){
			 min=a[i];
		 }
	 }
	 str=str+""+min+" ";
 }
 System.out.print(str.trim());
	
	}
}