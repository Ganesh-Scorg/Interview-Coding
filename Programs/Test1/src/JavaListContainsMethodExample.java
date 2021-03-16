

import java.util.ArrayList;
import java.util.List;

public class JavaListContainsMethodExample {

    public static void main(String[] args) {

               
        //Make an array list of custom objects
        List<User> userList = new ArrayList<User>();
        userList.add(new User("ani22","bha","abcd@gg.com"));
        userList.add(new User("ani222","bha2","abcd2@gg.com"));
        userList.add(new User("ani222","bha5","abcd5@gg.com"));
        
        User user1= new User("ani","bha","abcd@gg.com");
        System.out.println("The list contains user with name ani bha and email id: abcd@gg.com : "+userList.contains(user1));
        		
        for(int i=0;i<userList.size();i++)
        {
        	User user =userList.get(i);
        	for(int j=i+1;j<userList.size();j++)
        	{
        		User user11= userList.get(j); 
        		if(user.getFirstName().equals(user11.getFirstName()))
        		{
        			System.out.println(user);
        			System.out.println(user11);
        		}
        	}
        }
      
    }

}
