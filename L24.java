import java.util.Scanner;
class L24
     {
      public static void main(String[] args) {
  
    int i,j;
    int a[][] = new int [3][3];
    int b[][] = new int [3][3];
    int c[][] = new int [3][3];

    Scanner r=new Scanner(System.in);
    System.out.println("Enter first matrix element:");

    for(i=0; i<3; i++)
       {
        for(j=0; j<3; j++)
            {
             a[i][j]=r.nextInt();
            }
       }

    System.out.println("Enter second matrix element:");

    for(i=0; i<3; i++)
       {
        for(j=0; j<3; j++)
            {
             b[i][j]=r.nextInt();
            }
       }

      System.out.println("first matrix:");

    for(i=0; i<3; i++)
       {
        for(j=0; j<3; j++)
            {
              System.out.println(a[i][j]+" ");
            }
              System.out.println();
       }

     System.out.println("Second matrix:");

    for(i=0; i<3; i++)
       {
        for(j=0; j<3; j++)
            {
             System.out.println(b[i][j]+" ");
            }
              System.out.println();
       }
        
      System.out.println("Sum of 3x3 matrix :");

    for(i=0; i<3; i++)
       {
        for(j=0; j<3; j++)
            {
             c[i][j]=a[i][j]+b[i][j];
             System.out.println(c[i][j]);
            }
             System.out.println();
       }
   }
}
