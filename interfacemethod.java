interface customer{
    void shoes();
    void lesh();
}
abstract class seller implements customer{
    @Override
    public void shoes()
       {
        System.out.println("order 3 shoes");
       }
}
class main extends seller{
    public void lesh()
       {
        System.out.println("with 3 leshes");
       }
}

class interfacemethod{
    public static void main(String[] args){
      main m=new main();
      m.shoes();
      m.lesh();
  }
}