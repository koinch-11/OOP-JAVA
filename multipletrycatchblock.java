class multipletrycatchblock{
         public static void main(String[] args){
           int a=23,b=12,c;
           try{
               c=a+b;
               System.out.println(c);
               }
           catch(ArithmeticException x){
               System.out.println("Exception");
               }
            try{
                int z[]={3,6,9,6,2};
                System.out.println(z[3]);
                }
            catch(ArrayIndexOutOfBoundsException y){
                System.out.println("out of the array limit");
               }
            System.out.println("yaaaaaahoooooooo!");

     }
}           