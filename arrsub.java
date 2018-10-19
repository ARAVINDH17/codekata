import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int a[]=new int[x];
		int b[]=new int[y];
		int c=1;
		for(int i=0;i<x;i++)
		a[i]=sc.nextInt();
		for(int i=0;i<y;i++)
		b[i]=sc.nextInt();
		aravindh:
		for(int i=0;i<y;i++){
			boolean bol=false;
			for(int j=0;j<x;j++){
				if(b[i]==a[j])
				bol=true;
			}
		   if(bol==false){
         c=0;
					break aravindh;
			}
		}
		if(c==0)
		System.out.print("NO");
		else
		System.out.print("YES");	
  }
}