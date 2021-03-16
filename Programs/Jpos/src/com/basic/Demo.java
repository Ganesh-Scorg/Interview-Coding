package com.basic;

interface TestInterfaces {
    public static void main(String a){    
        System.out.println("I am a static main method inside Inteface !!");
    }
}

class Demo_base {
   int value = 1000;
   Demo_base() {
      System.out.println("This is the base class constructor");
   }
}
class Demo_inherits extends Demo_base {
   int value = 10;
   Demo_inherits() {
      System.out.println("This is the inherited class constructor");
   }
}

class StaticMainDemo implements TestInterfaces
{
	public static void main(String a){    
        System.out.println("I am a static main method inside StaticMainDemo !!");
    }
}

public class Demo  {
	
   public static void main(String[] args) {
      
	   StaticMainDemo sobj = new StaticMainDemo();
	   sobj.main("Ganesh");
	   
	   Demo_inherits my_inherited_obj = new Demo_inherits();
      System.out.println("In the main class, inherited class object has been created");
      System.out.println("Reference of inherited class type :" + my_inherited_obj.value);
      Demo_inherits my_obj = (Demo_inherits) new Demo_base();
      System.out.println("In the main class, parent class object has been created");
      System.out.println("Reference of base class type : " + my_obj.value);
   }
}