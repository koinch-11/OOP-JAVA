class L14
 {
  public static void main(String[] args) {  
    
    int[] ar = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

    System.out.println("Even number in the integer array of size 20:");

    for(int i : ar)
     {
    if(i%2==0)
       {
        System.out.print(i+" ");
       }
     }
    System.out.println();

    System.out.println("Odd number in the integer array of size 20:");
      
    for(int i : ar)
     {
    if(i%2!=0)
       {
        System.out.print(i+" ");
       }
     }
   }
}