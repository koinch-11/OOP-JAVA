import java.io.*;
class filedemo{
      static void p(String s){
      System.out.println(s);
     }
      public static void main(String[] args){
         File e=new File("C:\\Users\\frontier\\Desktop\\filehanding\\new file");
      
          p("File Name:"+e.getName());
          p("File Name:"+e.getPath());
          p("Location:"+e.getAbsolutePath());
          p("Parents:"+e.getParent());
          p(e.exists()? "exist":"does not exist");
  p(e.canWrite()? "is writable":"is not writable");
 p(e.canRead()? "is readable":"is not readable ");
          p("File sixe:"+e.length()+"Bytes");
        }
      
}