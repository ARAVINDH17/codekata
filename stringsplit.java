import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	  String s=sc.next();
		int n=sc.nextInt();
		String str="";
		String res="";
	for(int i=0;i<s.length()-n+1;i++){
	  for(int j=i;j<i+n;j++){
			str=str+""+s.charAt(j);
		}
		res=res+" "+str;
		str="";

	   }
		System.out.print(res.trim());
	
	}
}