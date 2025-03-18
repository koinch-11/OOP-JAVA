import java.util.Scanner;
class L18
 {
  public static void main(String[] args) {  
     
    int i,n,f=1;

    System.out.println("Enter any number:");
    Scanner scan=new Scanner(System.in);
       n=scan.nextInt();

    for(i=1;i<=n;i++)
      {
        f=f*i;
       }
       System.out.println("factorial:"+f);

    }
}