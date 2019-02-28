import java.util.*;
public class matrixOneShift {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			a[i][j]=sc.nextInt();
		}
		}
		int pre=0,cur=0;
	for(int i=0;i<n/2;i++) {
		pre=a[i+1][i];
		// top row 
		for(int j=i;j<n-i;j++) {
			cur=a[i][j];
			a[i][j]=pre;
			pre=cur;
		}
		//right col
		for(int j=i+1;j<n-i;j++) {
			cur=a[j][n-1-i];
			a[j][n-1-i]=pre;
			pre=cur;
		}
		//bottom row
	
		for(int j=n-2-i;j>=i;j--) {
			cur=a[n-1-i][j];
			a[n-1-i][j]=pre;
			pre=cur;
		}
		//left col
		for(int j=n-2-i;j>=i;j--) {
			cur=a[j][i];
			a[j][i]=pre;
			pre=cur;
		}
		}
		
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}

	}

}
