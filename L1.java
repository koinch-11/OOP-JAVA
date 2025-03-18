import java.util.Scanner;
class L1
 {
  public static void main(String[] args) {

    int a,b,c;   

    System.out.println("Enter two numbers ");
    Scanner r=new Scanner(System.in);

    a=r.nextInt();
    b=r.nextInt();
    System.out.println(a+"  "+b);

    c=a;
    a=b;
    b=c;
    System.out.println(a+"  "+b);
    }
}