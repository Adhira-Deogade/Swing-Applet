package study_package;

import java.io.*;
import java.util.*;

public class question3 {
	public static void main(String args[]) throws IOException, ClassNotFoundException {


		 FileOutputStream f0 = null;
		
		 
		 try (ObjectOutputStream o1 = new ObjectOutputStream(new FileOutputStream("newfile2.txt"))){
			 List<String> list = new ArrayList<String>();
			 
			list.add("31");
			list.add("52");
			 list.add("41");
			 
			 System.out.println("List elements: "+ list);
			 for(int i=0;i<list.size();i++)
				 System.out.println("List elements: "+list.get(i));
			 
			 
			 for(String item: list) 
			 {
				//f0.write(list.get(i));
				o1.writeObject(item);
				 
			 }
		 }catch(IOException e) {
			 System.out.println("Error");
		 }
		 finally {if (f0!=null) f0.close();}

 FileInputStream f1=null;
 
		 
		 try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/Adhira/eclipse-workspace/Study/newfile2.txt"))){
			 String abc;
			 
			 System.out.println("String:" );
				 for(int i=0;i<3;i++) {
					 abc = (String) ois.readObject();
					 System.out.println(abc);
				 }
				 
				 ois.close();
		 }catch(IOException e) {
			 System.out.println("Error2");
		 }
		 finally {if (f1!=null) f1.close();}
				 
				 
	}

}

