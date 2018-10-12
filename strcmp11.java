import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s1=sc.next();
	  String s2=sc.next();
		if(s1.length()==s2.length()){
			int count=0;
			for(int i=0;i<s1.length();i++){
				if(s1.charAt(i)!=s2.charAt(i))
				count++;
			}
			if(count==1)
			System.out.println("yes");
			else
			System.out.println("no");
		}
	}
}