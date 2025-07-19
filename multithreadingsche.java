class A implements Runnable{
      Thread t;
      String name;
      A(String threadname){
        name = threadname;
        t =new Thread(this.name);
      }
      public void run(){
          try{
          int i;

          for(i=1; i<=5; i++){
          System.out.println(name+"thread"+i+" is running..");

          Thread.sleep(1000);
            }
       }
         catch(InterruptedException e){
           System.out.println(e);
         }
    }  
}
class multithreadingsche{
      public static void main(String[] args){
         A a1=new A("ujwal");
         A a2=new A("sovit");
         A a3=new A("ashim");
     
         Thread a=new Thread(a1);
         Thread b=new Thread(a2);
         Thread c=new Thread(a3);

         a.start();
         b.start();
         c.start();
         
          try{
          int i;

          for(i=1; i<=5; i++){
          System.out.println("Main thread"+i+" is running..");

          Thread.sleep(1000);
            }
       }
         catch(InterruptedException e){
           System.out.println(e);
         }
      System.out.println("Existing main thread");
    }

  
}