class arithmeticex{
     public static void main(String[] args){
      System.out.println("hello");
      int a=10,b=0,c;
      try{
          c=a/b;
          System.out.println(c);
          }
      catch(ArithmeticException e){
          System.out.println("not divide by zero");
         }
         System.out.println("bye");
  }
}