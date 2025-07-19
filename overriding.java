class A{
   void show(){
    System.out.println("ocean");
  }
}
class B extends A{
    @Override
    void show(){
    super.show();
    System.out.println("oshin");
  }
}
class overriding{
    public static void main(String[] args){
        A ob=new B();
        ob.show();
  }
}
