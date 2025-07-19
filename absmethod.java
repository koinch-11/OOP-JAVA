abstract class programmer{
   public abstract void developer();
   public abstract void rank();
 }
abstract class java extends programmer{
  @Override
  public void developer(){
        System.out.println("james gosling");
    }
}
class oop extends java{
   @Override
   public void rank(){
        System.out.println("1");
   }
}
class absmethod{
     public static void main(String[] args){
      oop o=new oop();
      o.developer();
      o.rank();
   }
}