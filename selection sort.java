import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++){
			a[i]=sc.nextInt();
		}
		int max,index=0;
		for(int i=0;i<size;i++){
       max=a[0];
			for(int j=0;j<size-i;j++){
				if(a[j]>=max){
				max=a[j];index=j;
				}
			}
			int tem=a[size-i-1];
			a[size-i-1]=a[index];
      a[index]=tem;
		}
		for(int i=0;i<size;i++)
		System.out.print(a[i]+" ");
  }
}