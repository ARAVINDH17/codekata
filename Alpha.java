import java.util.*;
class Alpha {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		if((c>=97&&c<=122)||(c>=65&&c<=90)){
       System.out.println("Alphabet");
		}
		else{
			System.out.println("No");
		}
  }
}