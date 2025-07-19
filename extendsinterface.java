import java.util.Scanner;
interface kudoku{
     void add();
}
interface tetsu extends kudoku{
     void sub();
}
class Rohit implements tetsu{
       @Override
       public void add(){ 
       int a,b,c;
       Scanner s=new Scanner(System.in);

       System.out.println("Enter two number for additon:");
       a=s.nextInt();
       b=s.nextInt();
       c=a+b;
       System.out.println("Addition:"+c);
}
       @Override
       public void sub(){
       int a,b,c;
       Scanner s=new Scanner(System.in);

       System.out.println("Enter two number for subtraction:");
       a=s.nextInt();
       b=s.nextInt();
       c=a-b;
       System.out.println("Subraction:"+c);
   }
}
class extendsinterface{
      public static void main(String[] args){
      Rohit r=new Rohit();
      r.add();
      r.sub();
  }
}
