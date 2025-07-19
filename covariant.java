class A{
    A show(){
    System.out.println("covariant");
     return this; //this --> new A()
   }
}
class B extends A{
     @Override
     B show(){
     super.show();
     System.out.println("return data type");
     return this;
  }
}
class covariant{
     public static void main(String[] args){
      B b=new B();
      b.show();
  }
}