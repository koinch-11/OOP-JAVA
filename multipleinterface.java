interface A{
    void show();
}
interface B{
    void disp();
}
class multipleinterface implements A,B{
    public void show(){
    System.out.println("interface A");
}
    public void disp(){
    System.out.println("interface B");
}
   public static void main(String[] args){
   multipleinterface m=new  multipleinterface();
   m.show();
   m.disp();
  }
}