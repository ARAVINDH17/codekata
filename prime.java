import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	  boolean bol=false;
		for(int i=2;i<n/2;i++){
			if(n%i==0)
			bol=true;
		}
		if(bol){
			System.out.println("no");
		}
		else{
			System.out.println("yes");
		}

    
  }
}