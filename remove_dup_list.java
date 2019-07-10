import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
		int val=sc.nextInt();
		for(int i=0;i<n-1;i++){
			val=val ^ sc.nextInt();
		}
	System.out.print(val);
	}
}