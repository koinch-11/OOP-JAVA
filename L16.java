import java.util.Scanner;
class L16
 {
  public static void main(String[] args) {  
     
    int n,rev=0,c,r;

    System.out.println("Enter number for palindrome or not:");
    Scanner scan=new Scanner(System.in);
       n=scan.nextInt();
       c=n;
     
     while(n > 0)
       {
       r=n%10;
       rev=rev*10+r;
       n=n/10;
      }


if(c==rev)
       {
        System.out.println("It is palindrome");
       }
   else
       {
        System.out.println("It is not palindrome");
       }
   }
}