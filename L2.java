import java.util.Scanner;
class L2
 {
  public static void main(String[] args) {

    int a,b;   

    System.out.println("Enter two numbers ");
    Scanner r=new Scanner(System.in);

    a=r.nextInt();
    b=r.nextInt();
    System.out.println(a+"  "+b);
 
    a=a+b;
    b=a-b;
    a=a-b;
 
    System.out.println(a+"  "+b);
    }
}