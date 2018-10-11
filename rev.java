import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	  int rev=0,temp=n;
		while(n!=0){
			rev=rev*10+n%10;
			n=n/10;
		}
		if(temp==rev){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
    
  }
}