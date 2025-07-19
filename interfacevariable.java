interface customer{
    int a=10;
    void purchase();
}
class seller implements customer{
    @Override
    public void purchase()
       {
        System.out.println(a);
       }
}
class interfacevariable{
    public static void main(String[] args){
      customer c=new seller();
      c.purchase();
  }
}