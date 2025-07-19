class a
    {
      int roll,marks;
      String name; 
   void input()
       {
        System.out.println("enter your name roll and marks:");
       }
}
class inher extends a
       {
    void show()
         {
        roll=4; marks=20; name="Tetsu";
        System.out.println(roll+" "+marks+" "+name);
       }
      public static void main(String[] args){
         inher o=new inher();
         o.input();
         o.show();
   }
}