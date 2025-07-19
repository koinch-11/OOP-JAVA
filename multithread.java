class A extends Thread {
        
        public void show(){
          
         try{
          int i;

          for(i=1; i<=5; i++){
          System.out.println("Rohit");

          Thread.sleep(1000);
            }
       }
       
         catch(InterruptedException e){
           System.out.println(e);
         }
    }
}
class multithread{
    public static void main(String[] args)throws InterruptedException {
        A t=new A();
        t.show();
        int i;
        for(i=1; i<=5; i++){
          System.out.println("Tetsu");
          Thread.sleep(1000);
        }

   }
}