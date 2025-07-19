class InvalidAgeException extends Exception{
      InvalidAgeException(String s){
        System.out.println(s);
      }
}
class userdefine{
      public static void main(String[] args){
           try{
         show(20);
         }
      catch(Exception e){
         System.out.println(e);   
       }
}
   public static void show(int age) throws InvalidAgeException{
       if(age<18){
         throw new InvalidAgeException("not eligible for vote");
           }
       else{
         System.out.println("eligible for vote.");
        }
    }
}