class throwsdemo{
     public static void main(String[] args) //throws InterruptedException
          {
           int i;
           for(i=10;i>=1;i--){
           try{
               Thread.sleep(500);
               System.out.println(i);
              }
          catch(InterruptedException a){
               System.out.println(a);
           }
      }
   }
}