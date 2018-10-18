import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s.length()%2==0){
			System.out.print("NO");
		}
		else{
     int pos=((s.length()-1)/2)+1;
		 String s1=s.substring(0,pos-1);
		 String s2=s.substring(pos,s.length());
		 if(s1.compareTo(s2)==0)
		 System.out.print("YES");
		 else
		 System.out.print("NO");
		}
  }
}