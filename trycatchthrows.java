class trycatchthrows{
      public static void disp() throws InterruptedException{
         int i;
         for(i=1;i<=10;i++){
            Thread.sleep(500);
            System.out.print(i); 
                 
     }
}
      public static void main(String[] args){
          try{
           disp();
           System.out.println();
           System.out.print(10/0);
            }
          catch(Exception a){
           System.out.println("Lets Go");
           }
     }
}