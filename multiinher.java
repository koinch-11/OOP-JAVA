class A {
     int a,b,c;
     void add()
      {
       a=4; b=7; 
       c=a+b;
       System.out.println("Addition of a and b is " +c);
       }
      void sub()
       {
        a=5; b=3;
        c=a-b;
        System.out.println("Subract of a and b is " +c);
       }
}
class B extends A {
       void multi()
        {
        a=5; b=3;
        c=a*b;
        System.out.println("Multiple of a and b " +c);
        }
       void div()
        {
        a=6; b=3;
        c=a/b;
        System.out.println("Divition of a and b " +c);
  }
}
class C extends B{
        void rem() {
        a=5; b=3;
        c=a%b;
        System.out.println("Remainder of a and b " +c);
        }
}


class multiinher{
       public static void main(String[] args){
        C ocean=new C();
        ocean.add();
        ocean.sub();
        ocean.multi();
        ocean.div();
        ocean.rem();
      }
}