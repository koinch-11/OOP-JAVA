class upperpointerex{
     public static void main(String[] args){
          String s="rohit";
          try{
              System.out.println(s.toUpperCase());
             }
          catch(NullPointerException e)
            {
             System.out.println("null cant be uppercase" );
           }
  }
}