import java.io.*;
class Dirlist{
      public static void main(String[] args) throws IOException{
         String dirname="java";//("C:\\Users\\frontier\\Desktop\\filehanding\\directory file")
         File e=new File(dirname);

       if(e.isDirectory()){
          System.out.println("Directory of"+dirname);
          String a[]= e.list();
 
         for(int i=0;i<a.length;i++)
           File e=new File(dirname+"/"+a[i])  
        
          if(e.isDirectory()){
          System.out.println(a[i]+" is a directory.);
        }

       else{
          System.out.println(dirname+"is not a directory.");
        }
   }
}