class lowpointerex{
     public static void main(String[] args){
          String s="ROHIT";
          try{
              System.out.println(s.toLowerCase());
             }
          catch(NullPointerException e)
            {
             System.out.println("null cant be lowercase" );
           }
  }
}