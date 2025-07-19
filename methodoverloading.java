class A{
    int a,b,c;
   void add(){
    a=10;b=5; 
    c=a+b;
    System.out.println(c);
  }
  void add(int x,int y){
    int c;
    c=x+y;
    System.out.println(c);
  }
   void add(int i,double j){
    double c; 
    c=i+j;
    System.out.println(c);
  }
}
class methodoverloading{
   public static void main(String[] args){
       A w=new A();
       w.add();
       w.add(20 , 30);
       w.add(15,32.5);
   }
}