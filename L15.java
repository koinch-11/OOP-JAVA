import java.util.Scanner;
class L15
 {
  public static void main(String[] args) {  
     
    int i,num;

    System.out.println("Enter number for multiplication from 1 to 20:");
    Scanner scan=new Scanner(System.in);
       num=scan.nextInt();

    for(i=1;i<=10;i++)
      {
         System.out.println(num+"*"+i+"="+(num*i));
      }
   }
}