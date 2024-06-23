package java_codes.collection.list.ArrayList;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

//In the output of deserialization, we are getting the same elements which are added to the 
	//ArrayList during serialization.
public class ArrayListDeserialization {
    @SuppressWarnings("unchecked")
	public static void main(String args[]) {
        // ArrayList instantiation
        ArrayList<String> list = new ArrayList<String>();        
        try {
           FileInputStream fileIS = new FileInputStream("inputfile");
           ObjectInputStream objIS = new ObjectInputStream(fileIS);
           list = (ArrayList<String>) objIS.readObject();
           objIS.close();
           fileIS.close();
        } 
        catch(IOException ex) {
           ex.printStackTrace(); 
           return;
        }
        catch(ClassNotFoundException ex2) {
           System.out.println(" Class Not Found Exception");
           ex2.printStackTrace();
           return;
        }
        // Printing the ArrayList
        for(String s : list) {
          System.out.println(s);
        }    
      }
  }