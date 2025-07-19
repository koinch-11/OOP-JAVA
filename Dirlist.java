import java.io.*;
class Dirlist{
      public static void main(String[] args) throws IOException{
         String dirname="java";//("C:\\Users\\frontier\\Desktop\\filehanding\\directory file")
         File e=new File(dirname);

       if(e.isDirectory()){
          System.out.println("Directory of"+dirname);
          String s[]= e.list();
 
         for(int i=0;i<s.length;i++)
           File r=new File(dirname + "/" +s[i]); 
        
          if(r.isDirectory()){
          System.out.println(s[i]+" is a directory.");
        }
      }
       else{
          System.out.println(dirname+"is not a directory.");
        }
   }
}