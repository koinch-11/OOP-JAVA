import java.util.Scanner;
class L20
 {
  public static void main(String[] args) {  
     
    int n,rev;

    System.out.println("Enter number for palindrome or not:");
    Scanner scan=new Scanner(System.in);
       n=scan.nextInt();
    System.out.print("Reverse Order:");
     while(n > 0)
       {
       rev=n%10;
       n=n/10;
       System.out.print(+rev);

       }
   }
}