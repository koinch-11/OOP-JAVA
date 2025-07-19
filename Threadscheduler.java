class A extends Thread{
     
     public void run(){
       int i;
       String n=Thread.currentThread().getName();
       for(i=1; i<=3; i++){
       System.out.println(n);
       }
   }
}
class Threadscheduler{
      public static void main(String[] args){
         A a=new A();
         A b=new A();
         A c=new A();

         a.setName("a");
         b.setName("b");
         c.setName("c");
     
         a.start();
         b.start();
         c.start();
  
       int i;
       String n=Thread.currentThread().getName();
       for(i=1; i<=3; i++){
       System.out.println(n);
       }

        
     }
}