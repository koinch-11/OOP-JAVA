import java.util.Scanner;
class L21
 {
  public static void main(String[] args) {  
     
    int i,n,count=0;

    System.out.println("Enter number:");
    Scanner scan=new Scanner(System.in);
       n=scan.nextInt();

    for(i=1;i<=n;i++)
      {
        if(n%i==0)
          {
            count++;     
          }
       }
    if(count==2)
         System.out.println("It is a prime number");
    else
         System.out.println("It is not a prime number");

      }
   
}