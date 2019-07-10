import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int val=1;
		String str="";
		for(int i=0;i<n;i++){
			for(int j=0;j<val;j++){
				str=str+""+"1 ";
			}
			System.out.print(str.trim());
			System.out.println();
			str="";
			val=val+2;
		}
	
	}
}