import java.util.Scanner;
class L7
 {
  public static void main(String[] args) {  
     
    int num;

    System.out.println("Enter number for odd or even");
    Scanner scan=new Scanner(System.in);
       num=scan.nextInt();

    if(num%2==0)
       {
        System.out.println(num+" is an even number");
       }
   else
       {
        System.out.println(num+" is an odd number");
       }
   }
}