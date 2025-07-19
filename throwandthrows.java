class throwandthrows{

      void show(double a,double b) throws ArithmeticException{

          if(b==0){
             throw new ArithmeticException();
             }
          else{
              double c;
              c=a/b;
             System.out.println(c);
           }
}
      public static void main(String[] args){
           throwandthrows t=new throwandthrows();
          try{
           t.show(50,15);
          }
         catch(ArithmeticException z){
           System.out.println("the value of b is 0.");
           }
      }
}