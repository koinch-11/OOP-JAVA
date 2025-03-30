class L23
     {
      public static void main(String[] args) {  
    
    int[] numbers= {14,25,16,30,20};
    int n = numbers.length;
    float average;
    int sum = 0;

    for(int i=0; i<n; i++)
       {
        sum = sum + numbers[i];
       }
      System.out.println("Sum of an array element:" +sum);

       average = sum / n;

      System.out.println("Average of an array element:" +average);
   }
}
