import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String tem="";
		for(int i=s.length()-1;i>=0;i--)
     tem=tem+""+s.charAt(i);
		if(s.compareTo(tem)==0){
			System.out.print(s.substring(0,s.length()-1));
		}
		else{
			System.out.print(s);
		}

	}
}