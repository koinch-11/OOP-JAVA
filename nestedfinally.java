class nestedfinally{
      public static void main(String[] args){
            int a=10,b=0,c;
        try{
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException i){
            System.out.println("not divide by zero");
        }
        finally{
            System.out.println("yooooo");
             try{
                 int arr[]={1,2,3,4,5};
                 System.out.println(arr[2]);
                }
             catch(ArrayIndexOutOfBoundsException j){
                 System.out.println("out of bounds");
                }
             finally{
                 System.out.println("konichiwa");
             }
            System.out.println("main method ended");
     }
   }
}