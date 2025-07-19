class A{
     int a;
   void input(){
     a=10;
    System.out.println(a);
   }
}
class B extends A{
     int a=5;
     void show(){
     super.input();
     System.out.println(a);
    }
}
class superdemo{
    public static void main(String[] args){
     B r=new B();
     r.show();
   }
}