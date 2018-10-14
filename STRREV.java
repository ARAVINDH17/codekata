import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String a[]=s.split("[ ]");
    String tem="";
    for(int i=0;i<a.length;i++){
      for(int j=a[i].length()-1;j>=0;j--)
      tem=tem+a[i].charAt(j);
      tem=tem+" ";
    }
    System.out.print(tem.trim()); 
  }
}