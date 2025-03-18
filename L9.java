import java.util.Scanner;
class L9
 {
  public static void main(String[] args) {  
     
    int num;

    System.out.println("Enter number");
    Scanner scan=new Scanner(System.in);
       num=scan.nextInt();

    if(num>=96)
       {
        System.out.println(num+" is fever according to thermometer");
       }
   else
       {
        System.out.println(num+" is not fever according to thermometer");
       }
   }
}