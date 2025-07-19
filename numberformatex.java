class numberformatex{
      public static void main(String[] args){
      String s="kudoku";
      try{
          int i=Integer.parseInt(s);
          System.out.println(i);
         }
      catch(NumberFormatException e){
           System.out.println("String cant be interger");
         }
          System.out.println("yahoo!");
  }
}