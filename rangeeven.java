import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		long x=sc.nextLong();
		long y=sc.nextLong();
		for(long i=x+1;i<y;i++){
			if(i%2==0)
			System.out.print(i+" ");
		}
    
  }
}