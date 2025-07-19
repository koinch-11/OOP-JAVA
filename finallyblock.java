class finallyblock{
     public static void main(String[] args){
       int a=10,b=2,c;
       try{
           c=a/b;
           System.out.println(c);
          }
       catch(ArithmeticException e){
           System.out.println("Exception");
          }
       finally{
           System.out.println("finally");
          }
           System.out.println("wooooooo");
    }
}