import java.util.Scanner;
class L8
 {
  public static void main(String[] args) {  
     
    int num;

    System.out.println("Enter number for vote");
    Scanner scan=new Scanner(System.in);
       num=scan.nextInt();

    if(num>=18)
       {
        System.out.println(num+" is an eligible for vote");
       }
   else
       {
        System.out.println(num+" is not eligible for number");
       }
   }
}