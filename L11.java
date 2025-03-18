import java.util.Scanner;
class L11
 {
  public static void main(String[] args) {  
     
    int num;

    System.out.println("Enter number");
    Scanner scan=new Scanner(System.in);
       num=scan.nextInt();

    if(num>=0)
       {
        System.out.println(num+" is positive number");
       }
   else
       {
        System.out.println(num+" is negative number");
       }
   }
}