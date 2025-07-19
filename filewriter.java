import java.io.*;
class filewriter{
      public static void main(String[] args) throws IOException {
    
     FileWriter f=new FileWriter("C:\\Users\\frontier\\Desktop\\filehanding\\create file");
            try{
               f.write("hello! Im under the water.");    
               }   
           finally{
               f.close();
               }
              System.out.println("closed");
        }
 
}