class throwdemo{
      public static void main(String[] args){
       int a=10,b=0,c;
       c=a/b;
       //System.out.println(c);
       throw new ArithmeticException("/ by zero");
   }
}