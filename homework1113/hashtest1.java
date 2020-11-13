import  java.io.InputStream;
import  java.io.File;
import  java.io.FileInputStream;
import  java.security.MessageDigest;
import java.io.FileNotFoundException;
public class hashtest1{
      public static void main(String[] args){
    try{
    String path = "G:\\java";
    byte[] sha1 = fileHash(path);
    String code = "";
    for(int i = 0;i<sha1.length;i++){
       code += Integer.toString(sha1[i]& 0xff,16);
    }
      System.out.println(path + "is" + code);
     }
   catch (Exception e){
     e.printStackTrace();
   }

    }


   public static byte[] fileHash(String path){
      try{
         File file = new File(path);
         File[] fs = file.listFiles();
         java.util.Arrays.sort(fs);
         MessageDigest md =  MessageDigest.getInstance("SHA-1");
   
         byte[] buffer = new byte[1024];
         int length =0;
       
       for(int i = 0; i<fs.length; i++){
        if(fs[i].isFile()){
          System.out.println("file:"+ fs[i].getName() + " ");
        try{  
         File thisfile = new File(fs[i].getAbsolutePath());
         FileInputStream fis = new FileInputStream(thisfile);
        do{
              length = fis.read(buffer);
              if(length>0){
                 md.update(buffer,0,length);

              }
        }while(length != -1);
            fis.close();
               }
          catch(Exception e){
            e.printStackTrace();
          }
      

              }
           if(fs[i].isDirectory()){
             System.out.println("Directory:"+fs[i].getName());
            fileHash(path + File.separator + fs[i].getName());
           }
                }//for循环
                return md.digest();
        
          }
          catch(Exception e){
            e.printStackTrace();
            return null;
          }
   }//fileHash



}