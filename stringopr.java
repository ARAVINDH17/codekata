import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	  String x=sc.next();
		String y=sc.next();
		int count=0;
		for(int i=0;i<x.length();i++){
			try{
			if(x.charAt(i)==y.charAt(i)){
			}
			else{
				count++;
			}
			}
			catch(Exception e){
				count++;
			}
		}
		if(y.length()>x.length()){
		count=count+(y.length()-x.length());
		}
		System.out.println(count);
	}
}
