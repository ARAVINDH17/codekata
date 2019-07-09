import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int k=sc.nextInt();
		int n=str.length()-k;
		long small=0;
		String s="";
		boolean bol=true;
		if(k==0){
			System.out.println(str.trim());
		}
		else{
			for(int i=0;i<str.length()-n+1;i++){
				for(int j=i;j<i+n;j++){
					s=s+""+str.charAt(j);
				}
				long x=Long.parseLong(s);
				s="";
				if(bol){
					small=x;
					bol=false;
				}
				else{
					if(x<small){
						small=x;
					}

				}
		}

			
		}
		System.out.print(small);
	}
  }