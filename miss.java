import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String tem="";
    for(int i=s.length()-1;i>=0;i--)
    tem=tem+""+s.charAt(i);
    if(s.compareTo(tem)==0){
      System.out.print("YES");
    }
    else{
      boolean bol=false;
      for(int i=0;i<s.length();i++){
        tem="";
        for(int j=0;j<s.length();j++){
          if(i!=j)
          tem=tem+""+s.charAt(j);
        }
        String str="";
        for(int k=tem.length()-1;k>=0;k--)
        str=str+""+tem.charAt(k);
        if(str.compareTo(tem)==0)
        bol=true;
      }
      if(bol)
      System.out.print("YES");
      else
      System.out.print("NO");
    }
  }
}