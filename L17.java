import java.util.Scanner;
class L17
 {
  public static void main(String[] args) {  
     
    int n,arm=0,c,r;

    System.out.println("Enter number for armstrong or not:");
    Scanner scan=new Scanner(System.in);
       n=scan.nextInt();
       c=n;
     
     while(n > 0)
       {
       r=n%10;
       arm=r*r*r+arm;
       n=n/10;
      }


if(c==arm)
       {
        System.out.println("It is Armstrong number");
       }
   else
       {
        System.out.println("It is not Armstrong number");
       }
   }
}