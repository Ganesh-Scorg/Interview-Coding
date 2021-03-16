package com.adyen;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serilzation implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int a;
	person p;
	
	
	public serilzation(int a, person p) {
		super();
		this.a = a;
		this.p = p;
	}
	
	
	public static void main(String[] args) {
		serilzation serilzation = new serilzation(1, new person(1, "deepak"));
		
		String filename = "file.ser"; 
        
        // Serialization  
        try
        {    
            //Saving of object in a file 
            FileOutputStream file = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
            // Method for serialization of object 
            out.writeObject(serilzation); 
              
            out.close(); 
            file.close(); 
              
            System.out.println("Object has been serialized"); 
  
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
        
        serilzation object1=null;
        
        try
        {    
            // Reading the object from a file 
            FileInputStream file = new FileInputStream(filename); 
            ObjectInputStream in = new ObjectInputStream(file); 
              
            // Method for deserialization of object 
            object1 = (serilzation)in.readObject(); 
              
            in.close(); 
            file.close(); 
              
            System.out.println("Object has been deserialized "); 
            
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
          
        catch(ClassNotFoundException ex) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
        } 
  
        
        
        
		
	}
	
	
	
	

}


class person implements Serializable{
	public person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	int id;
	String name;
}