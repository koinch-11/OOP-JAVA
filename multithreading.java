                //multithreading by using implements//
class A implements Runnable{
     
      public void run(){
      System.out.println("Aaaa");
     }
}
class multithreading{
      public static void main(String[] args){
          A a=new A();
          Thread t=new Thread(a);
          t.start();
       System.out.println("Bbbb");
   }
}