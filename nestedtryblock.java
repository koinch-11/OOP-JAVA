class nestedtryblock{
      public static void main(String[] args){
      try{
          try{
            int arr[]={4,3,7};
            System.out.println(arr[2]);
             }
          catch(ArrayIndexOutOfBoundsException i){
              System.out.println("out of the array limit");
             }
           int x=10,y=0,z;
           z=x/y;
           System.out.println(z);
          }
      catch(ArithmeticException j){   
          System.out.println("not divide by zero");
         }
   }
}     