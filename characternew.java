import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
		String a[]=s.split("[ ]");
	  for(int i=0;i<a.length;i++){
	System.out.print(Character.toUpperCase(a[i].charAt(0))+""+a[i].substring(1,a[i].length()).toLowerCase()+" ");
		}
	}
}