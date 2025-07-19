class multiplecatchblock{
     public static void main(String[] args){

         try{
           
            int x[]={12,23,43,45,65};
            System.out.println(x[4]);

            String s="ocean";
            System.out.println(s.toUpperCase());

            int a=10,b=3,c;
            c=a+b;
            System.out.println("Addition:"+c);

            }

         catch(NullPointerException i){
             System.out.println("not supported to uppercase");
             }

         catch(ArrayIndexOutOfBoundsException j){
             System.out.println("out of array index");
              }

        catch(Exception k){
            
             System.out.println("arithmetic exception");
             }
     }
}