import java.util.Scanner;
class L10
 {
  public static void main(String[] args) {  
     
    int marks;

    System.out.println("Enter number");
    Scanner scan=new Scanner(System.in);
       marks=scan.nextInt();

    if(marks>=90)
       {
        System.out.println(marks+" is an Excellent grade A");
       }
   else if(marks>=80)
       {
        System.out.println(marks+" is a very good grade B");
       }
   else if(marks>=70)
       {
        System.out.println(marks+" is a good grade C");
       }
   else if(marks>=60)
       {
        System.out.println(marks+" is a satisfactory  grade D");
       }
   else if(marks>=50)
       {
        System.out.println(marks+" is a work hard grade E");
       }
   else if(marks>=40)
       {
        System.out.println(marks+" is a just passed grade F");
       }

   else
       {
        System.out.println(marks+" is a failed");
       }
   }
}