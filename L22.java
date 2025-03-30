 class L22{
  public static void main(String[] args) {  
    
    int[] numbers= {1,13,14,25,16,30,19,20};
    
    int a = numbers[0];
    int b = numbers[0];


    for(int i=0;i<numbers.length;i++)
     {
    if(numbers[i]>a)
       {
         a= numbers[i];
       }
    else if(numbers[i]<b)
       {
         b = numbers[i];
       }
     }
      System.out.println("Largest number:" +a);
      System.out.println("Smallest number:" +b);
   }
}
