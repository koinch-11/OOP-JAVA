class pvt
  {
    int a; Double b; String c;
    private pvt()
      {
        a=3; b=3.14; c="pie";
       System.out.println(a+" "+b+" "+c);
     }
    public static void main(String[] args){
         pvt r=new pvt();
  }
}