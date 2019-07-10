import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
		sc.nextLine();
		String a[]=new String[n];
		for(int i=0;i<n;i++){
			a[i]=sc.next().toLowerCase();
		}
			
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i].charAt(0)==a[j].charAt(0)){
					if(a[i].length()>a[j].length()){
						String tem=a[i];
						a[i]=a[j];
						a[j]=tem;
					}		
				}
				else if(a[i].charAt(0)>a[j].charAt(0)){
					String tem=a[i];
					a[i]=a[j];
					a[j]=tem;
				}
			}
			
		}
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
	
	}
}