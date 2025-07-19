class A{
    void input()
       {
        System.out.println("what is your name..?");
       }
}
class B extends A{
     void show()
       {
        System.out.println("my name is rohit sunuwar.");
       }
}
class C extends B{
      void disp()
       {
        System.out.println("My name is oshin rai.");
       }
}
class hierarchical{
      public static void main(String[] args){
      C oj=new C();
      oj.input();
      oj.show();
      oj.input();
      oj.disp();
     }
}