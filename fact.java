import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int x=1,y=1;
    System.out.print("1"+" "+"1 ");
    for(int i=2;i<n;i++){
      int c=x+y;
      System.out.print(c+" ");
      x=y;
      y=c;
    }
  }
}