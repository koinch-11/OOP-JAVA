class A
  {
    int a; double b; String c;
    A()
    {
     a=20; b=23.20; c="Ocean";
    }
    A(int x)
    {
     a=x;
    }
    A(double y,String z)
    {
     b=y; c=z;
    }
 }
class ctr
   {
    public static void main(String[] args){
     A r=new A();
     A r2=new A(23);
     A r3=new A(20.2,"ocean");
    System.out.println(r.a+" "+r.b+" "+r.c);
    System.out.println(r2.a);
    System.out.println(r3.b+" "+r3.c);
   }
}