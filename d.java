class A
{
  int a; String b; Boolean c;
  A()
  {
    a=20; b="ocean"; c=true;
  }
  void Disp()
   {
    System.out.print(a+" "+b+" "+c);
   }
}
class d
  {
    public static void main(String[] args){
    A r=new A();
    r.Disp();
  }
}
