import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	  String str=sc.nextLine();
	  int size=1;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				size++;
			}
		}
		String  a[]=new String[size];
		String s="";
		int n=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=' '){
			s=s+str.charAt(i);
			}
			 if(str.charAt(i)==' '||i==str.length()-1){
				  a[n++]=s;
       s="";
			}
			  
		}
		for(int i=0;i<a.length;i++){
	      if(i%2==0){
					a[i]=reverse(a[i]);
				}
		}
		s="";
		for(int i=0;i<a.length;i++){
			s=s+""+a[i]+" ";
		}
		System.out.print(s.trim());
	
	}
	public static String reverse(String rev){
     String str="";
		 for(int i=rev.length()-1;i>=0;i--){
			 str=str+""+rev.charAt(i);
		 }
		 return str;


	}
}