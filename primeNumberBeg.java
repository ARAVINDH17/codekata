import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		String s="";
		for(int i=x+1;i<y;i++){
			boolean bol=true;
			  for(int j=2;j<=i/2;j++){
					if(i%j==0)
           bol=false;
				}
				if(bol){
					s=s+" "+i;
				}
		}
		s=s.trim();
		System.out.print(s);
  }
}
