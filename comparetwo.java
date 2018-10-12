import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   int x=sc.nextInt();
	 int y=sc.nextInt();
	 int min=x<y?x:y;
	 int k=0;
	 for(int i=1;i<=min;i++){
		 if((x%i==0)&&(y%i==0))
		 k=i;
	 }
	 System.out.println(k);
	}
}