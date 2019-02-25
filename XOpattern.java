import java.util.*;
public class XO_pattern {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			char arr[][]=new char[n][n];
			int temp=n;
			char c='*';
			for(int i=0;i<n/2;i++) {
			 c=(i%2==0)?'X':'O';
			    assign(c,temp,i,arr);
			    temp=temp-2;
			}
			if(n%2!=0) {
				char matrix_mid_value=(c=='X')?'O':'X';
				arr[n/2][n/2]= matrix_mid_value;
			}
			printMatrix(arr);
			sc.close();
	}
	public static void assign(char x,int temp,int i,char arr[][]) {
		int a=0;
		for(a=i;a<temp+i;a++){
			arr[i][a]=x;}
		
		for(int b=i;b<temp+i;b++){
			arr[b][a-1]=x;
			arr[b][i]=x;
			arr[a-1][b]=x;
		}
		
	}
	public static void printMatrix(char arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}