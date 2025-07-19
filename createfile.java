import java.io.*;
class createfile{
      public static void main(String[] args) throws IOException{
         File e=new File("C:\\Users\\frontier\\Desktop\\filehanding\\create file");
       if(e.createNewFile()){
          System.out.println("Created file succesfully");}
       else{
          System.out.println("already file create");}
  }
}