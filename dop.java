import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String tem=""+s.charAt(0);
		for(int i=1;i<s.length();i++){
			boolean bol=true;
			for(int j=i-1;j>=0;j--){
         if(s.charAt(i)==s.charAt(j))
				 bol=false;
			}
			if(bol)
			tem=tem+s.charAt(i);
		}
		for(int i=tem.length()-1;i>=0;i--)
		System.out.print(tem.charAt(i));
  }
}