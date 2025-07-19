class A
   {
     int a,b;
    A(int x,int y)
      {
         a=x; b=y;
      }
    void show()
      {
       System.out.print(a" "+b);
      }
}
class P
   {
    public static void main(String[] args){
      A r=new A(30,40);
      r.show();
    }
}