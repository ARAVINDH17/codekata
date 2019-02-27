package zoho;
import java.util.*;
public class sort_element_usingFac {


    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     //Get input from user
     for(int i=0;i<n;i++){
         a[i]=sc.nextInt();
     }
     for(int i=0;i<n;i++){
         for(int j=i+1;j<n;j++){
             if(a[i]>a[j]){
                 int temp=a[i];
                 a[i]=a[j];
                 a[j]=temp;
             }
         }
     }
    int subarr=1;
    //Find size of subarray
    for(int i=1;i<n;i++){
        if(a[i-1]!=a[i])
            subarr++;
    }
   
   int b[][]=new int[subarr][2];//"b" is sub array;
   int count=0,k=0;
   /* calculate frequency of each unique value
    * insert into sub array
    */
   for(int i=0;i<n;i++) {
	   count++;
	  if(i==n-1||a[i]!=a[i+1]) {
		  b[k][0]=a[i];
		  b[k][1]=count;
		  k++;
		  count=0;
	  }
   }
   //sort each element based on the frequency
   for(int i=0;i<subarr;i++) {
	   for(int j=i+1;j<subarr;j++) {
		   if(b[i][1]<b[j][1]) {
			   int tem=b[i][1];
			   b[i][1]=b[j][1];
			   b[j][1]=tem;
			   int tem1=b[i][0];
			   b[i][0]=b[j][0];
			   b[j][0]=tem1;
		   }
	   }
   }
   
  
    for(int i=0;i<subarr;i++) {
    	for(int j=0;j<b[i][1];j++) {
    		System.out.print(b[i][0]+" ");
    	}
    
    }
    
    } 

}
