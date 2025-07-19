class nestedcatchblock{
      public static void main(String[] args){
       try{
           int a=10,b=0,c;
           c=a/b;
          System.out.println(c); 
       }
       catch(ArithmeticException i){
           System.out.println("not divide by zero");
           try{
               String s="123";
               int in=Integer.parseInt(s);
               System.out.println(in);
               }
           catch(NumberFormatException j){
               System.out.println("string cant be integer");
               }
        }
  }
}