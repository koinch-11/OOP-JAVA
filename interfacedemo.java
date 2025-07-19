import java.util.Scanner;
interface client{
    void input();
    void output();
}
class interfacedemo implements client{

    String name; double marks; int id;

    public void input(){
      Scanner s=new Scanner(System.in);
      System.out.println("Enter your name:");
      name=s.nextLine();

      System.out.println("Enter your marks:");
      marks=s.nextDouble();

      System.out.println("Enter your id:");
      id=s.nextInt();
   }
   public void output(){
      System.out.println("Name:"+name);
      System.out.println("Marks:"+marks);
      System.out.println("Id:"+id);
    }
   public static void main(String[] args){
      client c=new interfacedemo();
      c.input();
      c.output();
  }
}