import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int a[][]=new int[n][n];
	 int res=0;
	 for(int i=0;i<n;i++){
		 for(int j=0;j<n;j++){
			 a[i][j]=sc.nextInt();
		 }
	 }
	 for(int i=0;i<n;i++){
		 for(int j=0;j<n;j++){
			 if(a[i][j]==1){
				 int count=0;
				 try{
					 if(a[i-1][j]==0)
					 count++;
				 }
				 catch(ArrayIndexOutOfBoundsException e){
				 count++;}
				 try{
					 if(a[i+1][j]==0)
					 count++;
				 }
				 catch(ArrayIndexOutOfBoundsException e){
				 count++;}
				 try{
					 if(a[i][j+1]==0)
					 count++;
				 }
				 catch(ArrayIndexOutOfBoundsException e){
				 count++;}
				 try{
					 if(a[i][j-1]==0)
					 count++;
				 }
				 catch(ArrayIndexOutOfBoundsException e){
				 count++;}
				 try{
					 if(a[i+1][j+1]==0)
					 count++;
				 }
				 catch(ArrayIndexOutOfBoundsException e){
					 count++;
				 }
				 try{
					 if(a[i+1][j-1]==0)
					 count++;
				 }
				 catch(ArrayIndexOutOfBoundsException e){
					 count++;
				 }
				 try{
					 if(a[i-1][j+1]==0)
					 count++;
				 }
				 catch(ArrayIndexOutOfBoundsException e){
					 count++;
				 }
				 try{
					 if(a[i-1][j-1]==0)
					 count++;
				 }
				 catch(ArrayIndexOutOfBoundsException e){
					 count++;
				 }
				 if(count==8)
				 res++;

			 }

		 }
	 }
	 System.out.print(res);
	
  }
}