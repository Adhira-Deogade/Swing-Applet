package study_package;
//import java.awt.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class question2 {
	
//	class sorting implements Comparator<String>{
//		private Map<String, Integer> myMap;
//		
//		public sorting(Map<String, Integer> myMap)
//		{
//			this.myMap = myMap; 
//		}
//		
//		public int compare(String a, String b)
//		{
//			if(myMap.get(a)>myMap.get(b))
//				return 1;
//			else 
//				return -1;
//		}
//	}
	
	
	
	public static void main(String args[]) throws IOException {
		 String source = "a,b,c,d,b,c,a,b,b,c,d,e,d,d,e,e,a,b";
		 byte buf[] = source.getBytes();
		 OutputStream f0 = new FileOutputStream("data55.txt");
		   f0.write(buf);
		   f0.close();
		   
		  
		   BufferedReader reader = null;
		   

		   try {
		       File file = new File("data55.txt");
			   //File file = "data55.txt";
		       reader = new BufferedReader(new FileReader(file));

		       String line;
		       
		       while ((line = reader.readLine()) != null) {
		       
		    	   // Print on console    
		    	   System.out.println("line "+ line);
		           
		    	   // Write to list
		    	   String[] line3 = line.split(",");
		    	   ArrayList<String> mylist2 = new ArrayList<String>();
		    	   
		    	   for(int j =0;j<line3.length;j++) 
		    	   {
		    		   
		    		   mylist2.add(line3[j]);
		    	   }
		    	 	    	   
		    	   
		    	   //Reading from list		    	   
		    	   for (int i=0;i < mylist2.size();i++)
		    	   {
		    	     System.out.println("Value of element "+mylist2.get(i));
		    	   }

		    	   
		    	   // Changing to uppercase
		    	  for (int i=0;i < mylist2.size();i++)
		    	   {
		    		   
			    	   System.out.println("Uppercase "+mylist2.get(i).toUpperCase());
		    	   }
		    	  
		    	  // Printing number of strings 
		    	  System.out.println("Number of Strings = "+mylist2.size());
		    	   
		    	  // Counting frequency with hashset
		    	  // Creating a hashmap
		    	  System.out.println("\nExample 2 - Count all with frequency");
		    	  HashSet<String> uniqueSet = new HashSet<String>(mylist2);
		    	  HashMap<String,Integer> map=new HashMap<String,Integer>();  
		    	 
		    		for (String temp : uniqueSet) {
	
		    			System.out.print(temp + ": " + Collections.frequency(mylist2, temp));
		    			map.put(temp, Collections.frequency(mylist2, temp));
		       }
		    		
		    	// Printing hashmap
		    	System.out.println("My hashmap"+map);
		    	
		    	
		    	// Treemap sorting
		    	HashMap<Integer,String> reversedHashMap = new HashMap<Integer,String>();

		    	for (String i : map.keySet()) {
		    	    reversedHashMap.put(map.get(i), i);
		    	    
		    	}
//		       for(int i=0;i<5;i++) {
//		    	   System.out.println("\nSorted Map......By Key"+reversedHashMap.get(i));
//		       }
		       }
		    	
	    	//TreeMap<String, Integer> tree = new TreeMap<String, Integer>(sorting(mysort));
	    	
//		    	
//		    	 System.out.println("\nSorted Map......By Key"+ tree);		         


		   
//		       
		         
		    	
		       
		   } catch (IOException e) {
		       e.printStackTrace();
		   } finally {
		       try {
		           reader.close();
		       } catch (IOException e) {
		           e.printStackTrace();
		       }
		   }


}



	
	}
	
	
	
	
