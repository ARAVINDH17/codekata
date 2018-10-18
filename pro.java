import java.util.*;

import javax.lang.model.util.ElementScanner6;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String tem="";
		String s1=sc.next();
		for(int j=0;j<n-1;j++){
			String s2=sc.next();
			int len=0;
			if(s1.length()==s2.length())
			len=s1.length();
			else if(s1.length()<s2.length())
			len=s1.length();
			else
			len=s2.length();
			tem="";
			Aravindh:
			for(int i=0;i<len;i++){
        if(s1.charAt(i)==s2.charAt(i))
				tem=tem+""+s1.charAt(i);
				else
				break Aravindh;
			}
			s1=tem;
		}
		System.out.print(s1);
  }
}