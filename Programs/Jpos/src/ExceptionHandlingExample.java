public class ExceptionHandlingExample {  
public static void main(String args[])  
{  
	 String s1 = new String("Sharma is a good player");  
     String s2 = new String("Sharma is a good player");  
     String s3 = s1.intern();
     String s4 = s2.intern();
     System.out.println(s3==s4);  
}  
}  