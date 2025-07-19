class A{
     private int value; //data hiding
    
     public void setValue(int x){
           value=x;
     }
     public int getValue(){
       return ++value;          
   }
}
class encap{
     public static void main(String[] args){
          A r=new A();
          r.setValue(10);
          System.out.println(r.getValue());
    }
}