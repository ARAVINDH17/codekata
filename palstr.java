import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	  String s=sc.next(),tem="";
		for(int i=s.length()-1;i>=0;i--)
		tem=tem+s.charAt(i);
		if(tem.compareTo(s)==0)
		System.out.print("YES");
		else
		System.out.print("NO");
	
  }
}