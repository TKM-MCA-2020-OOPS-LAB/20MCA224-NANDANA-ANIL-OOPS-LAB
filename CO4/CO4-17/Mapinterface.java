package javaproject;
import java.util.*;

public class Mapinterface
{
	public static void main(String args[])
    {
       
        Map<Integer, String> hm1 = new HashMap<>();
  
   //Inserting elements..   
        hm1.put(1, "Anitha");
        hm1.put(2, "Beena");
        hm1.put(3, "Chaithanya");
        System.out.println("Initial Map: "+ hm1);
        
        hm1.put( (2), "Nandana");
        hm1.put((4), "Ganga");
        //Updating..
        System.out.println("Updated Map " + hm1);
  
        //Removing..
        hm1.remove(4);
  
        // Final Map..
        System.out.println("After Removing 4th entry, Final Map  is : "+hm1);
    
    }
}
