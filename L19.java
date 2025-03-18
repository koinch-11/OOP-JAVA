import java.util.Scanner;
class L19
 {
  public static void main(String[] args) {  
     
    int i,n,a=0,b=1,c;

    System.out.println("Enter term:");
    Scanner scan=new Scanner(System.in);
       n=scan.nextInt();

    for(i=1;i<=n;i++)
      {
        c=a+b;
        a=b;
        b=c;
       
       System.out.print(a+" ");
     }
   }
}
