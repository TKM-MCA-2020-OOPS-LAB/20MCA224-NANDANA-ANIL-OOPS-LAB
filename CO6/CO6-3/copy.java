import java.io.*; 
class copy{ 
      public static void main(String args[])throws IOException { 
               FileInputStream fr =new FileInputStream("name.txt"); 
               FileOutputStream fw=new FileOutputStream("new.txt") ; 
               System.out.println("****Successfully copied****"); 
               int c; 
               while((c=fr.read())!=-1) 
               fw.write((char)c); 
               fr.close(); 
               fw.close(); 
          } 
 } 