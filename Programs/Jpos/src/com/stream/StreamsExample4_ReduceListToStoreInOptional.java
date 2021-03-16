package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsExample4_ReduceListToStoreInOptional {
 
    public static void main(String[] args) {
 
           List<String> StringList = new ArrayList<>();
           
           StringList.add("a");    
           StringList.add("b");    
           StringList.add("a");    
           // In one line display all distinct records in stream
 
           Stream<String> stream = StringList.stream(); // Convert list (ArrayList) of String to stream
 
           //Reduce list to store it in Optional
           System.out.println("1.Reduce list to store it in Optional");
           //A container object may or may not contain a non-null value
           Optional<String> optional = stream.
        		   						sorted().
                                       reduce((s1, s2) -> s1 + "," + s2); //reduce() method will reduce stream to - ad,ank,az,neh,sam
 
           //Display optional
           System.out.println(optional.isPresent()); //isPresent() will return true - If a value is present
           //OR
           System.out.println(optional.get()); //get() returns the value.
           
    }
 
}