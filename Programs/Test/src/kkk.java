
// Java program to find LCM of two numbers. 
public class kkk 
{ 
	// Recursive method to return gcd of a and b 
	static int gcd(int a, int b) 
	{ 
	if (a == 0) 
		return b; 
	return gcd(b % a, a); 
	} 
	
	// method to return LCM of two numbers 
	static int lcm(int a, int b) 
	{ 
		return (a*b)/gcd(a, b); 
	} 
	
	// Driver method 
	public static void main(String[] args) 
	{ 
		int a = 7146, b = 5118; 
		System.out.println("LCM of " + a +" and " + b + " is " + lcm(a, b)); 
	} 
} 

