import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int val=1;
		for(int i=1;i<=x;i++){
			val=val*i;
		}
		System.out.print(val);
  }
}