import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	  String s1=sc.next();
		String s2=sc.next();
		int count=0;
		Aravindh:
		for(int i=0;i<s1.length();i++){
			if(s2.charAt(0)==s1.charAt(i)){
				String tem=s1.substring(i,i+s2.length());
				if(tem.compareTo(s2)==0){
				System.out.print(i);
				count=1;
				break Aravindh;
				}
			}
		}
		if(count==0)
		System.out.print("-1");
  }
}