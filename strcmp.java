import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
	  int i,j;
		int n=s.length();
		try{
		for(i=1,j=0;(i<n||j<n);i+=2,j+=2){
			System.out.print(s.charAt(i)+""+s.charAt(j));
		}
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.print(s.charAt(n-1));
		}
		
	}
}