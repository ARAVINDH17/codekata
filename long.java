import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    long x=sc.nextLong();
    long y=sc.nextLong();
    x=x^y;
    y=x^y;
    x=x^y;
    System.out.println(x+" "+y);
    
  }
}