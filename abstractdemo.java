abstract class fruits{
       fruits(){
        System.out.println("colour of fruits");
      }
       public abstract void colour();

}
class apple extends fruits{
        apple(){
        super();
        }
        public void colour(){
              System.out.println("Apple is red");
   }
}
class mango extends fruits{
         public void colour(){
             System.out.println("Mango is yellow");
   }
}
class abstractdemo{
     public static void main(String[] args){
           apple a=new apple();
           mango m=new mango();
           a.colour();
           m.colour();
  }
}