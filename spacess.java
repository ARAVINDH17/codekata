import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
    String tem="";
		int count=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '){
			count++;
			if(count==1){
				tem+=" ";
			}
			}
			else{
				count=0;
				tem=tem+s.charAt(i);
			}
		}
		tem=tem.trim();
		System.out.print(tem);
  }
}