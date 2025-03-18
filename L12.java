import java.util.Scanner;
class L12
 {
  public static void main(String[] args) {  
     
    int a,b,c;

    System.out.println("Enter number");
    Scanner scan=new Scanner(System.in);
       a=scan.nextInt();
 
    System.out.println("Enter number");
       b=scan.nextInt();

    System.out.println("Enter number");
          c=scan.nextInt();


    if(a>b)
       {
        if(a>c)
            System.out.println(a);
        else
            System.out.println(c);
       }

   else
       {
        if(b>c)
            System.out.println(b);
        else
            System.out.println(c);
       }

   }
}