import java.util.Scanner;
class L6
 {
  public static void main(String[] args) {  

     int r;
     double pi=3.14;
     double a;

    System.out.println("Enter radius of circle");
    Scanner scan=new Scanner(System.in);
       r=scan.nextInt();
       a=r*r*3.14;
      System.out.println("Area of circle is :" +a);
    }
}